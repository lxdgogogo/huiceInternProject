package com.huice.service_fdk.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录上下文
 * </p>
 * !!!注意：本上下文中存储的 ThreadLocal 值必须在 remove() 方法中清除 ！！！
 *
 * @author wendiyou
 * @date 2021-06-03
 */
@Slf4j
public class AuthContext {

    private static final ThreadLocal<Long> USER_ID = new ThreadLocal<>();
    private static final ThreadLocal<String> USER_NAME = new ThreadLocal<>();
    private static final ThreadLocal<Byte> ROLE_TYPE = new ThreadLocal<>();

    public static String getRequestParameter(String parameterName) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (requestAttributes instanceof ServletRequestAttributes) {
            HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
            String value = request.getParameter(parameterName);
            //修复null字符串的bug 生产环境的bug  如果用户名称 为null字符串会有bug
            String nullStr = "null";
            if (nullStr.equals(value) || org.springframework.util.StringUtils.isEmpty(value)) {
                return null;
            }
            return value;
        }
        return null;
    }

    public static void setUserId(Long userId) {
        USER_ID.set(userId);
    }

    public static Long getUserId() {
        return USER_ID.get();
    }

    public static void setUserName(String userName) {
        USER_NAME.set(userName);
    }

    public static String getUserName() {
        return USER_NAME.get();
    }

    public static void setRoleType(Byte roleType) {
        ROLE_TYPE.set(roleType);
    }

    public static Byte getRoleType() {
        return ROLE_TYPE.get();
    }

    /**
     * 清除资源
     */
    public static void remove() {
        USER_ID.remove();
        USER_NAME.remove();
        ROLE_TYPE.remove();
    }
}
