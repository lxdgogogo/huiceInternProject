package com.huice.service_fdk.dao;

import com.huice.service_fdk.common.page.PageContent;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.common.page.PageParam;

import static com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier.FORWARDER_SUPPLIER;
import static com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST;
import static com.huice.service_fdk.myjooq.db.tables.SellerSpu.SELLER_SPU;
import static com.huice.service_fdk.myjooq.db.tables.SellerSku.SELLER_SKU;
import static com.huice.service_fdk.myjooq.db.tables.MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER;

import com.huice.service_fdk.service.vo.SKUItemVO;
import com.huice.service_fdk.service.vo.SPU;
import com.huice.service_fdk.service.vo.SupplierGoodsList;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PageForwarderSupplierDao extends BaseDao{
    public PageContentContainer<SupplierGoodsList> getPage(){
        PageContent<SupplierGoodsList> pageContent = new PageContent<>();
        int totalSkuNum = db.select(SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID)
                .from(SELLER_TO_PREPARE_SKU_LIST)
                .fetchInto(Long.class).size();
        pageContent.setTotal(totalSkuNum);
        List<SupplierGoodsList> forwarderSupplierVOList = db.select(
                null,
                FORWARDER_SUPPLIER.GROUP_NAME,
                FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID,
                FORWARDER_SUPPLIER.SUPPLIER_NAME,
                null,
                null
        )
                .from(FORWARDER_SUPPLIER)
                .innerJoin(SELLER_TO_PREPARE_SKU_LIST)
                .on(SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.eq(FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID))
                .fetchInto(SupplierGoodsList.class);
        pageContent.setList(forwarderSupplierVOList);
        return pageContent;
    }

    public List<SPU> getSpuList(List<Long> supplierIds){
        return db.select(
                SELLER_SPU.GOODS_LINK,
                SELLER_SPU.GOODS_NO,
                SELLER_SPU.MAIN_IMG_URL,
                null,
                //是否为一货多供标识？
                SELLER_SPU.SPU_GOODS_NO,
                SELLER_SPU.GOODS_ID,
                SELLER_SPU.SPU_NAME
        )
                .from(SELLER_SPU)
                .innerJoin(FORWARDER_SUPPLIER)
                .on(FORWARDER_SUPPLIER.MERCHANT_ID.eq(SELLER_SPU.MERCHANT_ID))
                .where(FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID.in(supplierIds))
                .fetchInto(SPU.class);
    }

    public List<SKUItemVO> getSkuList(List<Long> supplierIds, PageParam pageParam){

        return db.select(
                SELLER_TO_PREPARE_SKU_LIST.SKU_NUM,
                null,
                SELLER_SKU.PLATFORM_SKU_REC_ID,
                SELLER_SKU.SKU_NAME,
                MAP_SELLER_SKU_SUPPLIER.SUPPLIER_ID,
                SELLER_SKU.SPU_ID
        )
                .from(SELLER_SKU)
                .innerJoin(MAP_SELLER_SKU_SUPPLIER)
                .on(SELLER_SKU.MERCHANT_ID.eq(MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID))
                .innerJoin(SELLER_TO_PREPARE_SKU_LIST)
                .on(SELLER_SKU.PLATFORM_SKU_REC_ID.eq(SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID))
                .where(MAP_SELLER_SKU_SUPPLIER.SUPPLIER_ID.in(supplierIds))
                .limit(pageParam.getPageSize())
                .offset((pageParam.getPage()-1)*pageParam.getPageSize())
                .fetchInto(SKUItemVO.class);
    }

}
