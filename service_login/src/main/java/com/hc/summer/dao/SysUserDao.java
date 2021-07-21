package com.hc.summer.dao;

import com.hc.summer.common.constant.SysUserStatus;
import com.hc.summer.db.tables.SysRoleFunction;
import com.hc.summer.db.tables.SysUserRole;
import com.hc.summer.db.tables.records.SysUserRecord;
import com.hc.summer.pojo.LoginResult;
import com.hc.summer.pojo.SysFunctionDO;
import com.hc.summer.pojo.UserDO;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.hc.summer.db.tables.SysFunction.SYS_FUNCTION;
import static com.hc.summer.db.tables.SysRoleFunction.SYS_ROLE_FUNCTION;
import static com.hc.summer.db.tables.SysUser.SYS_USER;
import static com.hc.summer.db.tables.SysUserRole.SYS_USER_ROLE;
import static java.util.Arrays.asList;
import static javafx.scene.input.KeyCode.F;

/**
 * 用户数据库层
 *
 * @author wendiyou
 * @date 2021-06-03
 */
@Repository
public class SysUserDao extends BaseDao {

    public SysUserRecord queryByLoginPhone(String loginPhone) {
        List<Byte> status = asList(SysUserStatus.DEFAULT.getK(), SysUserStatus.DELETED.getK());

        return this.db
                .select()
                .from(SYS_USER)
                .where(SYS_USER.USER_PHONE.eq(loginPhone))
                .and(SYS_USER.DELETE_FLAG.in(status))
                .fetchOneInto(SysUserRecord.class);
    }

    public LoginResult fetchOneById(Long id) {
        return this.db
                .select(SYS_USER.ID.as("userId"),
                        SYS_USER.USER_NAME,
                        SYS_USER.USER_PHONE
                )
                .from(SYS_USER)
                .where(SYS_USER.ID.eq(id))
                .fetchOneInto(LoginResult.class);
    }

    /**
     * 查询指定 userId 的菜单
     */
    public List<SysFunctionDO> getFunctionList(Long userId) {
        return db
                .select(SYS_FUNCTION.ID,
                        SYS_FUNCTION.FUNCTION_ICON,
                        SYS_FUNCTION.PARENT_ID,
                        SYS_FUNCTION.FUNCTION_URL,
                        SYS_FUNCTION.FUNCTION_NAME,
                        SYS_FUNCTION.FUNCTION_LEVEL,
                        SYS_FUNCTION.REMARK,
                        SYS_FUNCTION.SORT)
                .from(SYS_FUNCTION).innerJoin(SYS_ROLE_FUNCTION).on(SYS_FUNCTION.ID.eq(SYS_ROLE_FUNCTION.FUNCTION_ID))
                .innerJoin(SYS_USER_ROLE).on(SYS_USER_ROLE.ROLE_ID.eq(SYS_ROLE_FUNCTION.ROLE_ID))
                .where(SYS_USER_ROLE.USER_ID.eq(userId))
                .orderBy(SYS_FUNCTION.SORT)
                .fetchInto(SysFunctionDO.class);
    }
}
