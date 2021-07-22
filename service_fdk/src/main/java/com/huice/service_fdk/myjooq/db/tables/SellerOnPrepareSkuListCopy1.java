/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db.tables;


import com.huice.service_fdk.myjooq.db.FdkGoods2;
import com.huice.service_fdk.myjooq.db.Indexes;
import com.huice.service_fdk.myjooq.db.Keys;
import com.huice.service_fdk.myjooq.db.tables.records.SellerOnPrepareSkuListCopy1Record;

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
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 销售商备货中列表|孟炜彬|2020-11-20
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerOnPrepareSkuListCopy1 extends TableImpl<SellerOnPrepareSkuListCopy1Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>fdk_goods2.seller_on_prepare_sku_list_copy1</code>
     */
    public static final SellerOnPrepareSkuListCopy1 SELLER_ON_PREPARE_SKU_LIST_COPY1 = new SellerOnPrepareSkuListCopy1();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SellerOnPrepareSkuListCopy1Record> getRecordType() {
        return SellerOnPrepareSkuListCopy1Record.class;
    }

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.id</code>. 自增ID
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "自增ID");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.merchant_id</code>. 销售商商户id|孟炜彬|2020-11-20
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, Long> MERCHANT_ID = createField(DSL.name("merchant_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "销售商商户id|孟炜彬|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.supplier_id</code>. 供货商 user_id (supplier_user）的 id |孟炜彬|2020-11-13
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, Long> SUPPLIER_ID = createField(DSL.name("supplier_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "供货商 user_id (supplier_user）的 id |孟炜彬|2020-11-13");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.seller_sku_id</code>. 销售商系统SKU ID|孟炜彬|2020-11-20
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, Long> SELLER_SKU_ID = createField(DSL.name("seller_sku_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "销售商系统SKU ID|孟炜彬|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.prepare_num</code>. 需要备货数量（拿货）
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, BigDecimal> PREPARE_NUM = createField(DSL.name("prepare_num"), SQLDataType.DECIMAL(19, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "需要备货数量（拿货）");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.created</code>. 创建时间|孟炜彬|2020-11-20
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, LocalDateTime> CREATED = createField(DSL.name("created"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "创建时间|孟炜彬|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.modified</code>. 修改时间|孟炜彬|2020-11-20
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, LocalDateTime> MODIFIED = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "修改时间|孟炜彬|2020-11-20");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.wish_more_prepare_num</code>. 备货中 希望多拿货数量|孟炜彬|2021-03-04
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, BigDecimal> WISH_MORE_PREPARE_NUM = createField(DSL.name("wish_more_prepare_num"), SQLDataType.DECIMAL(19, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "备货中 希望多拿货数量|孟炜彬|2021-03-04");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.prior_prepare_num</code>. 优先拿货| 孟炜彬 | 2021-04-27
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, BigDecimal> PRIOR_PREPARE_NUM = createField(DSL.name("prior_prepare_num"), SQLDataType.DECIMAL(19, 4).nullable(false).defaultValue(DSL.inline("0.0000", SQLDataType.DECIMAL)), this, "优先拿货| 孟炜彬 | 2021-04-27");

    /**
     * The column <code>fdk_goods2.seller_on_prepare_sku_list_copy1.take_goods_type</code>. 子单中的货品拿货类型 @0 自拿；@1 代拿|孟炜彬|2021-06-22
     */
    public final TableField<SellerOnPrepareSkuListCopy1Record, Byte> TAKE_GOODS_TYPE = createField(DSL.name("take_goods_type"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "子单中的货品拿货类型 @0 自拿；@1 代拿|孟炜彬|2021-06-22");

    private SellerOnPrepareSkuListCopy1(Name alias, Table<SellerOnPrepareSkuListCopy1Record> aliased) {
        this(alias, aliased, null);
    }

    private SellerOnPrepareSkuListCopy1(Name alias, Table<SellerOnPrepareSkuListCopy1Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("销售商备货中列表|孟炜彬|2020-11-20"), TableOptions.table());
    }

    /**
     * Create an aliased <code>fdk_goods2.seller_on_prepare_sku_list_copy1</code> table reference
     */
    public SellerOnPrepareSkuListCopy1(String alias) {
        this(DSL.name(alias), SELLER_ON_PREPARE_SKU_LIST_COPY1);
    }

    /**
     * Create an aliased <code>fdk_goods2.seller_on_prepare_sku_list_copy1</code> table reference
     */
    public SellerOnPrepareSkuListCopy1(Name alias) {
        this(alias, SELLER_ON_PREPARE_SKU_LIST_COPY1);
    }

    /**
     * Create a <code>fdk_goods2.seller_on_prepare_sku_list_copy1</code> table reference
     */
    public SellerOnPrepareSkuListCopy1() {
        this(DSL.name("seller_on_prepare_sku_list_copy1"), null);
    }

    public <O extends Record> SellerOnPrepareSkuListCopy1(Table<O> child, ForeignKey<O, SellerOnPrepareSkuListCopy1Record> key) {
        super(child, key, SELLER_ON_PREPARE_SKU_LIST_COPY1);
    }

    @Override
    public Schema getSchema() {
        return FdkGoods2.FDK_GOODS2;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SELLER_ON_PREPARE_SKU_LIST_COPY1_IDX_MID_SELSKUID);
    }

    @Override
    public Identity<SellerOnPrepareSkuListCopy1Record, Long> getIdentity() {
        return (Identity<SellerOnPrepareSkuListCopy1Record, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SellerOnPrepareSkuListCopy1Record> getPrimaryKey() {
        return Keys.KEY_SELLER_ON_PREPARE_SKU_LIST_COPY1_PRIMARY;
    }

    @Override
    public List<UniqueKey<SellerOnPrepareSkuListCopy1Record>> getKeys() {
        return Arrays.<UniqueKey<SellerOnPrepareSkuListCopy1Record>>asList(Keys.KEY_SELLER_ON_PREPARE_SKU_LIST_COPY1_PRIMARY);
    }

    @Override
    public SellerOnPrepareSkuListCopy1 as(String alias) {
        return new SellerOnPrepareSkuListCopy1(DSL.name(alias), this);
    }

    @Override
    public SellerOnPrepareSkuListCopy1 as(Name alias) {
        return new SellerOnPrepareSkuListCopy1(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerOnPrepareSkuListCopy1 rename(String name) {
        return new SellerOnPrepareSkuListCopy1(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SellerOnPrepareSkuListCopy1 rename(Name name) {
        return new SellerOnPrepareSkuListCopy1(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, Long, BigDecimal, LocalDateTime, LocalDateTime, BigDecimal, BigDecimal, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
