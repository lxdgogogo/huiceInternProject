package com.huice.service_fdk.dao;

import com.huice.service_fdk.common.page.PageContent;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.common.page.PageParam;
import com.huice.service_fdk.service.vo.ForwarderSupplierVO;

import static com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier.FORWARDER_SUPPLIER;
import static com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PageForwarderSupplierDao extends BaseDao{
    public PageContentContainer<ForwarderSupplierVO> getPage(PageParam pageParam){
        PageContent<ForwarderSupplierVO> pageContent = new PageContent<>();
        int totalSukNum = db.select(SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID)
                .from(SELLER_TO_PREPARE_SKU_LIST)
                .fetchInto(Long.class).size();
        pageContent.setTotal(totalSukNum);
        List<ForwarderSupplierVO> forwarderSupplierVOList = db.select(
                FORWARDER_SUPPLIER.BUSINESS,
                FORWARDER_SUPPLIER.CITY,
                FORWARDER_SUPPLIER.CITY_CODE,
                FORWARDER_SUPPLIER.FLOOR,
                FORWARDER_SUPPLIER.FLOOR_CODE,
                FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID,
                FORWARDER_SUPPLIER.GROUP_NAME,
                FORWARDER_SUPPLIER.MARKET,
                FORWARDER_SUPPLIER.MARKET_CODE,
                FORWARDER_SUPPLIER.SUPPLIER_NAME
        )
                .from(FORWARDER_SUPPLIER)
                .innerJoin(SELLER_TO_PREPARE_SKU_LIST)
                .on(SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.eq(FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID))
                .limit(pageParam.getPageSize())
                .offset((pageParam.getPage()-1)* pageParam.getPageSize())
                .fetchInto(ForwarderSupplierVO.class);
        pageContent.setList(forwarderSupplierVOList);
        return pageContent;
    }
}
