/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db;


import com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier;
import com.huice.service_fdk.myjooq.db.tables.MapSellerSkuSupplier;
import com.huice.service_fdk.myjooq.db.tables.MapSellerSpuShop;
import com.huice.service_fdk.myjooq.db.tables.PrepareSkuTag;
import com.huice.service_fdk.myjooq.db.tables.SellerOnPrepareSkuList;
import com.huice.service_fdk.myjooq.db.tables.SellerSku;
import com.huice.service_fdk.myjooq.db.tables.SellerSpu;
import com.huice.service_fdk.myjooq.db.tables.SellerSpuImg;
import com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList;
import com.huice.service_fdk.myjooq.db.tables.SysShop;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in fdk_goods2.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PREPARE_SKU_TAG_IDX_MID_BARCODE = Internal.createIndex(DSL.name("idx_mid_barcode"), PrepareSkuTag.PREPARE_SKU_TAG, new OrderField[] { PrepareSkuTag.PREPARE_SKU_TAG.MERCHANT_ID, PrepareSkuTag.PREPARE_SKU_TAG.BARCODE }, false);
    public static final Index FORWARDER_SUPPLIER_IDX_MID_CITY_MARKET_FLOOR = Internal.createIndex(DSL.name("idx_mid_city_market_floor"), ForwarderSupplier.FORWARDER_SUPPLIER, new OrderField[] { ForwarderSupplier.FORWARDER_SUPPLIER.MERCHANT_ID, ForwarderSupplier.FORWARDER_SUPPLIER.CITY, ForwarderSupplier.FORWARDER_SUPPLIER.MARKET, ForwarderSupplier.FORWARDER_SUPPLIER.FLOOR }, false);
    public static final Index MAP_SELLER_SKU_SUPPLIER_IDX_MID_ITEMNO = Internal.createIndex(DSL.name("idx_mid_itemno"), MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER, new OrderField[] { MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID, MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.ITEM_NO }, false);
    public static final Index SELLER_TO_PREPARE_SKU_LIST_IDX_MID_ORDERID = Internal.createIndex(DSL.name("idx_mid_orderid"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST, new OrderField[] { SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID, SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.ORDER_ID }, false);
    public static final Index SELLER_SKU_IDX_MID_PID = Internal.createIndex(DSL.name("idx_mid_pid"), SellerSku.SELLER_SKU, new OrderField[] { SellerSku.SELLER_SKU.MERCHANT_ID, SellerSku.SELLER_SKU.PID }, false);
    public static final Index SELLER_SPU_IDX_MID_PID = Internal.createIndex(DSL.name("idx_mid_pid"), SellerSpu.SELLER_SPU, new OrderField[] { SellerSpu.SELLER_SPU.MERCHANT_ID, SellerSpu.SELLER_SPU.PID }, false);
    public static final Index SELLER_SKU_IDX_MID_PLATFORMSKUID = Internal.createIndex(DSL.name("idx_mid_platformskuid"), SellerSku.SELLER_SKU, new OrderField[] { SellerSku.SELLER_SKU.MERCHANT_ID, SellerSku.SELLER_SKU.PLATFORM_SKU_REC_ID }, false);
    public static final Index SELLER_ON_PREPARE_SKU_LIST_IDX_MID_SELSKUID = Internal.createIndex(DSL.name("idx_mid_selskuid"), SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST, new OrderField[] { SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST.MERCHANT_ID, SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST.SELLER_SKU_ID }, false);
    public static final Index SELLER_TO_PREPARE_SKU_LIST_IDX_MID_SELSKUID = Internal.createIndex(DSL.name("idx_mid_selskuid"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST, new OrderField[] { SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID, SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID }, false);
    public static final Index MAP_SELLER_SPU_SHOP_IDX_MID_SPU_ID = Internal.createIndex(DSL.name("idx_mid_spu_id"), MapSellerSpuShop.MAP_SELLER_SPU_SHOP, new OrderField[] { MapSellerSpuShop.MAP_SELLER_SPU_SHOP.MERCHANT_ID, MapSellerSpuShop.MAP_SELLER_SPU_SHOP.SELLER_SPU_ID }, false);
    public static final Index MAP_SELLER_SKU_SUPPLIER_IDX_MID_SPUID = Internal.createIndex(DSL.name("idx_mid_spuid"), MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER, new OrderField[] { MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID, MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.SELLER_SPU_ID }, false);
    public static final Index SELLER_SPU_IMG_IDX_MID_SPUID = Internal.createIndex(DSL.name("idx_mid_spuid"), SellerSpuImg.SELLER_SPU_IMG, new OrderField[] { SellerSpuImg.SELLER_SPU_IMG.MERCHANT_ID, SellerSpuImg.SELLER_SPU_IMG.SPU_ID }, false);
    public static final Index SELLER_SKU_IDX_MID_SPUID_PID = Internal.createIndex(DSL.name("idx_mid_spuid_pid"), SellerSku.SELLER_SKU, new OrderField[] { SellerSku.SELLER_SKU.MERCHANT_ID, SellerSku.SELLER_SKU.SPU_ID, SellerSku.SELLER_SKU.PID }, false);
    public static final Index SELLER_TO_PREPARE_SKU_LIST_IDX_MID_STATUS_SUPID_SELSKUID = Internal.createIndex(DSL.name("idx_mid_status_supid_selskuid"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST, new OrderField[] { SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID, SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.STATUS, SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID, SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID }, false);
    public static final Index MAP_SELLER_SKU_SUPPLIER_IDX_MID_SUPID = Internal.createIndex(DSL.name("idx_mid_supid"), MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER, new OrderField[] { MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID, MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.SUPPLIER_ID }, false);
    public static final Index MAP_SELLER_SKU_SUPPLIER_IDX_MID_SUPMID = Internal.createIndex(DSL.name("idx_mid_supmid"), MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER, new OrderField[] { MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID, MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.SUPPLIER_MERCHANT_ID }, false);
    public static final Index FORWARDER_SUPPLIER_IDX_MID_SUPNAME = Internal.createIndex(DSL.name("idx_mid_supname"), ForwarderSupplier.FORWARDER_SUPPLIER, new OrderField[] { ForwarderSupplier.FORWARDER_SUPPLIER.MERCHANT_ID, ForwarderSupplier.FORWARDER_SUPPLIER.SUPPLIER_NAME }, false);
    public static final Index PREPARE_SKU_TAG_IDX_MID_TAGSTATUS_SELSKUID_SUPSKUID = Internal.createIndex(DSL.name("idx_mid_tagstatus_selskuid_supskuid"), PrepareSkuTag.PREPARE_SKU_TAG, new OrderField[] { PrepareSkuTag.PREPARE_SKU_TAG.MERCHANT_ID, PrepareSkuTag.PREPARE_SKU_TAG.TAG_STATUS, PrepareSkuTag.PREPARE_SKU_TAG.SELLER_SKU_ID, PrepareSkuTag.PREPARE_SKU_TAG.SUPPLIER_ID }, false);
    public static final Index PREPARE_SKU_TAG_IDX_MID_TAGSTATUS_SPUID = Internal.createIndex(DSL.name("idx_mid_tagstatus_spuid"), PrepareSkuTag.PREPARE_SKU_TAG, new OrderField[] { PrepareSkuTag.PREPARE_SKU_TAG.MERCHANT_ID, PrepareSkuTag.PREPARE_SKU_TAG.TAG_STATUS, PrepareSkuTag.PREPARE_SKU_TAG.SPU_ID }, false);
    public static final Index PREPARE_SKU_TAG_IDX_MID_TRADEID = Internal.createIndex(DSL.name("idx_mid_tradeid"), PrepareSkuTag.PREPARE_SKU_TAG, new OrderField[] { PrepareSkuTag.PREPARE_SKU_TAG.MERCHANT_ID, PrepareSkuTag.PREPARE_SKU_TAG.TRADE_ID }, false);
    public static final Index SELLER_TO_PREPARE_SKU_LIST_IDX_MID_TRADEID = Internal.createIndex(DSL.name("idx_mid_tradeid"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST, new OrderField[] { SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID, SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TRADE_ID }, false);
    public static final Index MAP_SELLER_SPU_SHOP_IDX_MODIFED = Internal.createIndex(DSL.name("idx_modifed"), MapSellerSpuShop.MAP_SELLER_SPU_SHOP, new OrderField[] { MapSellerSpuShop.MAP_SELLER_SPU_SHOP.MODIFIED }, false);
    public static final Index SELLER_SKU_IDX_MODIFIED = Internal.createIndex(DSL.name("idx_modified"), SellerSku.SELLER_SKU, new OrderField[] { SellerSku.SELLER_SKU.MODIFIED }, false);
    public static final Index SELLER_SPU_IDX_MODIFIED = Internal.createIndex(DSL.name("idx_modified"), SellerSpu.SELLER_SPU, new OrderField[] { SellerSpu.SELLER_SPU.MODIFIED }, false);
    public static final Index SELLER_SPU_IX_MID_PLATFORM_GOODS = Internal.createIndex(DSL.name("IX_mid_platform_goods"), SellerSpu.SELLER_SPU, new OrderField[] { SellerSpu.SELLER_SPU.MERCHANT_ID, SellerSpu.SELLER_SPU.PLATFORM_ID, SellerSpu.SELLER_SPU.GOODS_ID }, false);
    public static final Index SYS_SHOP_IX_SYS_SHOP_ACCOUNT_ID = Internal.createIndex(DSL.name("IX_SYS_SHOP_ACCOUNT_ID"), SysShop.SYS_SHOP, new OrderField[] { SysShop.SYS_SHOP.ACCOUNT_ID, SysShop.SYS_SHOP.PLATFORM_ID, SysShop.SYS_SHOP.SUB_PLATFORM_ID }, false);
    public static final Index SYS_SHOP_IX_SYS_SHOP_MERCHANT = Internal.createIndex(DSL.name("IX_sys_shop_merchant"), SysShop.SYS_SHOP, new OrderField[] { SysShop.SYS_SHOP.MERCHANT_ID }, false);
}
