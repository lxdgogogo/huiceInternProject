package com.huice.service_fdk.dao;

import com.huice.service_fdk.myjooq.db.tables.PrepareSkuTag;
import com.huice.service_fdk.myjooq.db.tables.SellerOnPrepareSkuList;
import com.huice.service_fdk.myjooq.db.tables.SellerSku;
import com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList;
import com.huice.service_fdk.service.vo.SellerOnPrepareSkuListVO;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST;

@Repository
public class WannaDao extends BaseDao {
    public Integer setSubmitForwarderVO(boolean selectedAll, List<Integer> spuIds) {
        List<SellerOnPrepareSkuListVO> lst = new ArrayList<>();

        if (selectedAll) {
            List<Integer> SpuIdList = db.select(SELLER_TO_PREPARE_SKU_LIST.ID).from(SELLER_TO_PREPARE_SKU_LIST).fetchInto(Integer.class);
            for (Integer spuId : SpuIdList) {
                SellerOnPrepareSkuListVO view = db.select(
                        SELLER_TO_PREPARE_SKU_LIST.ID.as("id"),
                        SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.as("merchant_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.as("supplier_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID.as("seller_sku_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SKU_NUM.as("prepare_num"),
                        SELLER_TO_PREPARE_SKU_LIST.CREATED.as("created"),
                        SELLER_TO_PREPARE_SKU_LIST.MODIFIED.as("modified"),
                        SELLER_TO_PREPARE_SKU_LIST.TAKE_GOODS_TYPE.as("take_goods_type")
                )
                        .from(SELLER_TO_PREPARE_SKU_LIST)
                        //on为最接近筛选的条件，where为最接近查询的条件，即先where，成立后判定on，该出where筛选apuid，on判定含有spuid的表与toprepare的eq
                        .where(SELLER_TO_PREPARE_SKU_LIST.ID.eq(Long.valueOf(spuId)))
                        .fetchAnyInto(SellerOnPrepareSkuListVO.class);
                if (view != null) lst.add(view);
            }
            pushSellerOnPrepareSkuList(lst);
            return 1;
        } else {
            for (Integer spuId : spuIds) {
                SellerOnPrepareSkuListVO view = db.select(
                        SELLER_TO_PREPARE_SKU_LIST.ID.as("id"),
                        SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.as("merchant_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.as("supplier_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID.as("seller_sku_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SKU_NUM.as("prepare_num"),
                        SELLER_TO_PREPARE_SKU_LIST.CREATED.as("created"),
                        SELLER_TO_PREPARE_SKU_LIST.MODIFIED.as("modified"),
                        SELLER_TO_PREPARE_SKU_LIST.TAKE_GOODS_TYPE.as("take_goods_type")
                )
                        .from(SELLER_TO_PREPARE_SKU_LIST)
                        .innerJoin(SellerSku.SELLER_SKU)
                        //on为最接近筛选的条件，where为最接近查询的条件，即先where，成立后判定on，该出where筛选apuid，on判定含有spuid的表与toprepare的eq
                        .on(SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.eq(PrepareSkuTag.PREPARE_SKU_TAG.SUPPLIER_ID))
                        .where(PrepareSkuTag.PREPARE_SKU_TAG.SPU_ID.eq(Long.valueOf(spuId)))
                        .fetchAnyInto(SellerOnPrepareSkuListVO.class);
                if (view != null) lst.add(view);
            }
            pushSellerOnPrepareSkuList(lst);
            return 2;
        }

    }

    public String pushSellerOnPrepareSkuList(List<SellerOnPrepareSkuListVO> lst) {
        for (SellerOnPrepareSkuListVO id : lst) {
            db.insertInto(SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST)
                    .set(DSL.field(""), SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST.ID)
                    .set(DSL.field(SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST.MERCHANT_ID), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID)
                    .set(DSL.field(SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST.SUPPLIER_ID), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID)
                    .set(DSL.field("seller_sku_id"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID)
                    .set(DSL.field("prepare_num"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SKU_NUM)
                    .set(DSL.field("created"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.CREATED)
                    .set(DSL.field("modified"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MODIFIED)
                    //.set(DSL.field("wish_more_prepare_num"),SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TRADE_NO)
                    .set(DSL.field("prior_prepare_num"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.PRIOR_DELIVERY_FLAG)
                    .set(DSL.field("take_goods_type"), SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TAKE_GOODS_TYPE)
                    .execute();
        }
        return "Push success!";
    }
}