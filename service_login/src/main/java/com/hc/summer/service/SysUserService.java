package com.hc.summer.service;

import com.hc.summer.common.AuthContext;
import com.hc.summer.common.ErrorCode;
import com.hc.summer.common.Result;
import com.hc.summer.common.constant.SysUserStatus;
import com.hc.summer.common.exception.ApplicationBaseException;
import com.hc.summer.dao.SysRoleDao;
import com.hc.summer.dao.SysUserDao;
import com.hc.summer.db.tables.records.SysRoleRecord;
import com.hc.summer.db.tables.records.SysUserRecord;
import com.hc.summer.pojo.LoginResult;
import com.hc.summer.pojo.SysFunctionDO;
import com.hc.summer.pojo.UserDO;
import com.hc.summer.pojo.login.LoginParam;
import com.hc.summer.util.JwtUtil;
import com.hc.summer.util.PBKDF2Util;
import com.hc.summer.util.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName
 * @Description
 * @Author caoruiqi
 * @Date 2021/7/6 11:08
 */
@Service
@Slf4j
public class SysUserService {
    /**
     * 用户登录token前缀
     */
    public static final String USER_LOGIN_TOKEN_PREFIX = "user:login:token:";

    @Resource
    private PBKDF2Util pbkdf2Util;
    @Resource
    private SysUserDao sysUserDao;
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private RedisUtils redisUtils;

    public LoginResult login(LoginParam param, HttpServletRequest request) throws Exception {
        SysUserRecord userRecord = this.sysUserDao.queryByLoginPhone(param.getPhone());
        if (userRecord == null) {
            throw new ApplicationBaseException(ErrorCode.USER_LOGIN_ERROR);
        }
        if (SysUserStatus.DELETED.getK().equals(userRecord.getDeleteFlag())) {
            throw new ApplicationBaseException(ErrorCode.USER_ACCOUNT_WAITING_AUDIT);
        }
        String loginPassword = pbkdf2Util.getEncryptedPassword(param.getPassword(), userRecord.getSalt());
        if (!Objects.equals(loginPassword, userRecord.getPassword())) {
            throw new ApplicationBaseException(ErrorCode.USER_LOGIN_ERROR);
        }

        SysRoleRecord roleRecord = this.sysRoleDao.getUserRoleByUserId(userRecord.getId());
        if (roleRecord == null) {
            throw new ApplicationBaseException(ErrorCode.USER_ROLE_NOT_EXIST);
        }

        //token需要重新放至缓存redis中；拦截器也需要判断这个token是否在缓存中；
        String token = JwtUtil.genJwt(
                new UserDO().setUserId(userRecord.getId())
                        .setUserName(userRecord.getUserName())
                        .setRoleId(roleRecord.getId())
                        .setRoleType(roleRecord.getType()));

        long tokenRefreshSeconds = 24 * 60 * 60;
        redisUtils.setEx(USER_LOGIN_TOKEN_PREFIX + userRecord.getId(),tokenRefreshSeconds, token);

        return new LoginResult()
                .setUserId(userRecord.getId())
                .setUserName(userRecord.getUserName())
                .setUserPhone(userRecord.getUserPhone())
                .setRoleType(roleRecord.getType())
                .setToken(token);
    }

    public Result getFunctionListByToken() {
        Long userId = AuthContext.getUserId();
        log.info("getFunctionListByToken userId :{}",userId);
        //获取用户角色  获取用户信息 如果用户为销售商或者供货商 使用RoleId查询功能列表
        if (userId == null) {
            return Result.error(2001,"获取用户信息失败");
        }

        List<SysFunctionDO> functionList = sysUserDao.getFunctionList(userId);

        //获取树形结构的list
        functionList =  getFunctionTree(functionList);

        return Result.ok(functionList);
    }

    private LoginResult getUserByIdForLogin(Long userId) {
        return sysUserDao.fetchOneById(userId);
    }

    public static List<SysFunctionDO> getFunctionTree(List<SysFunctionDO> functionList) {
        //1.获取全部level为1的数据
        int rootLevel = 1;
        List<SysFunctionDO> rootFunctionList =
                functionList.stream().filter(i -> i.getFunctionLevel().intValue() == rootLevel).collect(Collectors.toList());
        List<SysFunctionDO> childrenList =
                functionList.stream().filter(i -> i.getFunctionLevel().intValue() != rootLevel).collect(Collectors.toList());
        rootFunctionList.forEach(r->{
            Long id = r.getId();
            Long mineId = 11L;
            String mingStr = "我的";
            if(r.getFunctionName().equals(mingStr)){
                mineId = r.getId();
            }
            if(r.getId().equals(mineId)|| r.getParentId().equals(mineId)){
                //我的 菜单默认是不选中
                r.setChecked(false);
            }
            r.setChildrenList(new ArrayList<>());
            for (SysFunctionDO child : childrenList) {
                if(child.getParentId().intValue() == id.intValue()){
                    r.getChildrenList().add(child);
                }
                if(child.getParentId().equals(mineId)){
                    //我的 菜单默认是不选中
                    child.setChecked(false);
                }
            }
        });

        rootFunctionList.sort(Comparator.comparingInt(SysFunctionDO::getSort));
        return rootFunctionList;
    }
}
