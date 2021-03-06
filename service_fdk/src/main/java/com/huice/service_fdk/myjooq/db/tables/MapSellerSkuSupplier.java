/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db.tables;


import com.huice.service_fdk.myjooq.db.FdkGoods2;
import com.huice.service_fdk.myjooq.db.Indexes;
import com.huice.service_fdk.myjooq.db.Keys;
import com.huice.service_fdk.myjooq.db.tables.records.MapSellerSkuSupplierRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 销售商SKU与供货商关联关系|刘宇晴|2020-11-20
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapSellerSkuSupplier extends TableImpl<MapSellerSkuSupplierRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>fdk_goods2.map_seller_sku_supplier</code>
     */
    public static final MapSellerSkuSupplier MAP_SELLER_SKU_SUPPLIER = new MapSellerSkuSupplier();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapSellerSkuSupplierRecord> getRecordType() {
        return MapSellerSkuSupplierRecord.class;
    }

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.id</code>.
     */
    public final TableField<MapSellerSkuSupplierRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.merchant_id</code>. 商户id |刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, Long> MERCHANT_ID = createField(DSL.name("merchant_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "商户id |刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.seller_sku_id</code>. 销售商sku id|刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, Long> SELLER_SKU_ID = createField(DSL.name("seller_sku_id"), SQLDataType.BIGINT.nullable(false), this, "销售商sku id|刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.seller_spu_id</code>. 销售商spu_id|孟炜彬|2021-06-03
     */
    public final TableField<MapSellerSkuSupplierRecord, Long> SELLER_SPU_ID = createField(DSL.name("seller_spu_id"), SQLDataType.BIGINT.nullable(false), this, "销售商spu_id|孟炜彬|2021-06-03");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.supplier_id</code>. 供货商id|刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, Long> SUPPLIER_ID = createField(DSL.name("supplier_id"), SQLDataType.BIGINT.nullable(false), this, "供货商id|刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.supplier_merchant_id</code>. 供货商的商户id|刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, Long> SUPPLIER_MERCHANT_ID = createField(DSL.name("supplier_merchant_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "供货商的商户id|刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.main_flag</code>. 主从供货商标识0主供货商；1从供货商|刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, Byte> MAIN_FLAG = createField(DSL.name("main_flag"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "主从供货商标识0主供货商；1从供货商|刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.remark</code>. 备注|刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, String> REMARK = createField(DSL.name("remark"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "备注|刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.item_no</code>. 货号|刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, String> ITEM_NO = createField(DSL.name("item_no"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "货号|刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.purchase_price</code>. 拿货价|刘宇晴|2021-06-02
     */
    public final TableField<MapSellerSkuSupplierRecord, BigDecimal> PURCHASE_PRICE = createField(DSL.name("purchase_price"), SQLDataType.DECIMAL(19, 4).nullable(false), this, "拿货价|刘宇晴|2021-06-02");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.created</code>.
     */
    public final TableField<MapSellerSkuSupplierRecord, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.modified</code>.
     */
    public final TableField<MapSellerSkuSupplierRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.city</code>. 城市 |刘宇晴|2021-06-08
     */
    public final TableField<MapSellerSkuSupplierRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "城市 |刘宇晴|2021-06-08");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.market</code>. 市场 |刘宇晴|2021-06-08
     */
    public final TableField<MapSellerSkuSupplierRecord, String> MARKET = createField(DSL.name("market"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "市场 |刘宇晴|2021-06-08");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.floor</code>. 楼层 |刘宇晴|2021-06-08
     */
    public final TableField<MapSellerSkuSupplierRecord, String> FLOOR = createField(DSL.name("floor"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "楼层 |刘宇晴|2021-06-08");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.business</code>. 档口 |刘宇晴|2021-06-08
     */
    public final TableField<MapSellerSkuSupplierRecord, String> BUSINESS = createField(DSL.name("business"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "档口 |刘宇晴|2021-06-08");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.supplier_name</code>. 供货商全名 |刘宇晴|2021-06-08
     */
    public final TableField<MapSellerSkuSupplierRecord, String> SUPPLIER_NAME = createField(DSL.name("supplier_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "供货商全名 |刘宇晴|2021-06-08");

    /**
     * The column <code>fdk_goods2.map_seller_sku_supplier.take_goods_type</code>. 子单中的货品拿货类型 @0 自拿；@1 代拿|刘宇晴|2021-06-08
     */
    public final TableField<MapSellerSkuSupplierRecord, Byte> TAKE_GOODS_TYPE = createField(DSL.name("take_goods_type"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "子单中的货品拿货类型 @0 自拿；@1 代拿|刘宇晴|2021-06-08");

    private MapSellerSkuSupplier(Name alias, Table<MapSellerSkuSupplierRecord> aliased) {
        this(alias, aliased, null);
    }

    private MapSellerSkuSupplier(Name alias, Table<MapSellerSkuSupplierRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("销售商SKU与供货商关联关系|刘宇晴|2020-11-20"), TableOptions.table());
    }

    /**
     * Create an aliased <code>fdk_goods2.map_seller_sku_supplier</code> table reference
     */
    public MapSellerSkuSupplier(String alias) {
        this(DSL.name(alias), MAP_SELLER_SKU_SUPPLIER);
    }

    /**
     * Create an aliased <code>fdk_goods2.map_seller_sku_supplier</code> table reference
     */
    public MapSellerSkuSupplier(Name alias) {
        this(alias, MAP_SELLER_SKU_SUPPLIER);
    }

    /**
     * Create a <code>fdk_goods2.map_seller_sku_supplier</code> table reference
     */
    public MapSellerSkuSupplier() {
        this(DSL.name("map_seller_sku_supplier"), null);
    }

    public <O extends Record> MapSellerSkuSupplier(Table<O> child, ForeignKey<O, MapSellerSkuSupplierRecord> key) {
        super(child, key, MAP_SELLER_SKU_SUPPLIER);
    }

    @Override
    public Schema getSchema() {
        return FdkGoods2.FDK_GOODS2;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MAP_SELLER_SKU_SUPPLIER_IDX_MID_ITEMNO, Indexes.MAP_SELLER_SKU_SUPPLIER_IDX_MID_SPUID, Indexes.MAP_SELLER_SKU_SUPPLIER_IDX_MID_SUPID, Indexes.MAP_SELLER_SKU_SUPPLIER_IDX_MID_SUPMID);
    }

    @Override
    public Identity<MapSellerSkuSupplierRecord, Long> getIdentity() {
        return (Identity<MapSellerSkuSupplierRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<MapSellerSkuSupplierRecord> getPrimaryKey() {
        return Keys.KEY_MAP_SELLER_SKU_SUPPLIER_PRIMARY;
    }

    @Override
    public List<UniqueKey<MapSellerSkuSupplierRecord>> getKeys() {
        return Arrays.<UniqueKey<MapSellerSkuSupplierRecord>>asList(Keys.KEY_MAP_SELLER_SKU_SUPPLIER_PRIMARY, Keys.KEY_MAP_SELLER_SKU_SUPPLIER_UK_MID_SKUID_SUPMID);
    }

    @Override
    public MapSellerSkuSupplier as(String alias) {
        return new MapSellerSkuSupplier(DSL.name(alias), this);
    }

    @Override
    public MapSellerSkuSupplier as(Name alias) {
        return new MapSellerSkuSupplier(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MapSellerSkuSupplier rename(String name) {
        return new MapSellerSkuSupplier(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MapSellerSkuSupplier rename(Name name) {
        return new MapSellerSkuSupplier(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, Long, Long, Long, Long, Long, Byte, String, String, BigDecimal, LocalDateTime, LocalDateTime, String, String, String, String, String, Byte> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
