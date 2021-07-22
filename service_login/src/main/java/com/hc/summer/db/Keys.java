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
import com.hc.summer.db.tables.records.PlatformSkuRecord;
import com.hc.summer.db.tables.records.SysFunctionRecord;
import com.hc.summer.db.tables.records.SysRoleFunctionRecord;
import com.hc.summer.db.tables.records.SysRoleRecord;
import com.hc.summer.db.tables.records.SysShopRecord;
import com.hc.summer.db.tables.records.SysUserRecord;
import com.hc.summer.db.tables.records.SysUserRoleRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>fdk_user2</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<SysShopRecord, Long> IDENTITY_SYS_SHOP = Identities0.IDENTITY_SYS_SHOP;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PlatformSkuRecord> KEY_PLATFORM_SKU_PRIMARY = UniqueKeys0.KEY_PLATFORM_SKU_PRIMARY;
    public static final UniqueKey<SysFunctionRecord> KEY_SYS_FUNCTION_PRIMARY = UniqueKeys0.KEY_SYS_FUNCTION_PRIMARY;
    public static final UniqueKey<SysRoleRecord> KEY_SYS_ROLE_PRIMARY = UniqueKeys0.KEY_SYS_ROLE_PRIMARY;
    public static final UniqueKey<SysRoleRecord> KEY_SYS_ROLE_ROLE_NAME = UniqueKeys0.KEY_SYS_ROLE_ROLE_NAME;
    public static final UniqueKey<SysRoleFunctionRecord> KEY_SYS_ROLE_FUNCTION_PRIMARY = UniqueKeys0.KEY_SYS_ROLE_FUNCTION_PRIMARY;
    public static final UniqueKey<SysRoleFunctionRecord> KEY_SYS_ROLE_FUNCTION_ROLE_ID = UniqueKeys0.KEY_SYS_ROLE_FUNCTION_ROLE_ID;
    public static final UniqueKey<SysShopRecord> KEY_SYS_SHOP_PRIMARY = UniqueKeys0.KEY_SYS_SHOP_PRIMARY;
    public static final UniqueKey<SysUserRecord> KEY_SYS_USER_PRIMARY = UniqueKeys0.KEY_SYS_USER_PRIMARY;
    public static final UniqueKey<SysUserRecord> KEY_SYS_USER_USER_PHONE = UniqueKeys0.KEY_SYS_USER_USER_PHONE;
    public static final UniqueKey<SysUserRoleRecord> KEY_SYS_USER_ROLE_PRIMARY = UniqueKeys0.KEY_SYS_USER_ROLE_PRIMARY;
    public static final UniqueKey<SysUserRoleRecord> KEY_SYS_USER_ROLE_USER_ID = UniqueKeys0.KEY_SYS_USER_ROLE_USER_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<SysShopRecord, Long> IDENTITY_SYS_SHOP = Internal.createIdentity(SysShop.SYS_SHOP, SysShop.SYS_SHOP.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<PlatformSkuRecord> KEY_PLATFORM_SKU_PRIMARY = Internal.createUniqueKey(PlatformSku.PLATFORM_SKU, "KEY_platform_sku_PRIMARY", PlatformSku.PLATFORM_SKU.ID);
        public static final UniqueKey<SysFunctionRecord> KEY_SYS_FUNCTION_PRIMARY = Internal.createUniqueKey(SysFunction.SYS_FUNCTION, "KEY_sys_function_PRIMARY", SysFunction.SYS_FUNCTION.ID);
        public static final UniqueKey<SysRoleRecord> KEY_SYS_ROLE_PRIMARY = Internal.createUniqueKey(SysRole.SYS_ROLE, "KEY_sys_role_PRIMARY", SysRole.SYS_ROLE.ID);
        public static final UniqueKey<SysRoleRecord> KEY_SYS_ROLE_ROLE_NAME = Internal.createUniqueKey(SysRole.SYS_ROLE, "KEY_sys_role_role_name", SysRole.SYS_ROLE.ROLE_NAME);
        public static final UniqueKey<SysRoleFunctionRecord> KEY_SYS_ROLE_FUNCTION_PRIMARY = Internal.createUniqueKey(SysRoleFunction.SYS_ROLE_FUNCTION, "KEY_sys_role_function_PRIMARY", SysRoleFunction.SYS_ROLE_FUNCTION.ID);
        public static final UniqueKey<SysRoleFunctionRecord> KEY_SYS_ROLE_FUNCTION_ROLE_ID = Internal.createUniqueKey(SysRoleFunction.SYS_ROLE_FUNCTION, "KEY_sys_role_function_role_id", SysRoleFunction.SYS_ROLE_FUNCTION.ROLE_ID, SysRoleFunction.SYS_ROLE_FUNCTION.FUNCTION_ID);
        public static final UniqueKey<SysShopRecord> KEY_SYS_SHOP_PRIMARY = Internal.createUniqueKey(SysShop.SYS_SHOP, "KEY_sys_shop_PRIMARY", SysShop.SYS_SHOP.ID);
        public static final UniqueKey<SysUserRecord> KEY_SYS_USER_PRIMARY = Internal.createUniqueKey(SysUser.SYS_USER, "KEY_sys_user_PRIMARY", SysUser.SYS_USER.ID);
        public static final UniqueKey<SysUserRecord> KEY_SYS_USER_USER_PHONE = Internal.createUniqueKey(SysUser.SYS_USER, "KEY_sys_user_user_phone", SysUser.SYS_USER.USER_PHONE);
        public static final UniqueKey<SysUserRoleRecord> KEY_SYS_USER_ROLE_PRIMARY = Internal.createUniqueKey(SysUserRole.SYS_USER_ROLE, "KEY_sys_user_role_PRIMARY", SysUserRole.SYS_USER_ROLE.ID);
        public static final UniqueKey<SysUserRoleRecord> KEY_SYS_USER_ROLE_USER_ID = Internal.createUniqueKey(SysUserRole.SYS_USER_ROLE, "KEY_sys_user_role_user_id", SysUserRole.SYS_USER_ROLE.USER_ID, SysUserRole.SYS_USER_ROLE.ROLE_ID);
    }
}
