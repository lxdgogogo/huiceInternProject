/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db.tables;


import com.huice.service_fdk.myjooq.db.FdkGoods2;
import com.huice.service_fdk.myjooq.db.Indexes;
import com.huice.service_fdk.myjooq.db.Keys;
import com.huice.service_fdk.myjooq.db.tables.records.SellerSpuRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 销售商货品SPU|郑保乐|2020-11-20
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerSpu extends TableImpl<SellerSpuRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>fdk_goods2.seller_spu</code>
     */
    public static final SellerSpu SELLER_SPU = new SellerSpu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SellerSpuRecord> getRecordType() {
        return SellerSpuRecord.class;
    }

    /**
     * The column <code>fdk_goods2.seller_spu.id</code>. id|郑保乐|2020-11-20
     */
    public final TableField<SellerSpuRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "id|郑保乐|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_spu.merchant_id</code>. 商户id|郑保乐|2020-11-23
     */
    public final TableField<SellerSpuRecord, Long> MERCHANT_ID = createField(DSL.name("merchant_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "商户id|郑保乐|2020-11-23");

    /**
     * The column <code>fdk_goods2.seller_spu.spu_name</code>. 货品名称|郑保乐|2020-11-20
     */
    public final TableField<SellerSpuRecord, String> SPU_NAME = createField(DSL.name("spu_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "货品名称|郑保乐|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_spu.platform_id</code>. 平台id|牛振宇|2020-12-10
     */
    public final TableField<SellerSpuRecord, Integer> PLATFORM_ID = createField(DSL.name("platform_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "平台id|牛振宇|2020-12-10");

    /**
     * The column <code>fdk_goods2.seller_spu.goods_id</code>. 平台货品id|牛振宇|2020-11-30
     */
    public final TableField<SellerSpuRecord, String> GOODS_ID = createField(DSL.name("goods_id"), SQLDataType.VARCHAR(40).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "平台货品id|牛振宇|2020-11-30");

    /**
     * The column <code>fdk_goods2.seller_spu.goods_no</code>. 货品商家编码|郑保乐|2020-11-20
     */
    public final TableField<SellerSpuRecord, String> GOODS_NO = createField(DSL.name("goods_no"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "货品商家编码|郑保乐|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_spu.source</code>. 来源|@1 来自平台订单 @2来自平台下载 @3 盘TA 后生成的@4 销售商自建|郑保乐|2020-11-27
     */
    public final TableField<SellerSpuRecord, Byte> SOURCE = createField(DSL.name("source"), SQLDataType.TINYINT.nullable(false), this, "来源|@1 来自平台订单 @2来自平台下载 @3 盘TA 后生成的@4 销售商自建|郑保乐|2020-11-27");

    /**
     * The column <code>fdk_goods2.seller_spu.show_flag</code>. 是否显示在货品列表|@0 否 @1 是|郑保乐|2020-11-20
     */
    public final TableField<SellerSpuRecord, Byte> SHOW_FLAG = createField(DSL.name("show_flag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "是否显示在货品列表|@0 否 @1 是|郑保乐|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_spu.pid</code>. 关联的货品id|郑保乐|2020-11-20
     */
    public final TableField<SellerSpuRecord, Long> PID = createField(DSL.name("pid"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "关联的货品id|郑保乐|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_spu.sale_status</code>. 在售状态｜ @1：在架 @2：下架 @3：店铺已删除 @4：自建默认显示 "/" | 魏柯 | 2020-12-10
     */
    public final TableField<SellerSpuRecord, Byte> SALE_STATUS = createField(DSL.name("sale_status"), SQLDataType.TINYINT, this, "在售状态｜ @1：在架 @2：下架 @3：店铺已删除 @4：自建默认显示 \"/\" | 魏柯 | 2020-12-10");

    /**
     * The column <code>fdk_goods2.seller_spu.created</code>. 创建时间
     */
    public final TableField<SellerSpuRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>fdk_goods2.seller_spu.modified</code>. 修改时间
     */
    public final TableField<SellerSpuRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "修改时间");

    /**
     * The column <code>fdk_goods2.seller_spu.main_img_url</code>. spu主图|王明亮|2020年12月26日
     */
    public final TableField<SellerSpuRecord, String> MAIN_IMG_URL = createField(DSL.name("main_img_url"), SQLDataType.VARCHAR(1024), this, "spu主图|王明亮|2020年12月26日");

    /**
     * The column <code>fdk_goods2.seller_spu.spu_goods_no</code>. 货号|刘宇晴|2021-03-04
     */
    public final TableField<SellerSpuRecord, String> SPU_GOODS_NO = createField(DSL.name("spu_goods_no"), SQLDataType.VARCHAR(100), this, "货号|刘宇晴|2021-03-04");

    /**
     * The column <code>fdk_goods2.seller_spu.pack_flag</code>. 组合装标识 @0:无组合装 @1:有组合装|郑保乐|2021-04-20
     */
    public final TableField<SellerSpuRecord, Byte> PACK_FLAG = createField(DSL.name("pack_flag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "组合装标识 @0:无组合装 @1:有组合装|郑保乐|2021-04-20");

    /**
     * The column <code>fdk_goods2.seller_spu.stagnant_flag</code>. 滞销货品标识 @0：正常货品 @1：滞销货品 | 孟炜彬 | 2021-05-11
     */
    public final TableField<SellerSpuRecord, Byte> STAGNANT_FLAG = createField(DSL.name("stagnant_flag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "滞销货品标识 @0：正常货品 @1：滞销货品 | 孟炜彬 | 2021-05-11");

    /**
     * The column <code>fdk_goods2.seller_spu.goods_link</code>. 宝贝链接
     */
    public final TableField<SellerSpuRecord, String> GOODS_LINK = createField(DSL.name("goods_link"), SQLDataType.VARCHAR(1024).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "宝贝链接");

    private SellerSpu(Name alias, Table<SellerSpuRecord> aliased) {
        this(alias, aliased, null);
    }

    private SellerSpu(Name alias, Table<SellerSpuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("销售商货品SPU|郑保乐|2020-11-20"), TableOptions.table());
    }

    /**
     * Create an aliased <code>fdk_goods2.seller_spu</code> table reference
     */
    public SellerSpu(String alias) {
        this(DSL.name(alias), SELLER_SPU);
    }

    /**
     * Create an aliased <code>fdk_goods2.seller_spu</code> table reference
     */
    public SellerSpu(Name alias) {
        this(alias, SELLER_SPU);
    }

    /**
     * Create a <code>fdk_goods2.seller_spu</code> table reference
     */
    public SellerSpu() {
        this(DSL.name("seller_spu"), null);
    }

    public <O extends Record> SellerSpu(Table<O> child, ForeignKey<O, SellerSpuRecord> key) {
        super(child, key, SELLER_SPU);
    }

    @Override
    public Schema getSchema() {
        return FdkGoods2.FDK_GOODS2;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SELLER_SPU_IDX_MID_PID, Indexes.SELLER_SPU_IDX_MODIFIED, Indexes.SELLER_SPU_IX_MID_PLATFORM_GOODS);
    }

    @Override
    public Identity<SellerSpuRecord, Long> getIdentity() {
        return (Identity<SellerSpuRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SellerSpuRecord> getPrimaryKey() {
        return Keys.KEY_SELLER_SPU_PRIMARY;
    }

    @Override
    public List<UniqueKey<SellerSpuRecord>> getKeys() {
        return Arrays.<UniqueKey<SellerSpuRecord>>asList(Keys.KEY_SELLER_SPU_PRIMARY);
    }

    @Override
    public SellerSpu as(String alias) {
        return new SellerSpu(DSL.name(alias), this);
    }

    @Override
    public SellerSpu as(Name alias) {
        return new SellerSpu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerSpu rename(String name) {
        return new SellerSpu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerSpu rename(Name name) {
        return new SellerSpu(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Long, String, Integer, String, String, Byte, Byte, Long, Byte, LocalDateTime, LocalDateTime, String, String, Byte, Byte, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
