/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db;


import com.hc.summer.db.tables.PlatformSku;
import com.hc.summer.db.tables.SysFunction;
import com.hc.summer.db.tables.SysRole;
import com.hc.summer.db.tables.SysRoleFunction;
import com.hc.summer.db.tables.SysShop;
import com.hc.summer.db.tables.SysUser;
import com.hc.summer.db.tables.SysUserRole;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in fdk_user2
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 平台货品SKU表|牛振宇|2020-11-03
     */
    public static final PlatformSku PLATFORM_SKU = PlatformSku.PLATFORM_SKU;

    /**
     * The table <code>fdk_user2.sys_function</code>.
     */
    public static final SysFunction SYS_FUNCTION = SysFunction.SYS_FUNCTION;

    /**
     * The table <code>fdk_user2.sys_role</code>.
     */
    public static final SysRole SYS_ROLE = SysRole.SYS_ROLE;

    /**
     * The table <code>fdk_user2.sys_role_function</code>.
     */
    public static final SysRoleFunction SYS_ROLE_FUNCTION = SysRoleFunction.SYS_ROLE_FUNCTION;

    /**
     * 平台店铺表，商家自主创建记录基本信息和授权信息
     */
    public static final SysShop SYS_SHOP = SysShop.SYS_SHOP;

    /**
     * The table <code>fdk_user2.sys_user</code>.
     */
    public static final SysUser SYS_USER = SysUser.SYS_USER;

    /**
     * The table <code>fdk_user2.sys_user_role</code>.
     */
    public static final SysUserRole SYS_USER_ROLE = SysUserRole.SYS_USER_ROLE;
}
