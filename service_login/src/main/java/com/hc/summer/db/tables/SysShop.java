/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db.tables;


import com.hc.summer.db.FdkUser2;
import com.hc.summer.db.Indexes;
import com.hc.summer.db.Keys;
import com.hc.summer.db.tables.records.SysShopRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 平台店铺表，商家自主创建记录基本信息和授权信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysShop extends TableImpl<SysShopRecord> {

    private static final long serialVersionUID = -1020277054;

    /**
     * The reference instance of <code>fdk_user2.sys_shop</code>
     */
    public static final SysShop SYS_SHOP = new SysShop();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysShopRecord> getRecordType() {
        return SysShopRecord.class;
    }

    /**
     * The column <code>fdk_user2.sys_shop.id</code>.
     */
    public final TableField<SysShopRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>fdk_user2.sys_shop.platform_id</code>. 平台id|牛振宇|2020-12-10
     */
    public final TableField<SysShopRecord, Integer> PLATFORM_ID = createField(DSL.name("platform_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "平台id|牛振宇|2020-12-10");

    /**
     * The column <code>fdk_user2.sys_shop.sub_platform_id</code>. 子平台ID,子平台只是业务流程上有差别|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, Byte> SUB_PLATFORM_ID = createField(DSL.name("sub_platform_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "子平台ID,子平台只是业务流程上有差别|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.shop_no</code>. 店铺编号|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> SHOP_NO = createField(DSL.name("shop_no"), org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "店铺编号|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.shop_name</code>. 店铺名称|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> SHOP_NAME = createField(DSL.name("shop_name"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "店铺名称|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.img_url</code>. 店铺图片|牛振宇|2020-11-26
     */
    public final TableField<SysShopRecord, String> IMG_URL = createField(DSL.name("img_url"), org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "店铺图片|牛振宇|2020-11-26");

    /**
     * The column <code>fdk_user2.sys_shop.pay_account_id</code>. 帐款帐号,如支付宝、财富通|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> PAY_ACCOUNT_ID = createField(DSL.name("pay_account_id"), org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "帐款帐号,如支付宝、财富通|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.auth_status</code>. 授权状态，0未授权 1已授权 2授权失效（只有后台脚本可能修改成2）3授权停用|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, Byte> AUTH_STATUS = createField(DSL.name("auth_status"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "授权状态，0未授权 1已授权 2授权失效（只有后台脚本可能修改成2）3授权停用|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.push_rds_id</code>. 是否启用推送 0不推送 其它值对应RDS服务器|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, Byte> PUSH_RDS_ID = createField(DSL.name("push_rds_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否启用推送 0不推送 其它值对应RDS服务器|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.pay_auth_status</code>. 支付宝授权状态 0未授权 1已授权 2授权失效（只有后台脚本可能修改成2）3授权停用|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, Byte> PAY_AUTH_STATUS = createField(DSL.name("pay_auth_status"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "支付宝授权状态 0未授权 1已授权 2授权失效（只有后台脚本可能修改成2）3授权停用|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.account_id</code>. 平台ID，一般是数字形式，平台上的主键|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> ACCOUNT_ID = createField(DSL.name("account_id"), org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "平台ID，一般是数字形式，平台上的主键|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.account_nick</code>. 平台帐号，比如淘宝登录帐号,nick|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> ACCOUNT_NICK = createField(DSL.name("account_nick"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "平台帐号，比如淘宝登录帐号,nick|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.app_key</code>. json格式，包含了key,secret,token|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> APP_KEY = createField(DSL.name("app_key"), org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "json格式，包含了key,secret,token|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.refresh_token</code>. 刷新令牌|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> REFRESH_TOKEN = createField(DSL.name("refresh_token"), org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "刷新令牌|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.sh_secret</code>. 授权码，PHP用来检验的串|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> SH_SECRET = createField(DSL.name("sh_secret"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "授权码，PHP用来检验的串|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.auth_time</code>. 授权日期|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, LocalDateTime> AUTH_TIME = createField(DSL.name("auth_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "授权日期|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.expire_time</code>. session过期时间|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, LocalDateTime> EXPIRE_TIME = createField(DSL.name("expire_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "session过期时间|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.re_expire_time</code>. refresh_token过期时间|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, LocalDateTime> RE_EXPIRE_TIME = createField(DSL.name("re_expire_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "refresh_token过期时间|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.unfreeze_auth_time</code>. 冻结授权到此时间为止(unix时间戳)|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, Integer> UNFREEZE_AUTH_TIME = createField(DSL.name("unfreeze_auth_time"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "冻结授权到此时间为止(unix时间戳)|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.service_expire_time</code>. 订阅服务过期时间|牛振宇|2021-01-05
     */
    public final TableField<SysShopRecord, LocalDateTime> SERVICE_EXPIRE_TIME = createField(DSL.name("service_expire_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "订阅服务过期时间|牛振宇|2021-01-05");

    /**
     * The column <code>fdk_user2.sys_shop.service_type</code>. 服务类型：@0:未知服务类型，@1:试用服务，@2:正式服务|牛振宇|2021-02-05
     */
    public final TableField<SysShopRecord, Byte> SERVICE_TYPE = createField(DSL.name("service_type"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "服务类型：@0:未知服务类型，@1:试用服务，@2:正式服务|牛振宇|2021-02-05");

    /**
     * The column <code>fdk_user2.sys_shop.send_order_quantity_flag</code>. 购买服务后赠送单量标识|牛振宇|2021-02-05
     */
    public final TableField<SysShopRecord, Byte> SEND_ORDER_QUANTITY_FLAG = createField(DSL.name("send_order_quantity_flag"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "购买服务后赠送单量标识|牛振宇|2021-02-05");

    /**
     * The column <code>fdk_user2.sys_shop.inviter_send_order_flag</code>. 邀请人赠送单量标识|牛振宇|2021-02-05
     */
    public final TableField<SysShopRecord, Byte> INVITER_SEND_ORDER_FLAG = createField(DSL.name("inviter_send_order_flag"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "邀请人赠送单量标识|牛振宇|2021-02-05");

    /**
     * The column <code>fdk_user2.sys_shop.remark</code>. 备注|周达材|2020-11-006
     */
    public final TableField<SysShopRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "备注|周达材|2020-11-006");

    /**
     * The column <code>fdk_user2.sys_shop.delete_flag</code>. 删除标识|@1：已删除；@0：未删除
     */
    public final TableField<SysShopRecord, Byte> DELETE_FLAG = createField(DSL.name("delete_flag"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "删除标识|@1：已删除；@0：未删除");

    /**
     * The column <code>fdk_user2.sys_shop.taobao_shop_id</code>. 非淘宝店铺关联淘宝店铺,电子发票专用|牛振宇|2020-11-12
     */
    public final TableField<SysShopRecord, Long> TAOBAO_SHOP_ID = createField(DSL.name("taobao_shop_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "非淘宝店铺关联淘宝店铺,电子发票专用|牛振宇|2020-11-12");

    /**
     * The column <code>fdk_user2.sys_shop.elec_invoice_payee_id</code>. 收款方id,电子发票专用|牛振宇|2020-11-12
     */
    public final TableField<SysShopRecord, String> ELEC_INVOICE_PAYEE_ID = createField(DSL.name("elec_invoice_payee_id"), org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "收款方id,电子发票专用|牛振宇|2020-11-12");

    /**
     * The column <code>fdk_user2.sys_shop.elec_invoice_provider_id</code>. 服务商id,电子发票专用|牛振宇|2020-11-12
     */
    public final TableField<SysShopRecord, String> ELEC_INVOICE_PROVIDER_ID = createField(DSL.name("elec_invoice_provider_id"), org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "服务商id,电子发票专用|牛振宇|2020-11-12");

    /**
     * The column <code>fdk_user2.sys_shop.paper_invoice_provider_id</code>. 纸质发票服务商id|牛振宇|2020-11-12
     */
    public final TableField<SysShopRecord, String> PAPER_INVOICE_PROVIDER_ID = createField(DSL.name("paper_invoice_provider_id"), org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "纸质发票服务商id|牛振宇|2020-11-12");

    /**
     * The column <code>fdk_user2.sys_shop.logistics_sync_delay</code>. 物流同步延迟小时数|牛振宇|2020-11-12
     */
    public final TableField<SysShopRecord, Byte> LOGISTICS_SYNC_DELAY = createField(DSL.name("logistics_sync_delay"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "物流同步延迟小时数|牛振宇|2020-11-12");

    /**
     * The column <code>fdk_user2.sys_shop.deliver_order_num</code>. 店铺累计发货单量|牛振宇|2021-02-05
     */
    public final TableField<SysShopRecord, Integer> DELIVER_ORDER_NUM = createField(DSL.name("deliver_order_num"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺累计发货单量|牛振宇|2021-02-05");

    /**
     * The column <code>fdk_user2.sys_shop.spu_num</code>. 店铺最新spu数量|牛振宇|2021-02-05
     */
    public final TableField<SysShopRecord, Integer> SPU_NUM = createField(DSL.name("spu_num"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "店铺最新spu数量|牛振宇|2021-02-05");

    /**
     * The column <code>fdk_user2.sys_shop.modified</code>.
     */
    public final TableField<SysShopRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fdk_user2.sys_shop.created</code>.
     */
    public final TableField<SysShopRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fdk_user2.sys_shop.isTjbSeller</code>. 是否是淘宝特价版|@0否 @1是|牛振宇|2021-3-6
     */
    public final TableField<SysShopRecord, Byte> ISTJBSELLER = createField(DSL.name("isTjbSeller"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否是淘宝特价版|@0否 @1是|牛振宇|2021-3-6");

    /**
     * Create a <code>fdk_user2.sys_shop</code> table reference
     */
    public SysShop() {
        this(DSL.name("sys_shop"), null);
    }

    /**
     * Create an aliased <code>fdk_user2.sys_shop</code> table reference
     */
    public SysShop(String alias) {
        this(DSL.name(alias), SYS_SHOP);
    }

    /**
     * Create an aliased <code>fdk_user2.sys_shop</code> table reference
     */
    public SysShop(Name alias) {
        this(alias, SYS_SHOP);
    }

    private SysShop(Name alias, Table<SysShopRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysShop(Name alias, Table<SysShopRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("平台店铺表，商家自主创建记录基本信息和授权信息"));
    }

    public <O extends Record> SysShop(Table<O> child, ForeignKey<O, SysShopRecord> key) {
        super(child, key, SYS_SHOP);
    }

    @Override
    public Schema getSchema() {
        return FdkUser2.FDK_USER2;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_SHOP_IX_SYS_SHOP_ACCOUNT_ID, Indexes.SYS_SHOP_PRIMARY);
    }

    @Override
    public Identity<SysShopRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_SHOP;
    }

    @Override
    public UniqueKey<SysShopRecord> getPrimaryKey() {
        return Keys.KEY_SYS_SHOP_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysShopRecord>> getKeys() {
        return Arrays.<UniqueKey<SysShopRecord>>asList(Keys.KEY_SYS_SHOP_PRIMARY);
    }

    @Override
    public SysShop as(String alias) {
        return new SysShop(DSL.name(alias), this);
    }

    @Override
    public SysShop as(Name alias) {
        return new SysShop(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysShop rename(String name) {
        return new SysShop(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysShop rename(Name name) {
        return new SysShop(name, null);
    }
}
