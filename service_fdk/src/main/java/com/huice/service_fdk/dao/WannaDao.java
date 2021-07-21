package com.huice.service_fdk.dao;

import com.huice.service_fdk.myjooq.db.tables.SellerOnPrepareSkuList;
import com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

@Repository
public class WannaDao extends BaseDao {
    // public WannaDao
    public void setSubmitForwarderVO() {
        db.insertInto(SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST)
                .set(DSL.field("merchant_id"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID)
                .set(DSL.field("supplier_id"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID)
                .set(DSL.field("seller_sku_id"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID)
                .set(DSL.field("prepare_num"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SKU_NUM)
                .set(DSL.field("created"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.CREATED)
                .set(DSL.field("modified"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MODIFIED)
                //.set(DSL.field("wish_more_prepare_num"),SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TRADE_NO)
                .set(DSL.field("prior_prepare_num"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.PRIOR_DELIVERY_FLAG)
                .set(DSL.field("take_goods_type"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TAKE_GOODS_TYPE)
                .execute();
    }

}
