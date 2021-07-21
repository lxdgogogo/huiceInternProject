package com.hc.summer.filter;

import com.alibaba.fastjson.JSONObject;
import com.hc.summer.common.AuthContext;
import com.hc.summer.common.Result;
import com.hc.summer.config.IgnoreUrl;
import com.hc.summer.util.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 授权拦截
 * @author wendiyou
 * @创建时间 2020/10/26
 * @描述
 */
@Component
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {

    private static final String AUTHORIZE_TOKEN = "token";

    @Autowired
    private IgnoreUrl ignoreUrl;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        if (isIgnoreAPI(request)) {
            // 直接放行
            return true;
        }

        String token = request.getHeader(AUTHORIZE_TOKEN);
        if (StringUtils.isEmpty(token)) {
            authError(response, "未登录");
            return false;
        }
        try {
            Claims claimsBody = JwtUtil.getClaimsBody(token);

            AuthContext.setUserId(Long.valueOf(claimsBody.get("userId").toString()));
            AuthContext.setUserName(claimsBody.get("userName").toString());
            AuthContext.setRoleType(Byte.valueOf(claimsBody.get("roleType").toString()));
        } catch (Throwable throwable) {
            log.error(throwable.getMessage(),throwable);
            authError(response,"认证失败");
            return false;
        }

        return true;
    }

    /**
     * 认证错误输出
     */
    private void authError(HttpServletResponse resp,String message) throws IOException {
        //7. 响应中放入返回的状态吗, 没有权限访问
        resp.setStatus(HttpStatus.UNAUTHORIZED.value());

        resp.setHeader("Content-Type","application/json;charset=UTF-8");
        String json = JSONObject.toJSONString(Result.error(HttpStatus.UNAUTHORIZED.value(), message));
        resp.getWriter().print(json);
    }

    /**
     * 验证开放接口
     */
    private boolean isIgnoreAPI(HttpServletRequest servletRequest) {
        List<IgnoreUrl.Permission> list = ignoreUrl.getList();
        for (IgnoreUrl.Permission permission : list) {
            if (servletRequest.getRequestURI().contains(permission.getPath())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable Exception ex) {
        AuthContext.remove();
    }
}
