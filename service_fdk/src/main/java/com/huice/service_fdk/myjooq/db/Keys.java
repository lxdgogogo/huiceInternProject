/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db;


import com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier;
import com.huice.service_fdk.myjooq.db.tables.MapSellerSkuSupplier;
import com.huice.service_fdk.myjooq.db.tables.MapSellerSpuShop;
import com.huice.service_fdk.myjooq.db.tables.PlatformSku;
import com.huice.service_fdk.myjooq.db.tables.PrepareSkuTag;
import com.huice.service_fdk.myjooq.db.tables.SellerOnPrepareSkuList;
import com.huice.service_fdk.myjooq.db.tables.SellerSku;
import com.huice.service_fdk.myjooq.db.tables.SellerSpu;
import com.huice.service_fdk.myjooq.db.tables.SellerSpuImg;
import com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList;
import com.huice.service_fdk.myjooq.db.tables.SysShop;
import com.huice.service_fdk.myjooq.db.tables.records.ForwarderSupplierRecord;
import com.huice.service_fdk.myjooq.db.tables.records.MapSellerSkuSupplierRecord;
import com.huice.service_fdk.myjooq.db.tables.records.MapSellerSpuShopRecord;
import com.huice.service_fdk.myjooq.db.tables.records.PlatformSkuRecord;
import com.huice.service_fdk.myjooq.db.tables.records.PrepareSkuTagRecord;
import com.huice.service_fdk.myjooq.db.tables.records.SellerOnPrepareSkuListRecord;
import com.huice.service_fdk.myjooq.db.tables.records.SellerSkuRecord;
import com.huice.service_fdk.myjooq.db.tables.records.SellerSpuImgRecord;
import com.huice.service_fdk.myjooq.db.tables.records.SellerSpuRecord;
import com.huice.service_fdk.myjooq.db.tables.records.SellerToPrepareSkuListRecord;
import com.huice.service_fdk.myjooq.db.tables.records.SysShopRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>fdk_goods2</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ForwarderSupplierRecord, Long> IDENTITY_FORWARDER_SUPPLIER = Identities0.IDENTITY_FORWARDER_SUPPLIER;
    public static final Identity<MapSellerSkuSupplierRecord, Long> IDENTITY_MAP_SELLER_SKU_SUPPLIER = Identities0.IDENTITY_MAP_SELLER_SKU_SUPPLIER;
    public static final Identity<MapSellerSpuShopRecord, Long> IDENTITY_MAP_SELLER_SPU_SHOP = Identities0.IDENTITY_MAP_SELLER_SPU_SHOP;
    public static final Identity<PlatformSkuRecord, ULong> IDENTITY_PLATFORM_SKU = Identities0.IDENTITY_PLATFORM_SKU;
    public static final Identity<PrepareSkuTagRecord, Long> IDENTITY_PREPARE_SKU_TAG = Identities0.IDENTITY_PREPARE_SKU_TAG;
    public static final Identity<SellerOnPrepareSkuListRecord, Long> IDENTITY_SELLER_ON_PREPARE_SKU_LIST = Identities0.IDENTITY_SELLER_ON_PREPARE_SKU_LIST;
    public static final Identity<SellerSkuRecord, Long> IDENTITY_SELLER_SKU = Identities0.IDENTITY_SELLER_SKU;
    public static final Identity<SellerSpuRecord, Long> IDENTITY_SELLER_SPU = Identities0.IDENTITY_SELLER_SPU;
    public static final Identity<SellerSpuImgRecord, Long> IDENTITY_SELLER_SPU_IMG = Identities0.IDENTITY_SELLER_SPU_IMG;
    public static final Identity<SellerToPrepareSkuListRecord, Long> IDENTITY_SELLER_TO_PREPARE_SKU_LIST = Identities0.IDENTITY_SELLER_TO_PREPARE_SKU_LIST;
    public static final Identity<SysShopRecord, Long> IDENTITY_SYS_SHOP = Identities0.IDENTITY_SYS_SHOP;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ForwarderSupplierRecord> KEY_FORWARDER_SUPPLIER_PRIMARY = UniqueKeys0.KEY_FORWARDER_SUPPLIER_PRIMARY;
    public static final UniqueKey<ForwarderSupplierRecord> KEY_FORWARDER_SUPPLIER_UK_MID_FSUPID = UniqueKeys0.KEY_FORWARDER_SUPPLIER_UK_MID_FSUPID;
    public static final UniqueKey<MapSellerSkuSupplierRecord> KEY_MAP_SELLER_SKU_SUPPLIER_PRIMARY = UniqueKeys0.KEY_MAP_SELLER_SKU_SUPPLIER_PRIMARY;
    public static final UniqueKey<MapSellerSkuSupplierRecord> KEY_MAP_SELLER_SKU_SUPPLIER_UK_MID_SKUID_SUPMID = UniqueKeys0.KEY_MAP_SELLER_SKU_SUPPLIER_UK_MID_SKUID_SUPMID;
    public static final UniqueKey<MapSellerSpuShopRecord> KEY_MAP_SELLER_SPU_SHOP_PRIMARY = UniqueKeys0.KEY_MAP_SELLER_SPU_SHOP_PRIMARY;
    public static final UniqueKey<MapSellerSpuShopRecord> KEY_MAP_SELLER_SPU_SHOP_UK_MID_SHOPID_SELLERSPUID = UniqueKeys0.KEY_MAP_SELLER_SPU_SHOP_UK_MID_SHOPID_SELLERSPUID;
    public static final UniqueKey<PlatformSkuRecord> KEY_PLATFORM_SKU_PRIMARY = UniqueKeys0.KEY_PLATFORM_SKU_PRIMARY;
    public static final UniqueKey<PlatformSkuRecord> KEY_PLATFORM_SKU_UK_MID_SHOPID_GOODSID_SKUID = UniqueKeys0.KEY_PLATFORM_SKU_UK_MID_SHOPID_GOODSID_SKUID;
    public static final UniqueKey<PrepareSkuTagRecord> KEY_PREPARE_SKU_TAG_PRIMARY = UniqueKeys0.KEY_PREPARE_SKU_TAG_PRIMARY;
    public static final UniqueKey<SellerOnPrepareSkuListRecord> KEY_SELLER_ON_PREPARE_SKU_LIST_PRIMARY = UniqueKeys0.KEY_SELLER_ON_PREPARE_SKU_LIST_PRIMARY;
    public static final UniqueKey<SellerSkuRecord> KEY_SELLER_SKU_PRIMARY = UniqueKeys0.KEY_SELLER_SKU_PRIMARY;
    public static final UniqueKey<SellerSpuRecord> KEY_SELLER_SPU_PRIMARY = UniqueKeys0.KEY_SELLER_SPU_PRIMARY;
    public static final UniqueKey<SellerSpuImgRecord> KEY_SELLER_SPU_IMG_PRIMARY = UniqueKeys0.KEY_SELLER_SPU_IMG_PRIMARY;
    public static final UniqueKey<SellerToPrepareSkuListRecord> KEY_SELLER_TO_PREPARE_SKU_LIST_PRIMARY = UniqueKeys0.KEY_SELLER_TO_PREPARE_SKU_LIST_PRIMARY;
    public static final UniqueKey<SysShopRecord> KEY_SYS_SHOP_PRIMARY = UniqueKeys0.KEY_SYS_SHOP_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ForwarderSupplierRecord, Long> IDENTITY_FORWARDER_SUPPLIER = Internal.createIdentity(ForwarderSupplier.FORWARDER_SUPPLIER, ForwarderSupplier.FORWARDER_SUPPLIER.ID);
        public static Identity<MapSellerSkuSupplierRecord, Long> IDENTITY_MAP_SELLER_SKU_SUPPLIER = Internal.createIdentity(MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER, MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.ID);
        public static Identity<MapSellerSpuShopRecord, Long> IDENTITY_MAP_SELLER_SPU_SHOP = Internal.createIdentity(MapSellerSpuShop.MAP_SELLER_SPU_SHOP, MapSellerSpuShop.MAP_SELLER_SPU_SHOP.ID);
        public static Identity<PlatformSkuRecord, ULong> IDENTITY_PLATFORM_SKU = Internal.createIdentity(PlatformSku.PLATFORM_SKU, PlatformSku.PLATFORM_SKU.ID);
        public static Identity<PrepareSkuTagRecord, Long> IDENTITY_PREPARE_SKU_TAG = Internal.createIdentity(PrepareSkuTag.PREPARE_SKU_TAG, PrepareSkuTag.PREPARE_SKU_TAG.ID);
        public static Identity<SellerOnPrepareSkuListRecord, Long> IDENTITY_SELLER_ON_PREPARE_SKU_LIST = Internal.createIdentity(SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST, SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST.ID);
        public static Identity<SellerSkuRecord, Long> IDENTITY_SELLER_SKU = Internal.createIdentity(SellerSku.SELLER_SKU, SellerSku.SELLER_SKU.ID);
        public static Identity<SellerSpuRecord, Long> IDENTITY_SELLER_SPU = Internal.createIdentity(SellerSpu.SELLER_SPU, SellerSpu.SELLER_SPU.ID);
        public static Identity<SellerSpuImgRecord, Long> IDENTITY_SELLER_SPU_IMG = Internal.createIdentity(SellerSpuImg.SELLER_SPU_IMG, SellerSpuImg.SELLER_SPU_IMG.ID);
        public static Identity<SellerToPrepareSkuListRecord, Long> IDENTITY_SELLER_TO_PREPARE_SKU_LIST = Internal.createIdentity(SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST, SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.ID);
        public static Identity<SysShopRecord, Long> IDENTITY_SYS_SHOP = Internal.createIdentity(SysShop.SYS_SHOP, SysShop.SYS_SHOP.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ForwarderSupplierRecord> KEY_FORWARDER_SUPPLIER_PRIMARY = Internal.createUniqueKey(ForwarderSupplier.FORWARDER_SUPPLIER, "KEY_forwarder_supplier_PRIMARY", new TableField[] { ForwarderSupplier.FORWARDER_SUPPLIER.ID }, true);
        public static final UniqueKey<ForwarderSupplierRecord> KEY_FORWARDER_SUPPLIER_UK_MID_FSUPID = Internal.createUniqueKey(ForwarderSupplier.FORWARDER_SUPPLIER, "KEY_forwarder_supplier_uk_mid_fsupid", new TableField[] { ForwarderSupplier.FORWARDER_SUPPLIER.MERCHANT_ID, ForwarderSupplier.FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID }, true);
        public static final UniqueKey<MapSellerSkuSupplierRecord> KEY_MAP_SELLER_SKU_SUPPLIER_PRIMARY = Internal.createUniqueKey(MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER, "KEY_map_seller_sku_supplier_PRIMARY", new TableField[] { MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.ID }, true);
        public static final UniqueKey<MapSellerSkuSupplierRecord> KEY_MAP_SELLER_SKU_SUPPLIER_UK_MID_SKUID_SUPMID = Internal.createUniqueKey(MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER, "KEY_map_seller_sku_supplier_uk_mid_skuid_supmid", new TableField[] { MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID, MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.SELLER_SKU_ID, MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER.SUPPLIER_MERCHANT_ID }, true);
        public static final UniqueKey<MapSellerSpuShopRecord> KEY_MAP_SELLER_SPU_SHOP_PRIMARY = Internal.createUniqueKey(MapSellerSpuShop.MAP_SELLER_SPU_SHOP, "KEY_map_seller_spu_shop_PRIMARY", new TableField[] { MapSellerSpuShop.MAP_SELLER_SPU_SHOP.ID }, true);
        public static final UniqueKey<MapSellerSpuShopRecord> KEY_MAP_SELLER_SPU_SHOP_UK_MID_SHOPID_SELLERSPUID = Internal.createUniqueKey(MapSellerSpuShop.MAP_SELLER_SPU_SHOP, "KEY_map_seller_spu_shop_uk_mid_shopid_sellerspuid", new TableField[] { MapSellerSpuShop.MAP_SELLER_SPU_SHOP.MERCHANT_ID, MapSellerSpuShop.MAP_SELLER_SPU_SHOP.SHOP_ID, MapSellerSpuShop.MAP_SELLER_SPU_SHOP.SELLER_SPU_ID }, true);
        public static final UniqueKey<PlatformSkuRecord> KEY_PLATFORM_SKU_PRIMARY = Internal.createUniqueKey(PlatformSku.PLATFORM_SKU, "KEY_platform_sku_PRIMARY", new TableField[] { PlatformSku.PLATFORM_SKU.ID }, true);
        public static final UniqueKey<PlatformSkuRecord> KEY_PLATFORM_SKU_UK_MID_SHOPID_GOODSID_SKUID = Internal.createUniqueKey(PlatformSku.PLATFORM_SKU, "KEY_platform_sku_uk_mid_shopid_goodsid_skuid", new TableField[] { PlatformSku.PLATFORM_SKU.MERCHANT_ID, PlatformSku.PLATFORM_SKU.SHOP_ID, PlatformSku.PLATFORM_SKU.GOODS_ID, PlatformSku.PLATFORM_SKU.SKU_ID }, true);
        public static final UniqueKey<PrepareSkuTagRecord> KEY_PREPARE_SKU_TAG_PRIMARY = Internal.createUniqueKey(PrepareSkuTag.PREPARE_SKU_TAG, "KEY_prepare_sku_tag_PRIMARY", new TableField[] { PrepareSkuTag.PREPARE_SKU_TAG.ID }, true);
        public static final UniqueKey<SellerOnPrepareSkuListRecord> KEY_SELLER_ON_PREPARE_SKU_LIST_PRIMARY = Internal.createUniqueKey(SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST, "KEY_seller_on_prepare_sku_list_PRIMARY", new TableField[] { SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST.ID }, true);
        public static final UniqueKey<SellerSkuRecord> KEY_SELLER_SKU_PRIMARY = Internal.createUniqueKey(SellerSku.SELLER_SKU, "KEY_seller_sku_PRIMARY", new TableField[] { SellerSku.SELLER_SKU.ID }, true);
        public static final UniqueKey<SellerSpuRecord> KEY_SELLER_SPU_PRIMARY = Internal.createUniqueKey(SellerSpu.SELLER_SPU, "KEY_seller_spu_PRIMARY", new TableField[] { SellerSpu.SELLER_SPU.ID }, true);
        public static final UniqueKey<SellerSpuImgRecord> KEY_SELLER_SPU_IMG_PRIMARY = Internal.createUniqueKey(SellerSpuImg.SELLER_SPU_IMG, "KEY_seller_spu_img_PRIMARY", new TableField[] { SellerSpuImg.SELLER_SPU_IMG.ID }, true);
        public static final UniqueKey<SellerToPrepareSkuListRecord> KEY_SELLER_TO_PREPARE_SKU_LIST_PRIMARY = Internal.createUniqueKey(SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST, "KEY_seller_to_prepare_sku_list_PRIMARY", new TableField[] { SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.ID }, true);
        public static final UniqueKey<SysShopRecord> KEY_SYS_SHOP_PRIMARY = Internal.createUniqueKey(SysShop.SYS_SHOP, "KEY_sys_shop_PRIMARY", new TableField[] { SysShop.SYS_SHOP.ID }, true);
    }
}
