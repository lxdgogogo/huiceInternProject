package com.hc.summer.controller;

import com.hc.summer.common.AuthContext;
import com.hc.summer.common.Result;
import com.hc.summer.pojo.LoginResult;
import com.hc.summer.pojo.login.LoginParam;
import com.hc.summer.service.SysUserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * 用户业务
 *
 * @author wendiyou
 * @date 2021-06-03
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户模块")
@Slf4j
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @ApiOperation(value = "sayHello")
    @PostMapping("/say/hello")
    public Result sayHello() {
        String message = "hello:"
                + " userId=" + AuthContext.getUserId()
                + " userName=" + AuthContext.getUserName()
                + " roleType=" + AuthContext.getRoleType();
        return Result.ok(message);
    }

    @ApiOperation(value = "用户登录", httpMethod = "POST")
    @ApiResponses({
                          //code重复的情况下，第一个声明的生效。
                          @ApiResponse(code = 200, message = "登录成功", response = LoginResult.class),
                          @ApiResponse(code = 500, message = "登录失败")
                  })
    @PostMapping("/login")
    public Result<LoginResult> userLogin(@RequestBody @Valid LoginParam param, HttpServletRequest request) throws Exception {
        return Result.ok(this.sysUserService.login(param, request));
    }

    @ApiOperation("用户菜单权限获取")
    @ApiImplicitParams({@ApiImplicitParam(name = "token", value = "登录的token值")})
    @ApiResponses({
                          @ApiResponse(code = 200, message = "获取用户的菜单权限"),
                          @ApiResponse(code = 500, message = "验证失败，跳转登录页面")
                  })
    @PostMapping("/listFunctions")
    public Result listFunctions() {
        return sysUserService.getFunctionListByToken();
    }
}
