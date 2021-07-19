package com.huice.service_fdk.dao;

import com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList;
import com.huice.service_fdk.service.ForwarderSummaryVO;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import static com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST;

@Repository
public class ForwarderDao extends BaseDao {

    public ForwarderSummaryVO getForwarderSummaryVO(Integer merchant_id) {
        return db.select(
                DSL.ifnull(DSL.sum(SELLER_TO_PREPARE_SKU_LIST.SKU_NUM), 0).as("skuSum"),
                DSL.count(SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID).as("skuCount")
        )
                .from(SELLER_TO_PREPARE_SKU_LIST)
                .where(SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.eq(Long.valueOf(merchant_id)))
                .fetchAnyInto(ForwarderSummaryVO.class);
    }
}
