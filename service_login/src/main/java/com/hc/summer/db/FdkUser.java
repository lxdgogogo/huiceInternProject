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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FdkUser extends SchemaImpl {

    private static final long serialVersionUID = 1490128383;

    /**
     * The reference instance of <code>fdk_user</code>
     */
    public static final FdkUser FDK_USER = new FdkUser();

    /**
     * 平台货品SKU表|牛振宇|2020-11-03
     */
    public final PlatformSku PLATFORM_SKU = PlatformSku.PLATFORM_SKU;

    /**
     * The table <code>fdk_user.sys_function</code>.
     */
    public final SysFunction SYS_FUNCTION = SysFunction.SYS_FUNCTION;

    /**
     * The table <code>fdk_user.sys_role</code>.
     */
    public final SysRole SYS_ROLE = SysRole.SYS_ROLE;

    /**
     * The table <code>fdk_user.sys_role_function</code>.
     */
    public final SysRoleFunction SYS_ROLE_FUNCTION = SysRoleFunction.SYS_ROLE_FUNCTION;

    /**
     * 平台店铺表，商家自主创建记录基本信息和授权信息
     */
    public final SysShop SYS_SHOP = SysShop.SYS_SHOP;

    /**
     * The table <code>fdk_user.sys_user</code>.
     */
    public final SysUser SYS_USER = SysUser.SYS_USER;

    /**
     * The table <code>fdk_user.sys_user_role</code>.
     */
    public final SysUserRole SYS_USER_ROLE = SysUserRole.SYS_USER_ROLE;

    /**
     * No further instances allowed
     */
    private FdkUser() {
        super("fdk_user", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            PlatformSku.PLATFORM_SKU,
            SysFunction.SYS_FUNCTION,
            SysRole.SYS_ROLE,
            SysRoleFunction.SYS_ROLE_FUNCTION,
            SysShop.SYS_SHOP,
            SysUser.SYS_USER,
            SysUserRole.SYS_USER_ROLE);
    }
}
