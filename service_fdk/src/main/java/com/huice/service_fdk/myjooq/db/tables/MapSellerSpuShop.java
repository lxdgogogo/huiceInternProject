/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db.tables;


import com.huice.service_fdk.myjooq.db.FdkGoods2;
import com.huice.service_fdk.myjooq.db.Indexes;
import com.huice.service_fdk.myjooq.db.Keys;
import com.huice.service_fdk.myjooq.db.tables.records.MapSellerSpuShopRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 销售商Spu与销售商店铺 关联关系|魏柯|2020-11-21
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapSellerSpuShop extends TableImpl<MapSellerSpuShopRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>fdk_goods2.map_seller_spu_shop</code>
     */
    public static final MapSellerSpuShop MAP_SELLER_SPU_SHOP = new MapSellerSpuShop();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapSellerSpuShopRecord> getRecordType() {
        return MapSellerSpuShopRecord.class;
    }

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.id</code>. 自增Id
     */
    public final TableField<MapSellerSpuShopRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "自增Id");

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.merchant_id</code>. 商户id|魏柯|2020-11-21
     */
    public final TableField<MapSellerSpuShopRecord, Long> MERCHANT_ID = createField(DSL.name("merchant_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "商户id|魏柯|2020-11-21");

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.seller_spu_id</code>. spu_id|魏柯|2020-11-21
     */
    public final TableField<MapSellerSpuShopRecord, Long> SELLER_SPU_ID = createField(DSL.name("seller_spu_id"), SQLDataType.BIGINT.nullable(false), this, "spu_id|魏柯|2020-11-21");

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.created</code>.
     */
    public final TableField<MapSellerSpuShopRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.modified</code>. 更新时间
     */
    public final TableField<MapSellerSpuShopRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "更新时间");

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.shop_id</code>. 店铺id|魏柯|2020-11-21
     */
    public final TableField<MapSellerSpuShopRecord, Long> SHOP_ID = createField(DSL.name("shop_id"), SQLDataType.BIGINT, this, "店铺id|魏柯|2020-11-21");

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.delivery_time_type</code>. 发货时限类型 @0不设置; @1 付款后xx小时；@2 指定时间xx之前；@3 应用店铺发货时限  |孟炜彬|2021-06-01
     */
    public final TableField<MapSellerSpuShopRecord, Byte> DELIVERY_TIME_TYPE = createField(DSL.name("delivery_time_type"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "发货时限类型 @0不设置; @1 付款后xx小时；@2 指定时间xx之前；@3 应用店铺发货时限  |孟炜彬|2021-06-01");

    /**
     * The column <code>fdk_goods2.map_seller_spu_shop.delivery_time_description</code>. 发货时限时长描述。 整数则为 1类型 小时，时间则为2类型 指定时间之前|孟炜彬|2021-06-01
     */
    public final TableField<MapSellerSpuShopRecord, String> DELIVERY_TIME_DESCRIPTION = createField(DSL.name("delivery_time_description"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "发货时限时长描述。 整数则为 1类型 小时，时间则为2类型 指定时间之前|孟炜彬|2021-06-01");

    private MapSellerSpuShop(Name alias, Table<MapSellerSpuShopRecord> aliased) {
        this(alias, aliased, null);
    }

    private MapSellerSpuShop(Name alias, Table<MapSellerSpuShopRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("销售商Spu与销售商店铺 关联关系|魏柯|2020-11-21"), TableOptions.table());
    }

    /**
     * Create an aliased <code>fdk_goods2.map_seller_spu_shop</code> table reference
     */
    public MapSellerSpuShop(String alias) {
        this(DSL.name(alias), MAP_SELLER_SPU_SHOP);
    }

    /**
     * Create an aliased <code>fdk_goods2.map_seller_spu_shop</code> table reference
     */
    public MapSellerSpuShop(Name alias) {
        this(alias, MAP_SELLER_SPU_SHOP);
    }

    /**
     * Create a <code>fdk_goods2.map_seller_spu_shop</code> table reference
     */
    public MapSellerSpuShop() {
        this(DSL.name("map_seller_spu_shop"), null);
    }

    public <O extends Record> MapSellerSpuShop(Table<O> child, ForeignKey<O, MapSellerSpuShopRecord> key) {
        super(child, key, MAP_SELLER_SPU_SHOP);
    }

    @Override
    public Schema getSchema() {
        return FdkGoods2.FDK_GOODS2;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MAP_SELLER_SPU_SHOP_IDX_MID_SPU_ID, Indexes.MAP_SELLER_SPU_SHOP_IDX_MODIFED);
    }

    @Override
    public Identity<MapSellerSpuShopRecord, Long> getIdentity() {
        return (Identity<MapSellerSpuShopRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<MapSellerSpuShopRecord> getPrimaryKey() {
        return Keys.KEY_MAP_SELLER_SPU_SHOP_PRIMARY;
    }

    @Override
    public List<UniqueKey<MapSellerSpuShopRecord>> getKeys() {
        return Arrays.<UniqueKey<MapSellerSpuShopRecord>>asList(Keys.KEY_MAP_SELLER_SPU_SHOP_PRIMARY, Keys.KEY_MAP_SELLER_SPU_SHOP_UK_MID_SHOPID_SELLERSPUID);
    }

    @Override
    public MapSellerSpuShop as(String alias) {
        return new MapSellerSpuShop(DSL.name(alias), this);
    }

    @Override
    public MapSellerSpuShop as(Name alias) {
        return new MapSellerSpuShop(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MapSellerSpuShop rename(String name) {
        return new MapSellerSpuShop(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MapSellerSpuShop rename(Name name) {
        return new MapSellerSpuShop(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, LocalDateTime, LocalDateTime, Long, Byte, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
