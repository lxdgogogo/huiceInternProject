package com.huice.service_forwarder.dao;

import com.huice.service_forwarder.controller.query.OnGettingList;
import com.huice.service_forwarder.controller.query.SupplierListQuery;
import com.huice.service_forwarder.db.tables.records.SellerFetchOrderRecord;
import com.huice.service_forwarder.entity.FetchOrder;
import com.huice.service_forwarder.entity.SpuNameAndUrl;
import org.jooq.Condition;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import static com.huice.service_forwarder.db.tables.SellerFetchOrder.SELLER_FETCH_ORDER;
import static com.huice.service_forwarder.db.tables.PlatformSpu.PLATFORM_SPU;
import static org.jooq.impl.DSL.concat;
import static org.jooq.impl.DSL.noCondition;
/**
 * @author SoonMachine
 */
@Repository
public class FetchOrderDao extends BaseDao{
    public List<FetchOrder> takeGoodsInList(){
        return this.db.select()
                .from(SELLER_FETCH_ORDER)
                .fetchInto(FetchOrder.class);
    }

    public List<FetchOrder> fetchOrdersByQuery(SupplierListQuery supplierListQuery){
        Condition condition = noCondition();
        if (supplierListQuery.getStatus() != null){
            condition.and(SELLER_FETCH_ORDER.STATUS.eq(supplierListQuery.getStatus()));
        }
        if (supplierListQuery.getCityId() != null){
            condition.and(SELLER_FETCH_ORDER.CITY_ID.eq(supplierListQuery.getCityId()));
        }
        if (supplierListQuery.getBizFullName() != null){
            condition.and(SELLER_FETCH_ORDER.BIZ_NAME.eq(supplierListQuery.getBizFullName()));
        }
        if (supplierListQuery.getSpuGoodsNo() != null){
            condition.and(SELLER_FETCH_ORDER.SPU_GOODS_NO.like(concat("%",supplierListQuery.getSpuGoodsNo(),"%")));
        }
        if (supplierListQuery.getMarketId() != null){
            condition.and(SELLER_FETCH_ORDER.MARKET_ID.eq(supplierListQuery.getMarketId()));
        }

        return this.db.select()
                .from(SELLER_FETCH_ORDER)
                .where(condition)
                .fetchInto(FetchOrder.class);
    }

    public List<FetchOrder> onTakingGoodList(OnGettingList onGettingList){
        Condition condition = noCondition();
        if (onGettingList.getBizFullName() != null){
            condition.and(SELLER_FETCH_ORDER.BIZ_NAME.eq(onGettingList.getBizFullName()));
        }
        if (onGettingList.getCityId() != null){
            condition.and(SELLER_FETCH_ORDER.CITY_ID.eq(onGettingList.getCityId()));
        }

        if (onGettingList.getMarketId() != null){
            condition.and(SELLER_FETCH_ORDER.MARKET_ID.eq(onGettingList.getMarketId()));
        }

        if (onGettingList.getMerchantId() != null){
            condition.and(SELLER_FETCH_ORDER.MERCHANT_ID.eq(onGettingList.getMerchantId()));
        }

        if (onGettingList.getStatus() != null){
            condition.and(SELLER_FETCH_ORDER.STATUS.eq(onGettingList.getStatus()));
        }

        if (onGettingList.getPageIndex() != null && onGettingList.getPageSize() != null){
            return db.select()
                    .from(SELLER_FETCH_ORDER)
                    .where(condition)
                    .limit(onGettingList.getPageSize())
                    .offset((onGettingList.getPageIndex() - 1) * onGettingList.getPageSize())
                    .fetchInto(FetchOrder.class);
        }else {
            return db.select()
                    .from(SELLER_FETCH_ORDER)
                    .where(condition)
                    .fetchInto(FetchOrder.class);
        }
    }
    public SpuNameAndUrl querySpuUrl(Long spuId){
        List<SpuNameAndUrl> spuNameAndUrls = db.select(PLATFORM_SPU.SPU_NAME.as("spuName"), PLATFORM_SPU.MAIN_IMG_URL.as("spuUrl"))
                .from(PLATFORM_SPU)
                .where(PLATFORM_SPU.ID.eq(spuId))
                .fetchInto(SpuNameAndUrl.class);
        if (!spuNameAndUrls.isEmpty()){
            return spuNameAndUrls.get(0);
        }else {
            SpuNameAndUrl spuNameAndUrl = new SpuNameAndUrl();
            spuNameAndUrl.setSpuUrl("dnmd");
            spuNameAndUrl.setSpuName("dnmd");
            return spuNameAndUrl;
        }
    }


    public Long insert(FetchOrder fetchOrder){
        SellerFetchOrderRecord sellerFetchOrderRecord = db.newRecord(SELLER_FETCH_ORDER);

        sellerFetchOrderRecord.setId(fetchOrder.getId());

        sellerFetchOrderRecord.setMerchantId(fetchOrder.getMerchantId());

        sellerFetchOrderRecord.setCityId(fetchOrder.getCityId());

        sellerFetchOrderRecord.setMarketId(fetchOrder.getMarketId());

        sellerFetchOrderRecord.setFloorCode(fetchOrder.getFloorCode());

        sellerFetchOrderRecord.setBizId(fetchOrder.getBizId());

        sellerFetchOrderRecord.setSellerOrderId(fetchOrder.getSellerOrderId());

        sellerFetchOrderRecord.setPlatformSpuId(fetchOrder.getPlatformSpuId());

        sellerFetchOrderRecord.setPlatformSkuId(fetchOrder.getPlatformSkuId());

        sellerFetchOrderRecord.setBillId(fetchOrder.getBillId());

        sellerFetchOrderRecord.setPlatformSkuName(fetchOrder.getPlatformSkuName());

        sellerFetchOrderRecord.setSellerQrCode(fetchOrder.getSellerQrCode());

        sellerFetchOrderRecord.setSellerName(fetchOrder.getSellerName());

        sellerFetchOrderRecord.setSellerShortName(fetchOrder.getSellerShortName());

        sellerFetchOrderRecord.setPlatformBarcode(fetchOrder.getPlatformBarcode());

        sellerFetchOrderRecord.setCityName(fetchOrder.getCityName());

        sellerFetchOrderRecord.setMarketName(fetchOrder.getMarketName());

        sellerFetchOrderRecord.setBizName(fetchOrder.getBizName());

        sellerFetchOrderRecord.setSpuGoodsNo(fetchOrder.getSpuGoodsNo());

        sellerFetchOrderRecord.setSkuName(fetchOrder.getSkuName());

        sellerFetchOrderRecord.setRefFetchPrice(BigDecimal.valueOf(fetchOrder.getRefFetchPrice()));

        sellerFetchOrderRecord.setRealFetchPrice(BigDecimal.valueOf(fetchOrder.getRealFetchPrice()));

        sellerFetchOrderRecord.setStatus((byte) 2);

        sellerFetchOrderRecord.setTagPrintFlag(fetchOrder.getTagPrintFlag());

        sellerFetchOrderRecord.setCreated(new Timestamp(new Date().getTime()));

        sellerFetchOrderRecord.setModified(new Timestamp(new Date().getTime()));

        sellerFetchOrderRecord.insert();

        return sellerFetchOrderRecord.getId();

    }
}
