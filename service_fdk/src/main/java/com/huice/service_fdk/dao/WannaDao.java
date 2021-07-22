package com.huice.service_fdk.dao;

import com.huice.service_fdk.entity.FetchOrder;
import com.huice.service_fdk.myjooq.db.tables.PrepareSkuTag;
import com.huice.service_fdk.service.vo.SellerOnPrepareSkuListVO;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier.FORWARDER_SUPPLIER;
import static com.huice.service_fdk.myjooq.db.tables.MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER;
import static com.huice.service_fdk.myjooq.db.tables.PlatformSku.PLATFORM_SKU;
import static com.huice.service_fdk.myjooq.db.tables.SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST;
import static com.huice.service_fdk.myjooq.db.tables.SellerSku.SELLER_SKU;
import static com.huice.service_fdk.myjooq.db.tables.SellerSpu.SELLER_SPU;
import static com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST;

@Repository
public class WannaDao extends BaseDao {
    private List<FetchOrder> fetchOrder = new ArrayList<>();
    private List<SellerOnPrepareSkuListVO> lst = new ArrayList<>();

    public List<FetchOrder> setSubmitForwarderVO(boolean selectedAll, List<Integer> spuIds) {
        // 更新数据表SELLER_ON_PREPARE_SKU_LIST
        if (selectedAll) {
            List<Integer> IdList = db.select(SELLER_TO_PREPARE_SKU_LIST.ID).from(SELLER_TO_PREPARE_SKU_LIST).fetchInto(Integer.class);
            for (Integer Id : IdList) {
                SellerOnPrepareSkuListVO view = db.select(
                        //SELLER_TO_PREPARE_SKU_LIST.ID.as("id"),
                        SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.as("merchant_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.as("supplier_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID.as("seller_sku_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SKU_NUM.as("prepare_num"),
                        SELLER_TO_PREPARE_SKU_LIST.CREATED.as("created"),
                        SELLER_TO_PREPARE_SKU_LIST.MODIFIED.as("modified"),
                        SELLER_TO_PREPARE_SKU_LIST.PRIOR_DELIVERY_FLAG.as("prior_prepare_num"),
                        SELLER_TO_PREPARE_SKU_LIST.TAKE_GOODS_TYPE.as("take_goods_type")
                )
                        .from(SELLER_TO_PREPARE_SKU_LIST)
                        //on为最接近筛选的条件，where为最接近查询的条件，即先where，成立后判定on，该出where筛选apuid，on判定含有spuid的表与toprepare的eq
                        .where(SELLER_TO_PREPARE_SKU_LIST.ID.eq(Long.valueOf(Id)))
                        .fetchAnyInto(SellerOnPrepareSkuListVO.class);
                if (view != null) lst.add(view);
            }
        } else {
            for (Integer spuId : spuIds) {
                SellerOnPrepareSkuListVO view = db.select(
                        //SELLER_TO_PREPARE_SKU_LIST.ID.as("id"),
                        SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.as("merchant_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.as("supplier_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID.as("seller_sku_id"),
                        SELLER_TO_PREPARE_SKU_LIST.SKU_NUM.as("prepare_num"),
                        SELLER_TO_PREPARE_SKU_LIST.CREATED.as("created"),
                        SELLER_TO_PREPARE_SKU_LIST.MODIFIED.as("modified"),
                        SELLER_TO_PREPARE_SKU_LIST.PRIOR_DELIVERY_FLAG.as("prior_prepare_num"),
                        SELLER_TO_PREPARE_SKU_LIST.TAKE_GOODS_TYPE.as("take_goods_type")
                )
                        .from(SELLER_TO_PREPARE_SKU_LIST)
                        .innerJoin(SELLER_SKU)
                        //on为最接近筛选的条件，where为最接近查询的条件，即先where，成立后判定on，该出where筛选apuid，on判定含有spuid的表与toprepare的eq
                        .on(SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID.eq(PrepareSkuTag.PREPARE_SKU_TAG.SUPPLIER_ID))
                        .where(PrepareSkuTag.PREPARE_SKU_TAG.SPU_ID.eq(Long.valueOf(spuId)))
                        .fetchAnyInto(SellerOnPrepareSkuListVO.class);
                if (view != null) lst.add(view);
            }
        }
        pushSellerOnPrepareSkuList(lst);

        // FetchOrder列表，用于存储推送给代拿的数据
        List<Long> MerchantIdList = db.select(SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID).from(SELLER_TO_PREPARE_SKU_LIST).fetchInto(Long.class);
        for (Long merchantId : MerchantIdList) {
            FetchOrder view = db.select(
                    FORWARDER_SUPPLIER.MERCHANT_ID.as("merchantId"),
                    FORWARDER_SUPPLIER.CITY_CODE.as("cityId"),
                    FORWARDER_SUPPLIER.MARKET_CODE.as("marketId"),
                    FORWARDER_SUPPLIER.FLOOR_CODE.as("floorCode"),
                    FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID.as("bizId"),
                    FORWARDER_SUPPLIER.CITY.as("cityName"),
                    FORWARDER_SUPPLIER.MARKET.as("marketName"),
                    FORWARDER_SUPPLIER.BUSINESS.as("bizName"),
                    FORWARDER_SUPPLIER.SUPPLIER_NAME.as("sellerName"),
                    PLATFORM_SKU.GOODS_ID.as("platformSpuId"),
                    PLATFORM_SKU.SKU_ID.as("platformSkuId"),
                    PLATFORM_SKU.GOODS_NAME.as("platformSkuName"),
                    PLATFORM_SKU.BARCODE.as("platformBarcode"),
                    PLATFORM_SKU.SKU_NAME.as("skuName"),
                    MAP_SELLER_SKU_SUPPLIER.PURCHASE_PRICE.as("refFetchPrice"),
                    SELLER_SPU.GOODS_NO.as("spuGoodsNo")

            )
                    .from(FORWARDER_SUPPLIER)
                    .innerJoin(PLATFORM_SKU)
                    .on(FORWARDER_SUPPLIER.MERCHANT_ID.eq(PLATFORM_SKU.MERCHANT_ID))
                    .and(MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID.eq(PLATFORM_SKU.MERCHANT_ID))
                    .and(SELLER_SPU.MERCHANT_ID.eq(PLATFORM_SKU.MERCHANT_ID))
                    .where(FORWARDER_SUPPLIER.MERCHANT_ID.eq(merchantId))
                    .fetchAnyInto(FetchOrder.class);
            if (view != null) fetchOrder.add(view);
        }
        return fetchOrder;
    }

    public String pushSellerOnPrepareSkuList(List<SellerOnPrepareSkuListVO> lst) {
        for (SellerOnPrepareSkuListVO i : lst) {
            db.insertInto(SELLER_ON_PREPARE_SKU_LIST)
                    .set(SELLER_ON_PREPARE_SKU_LIST.MERCHANT_ID, i.getMerchant_id())
                    .set(SELLER_ON_PREPARE_SKU_LIST.SUPPLIER_ID, i.getSupplier_id())
                    .set(SELLER_ON_PREPARE_SKU_LIST.SELLER_SKU_ID, i.getSeller_sku_id())
                    .set(SELLER_ON_PREPARE_SKU_LIST.PREPARE_NUM, i.getPrepare_num())
                    .set(SELLER_ON_PREPARE_SKU_LIST.CREATED, LocalDateTime.now())
                    .set(SELLER_ON_PREPARE_SKU_LIST.MODIFIED, i.getModified())
                    .set(SELLER_ON_PREPARE_SKU_LIST.WISH_MORE_PREPARE_NUM, i.getWish_more_prepare_num())
                    .set(SELLER_ON_PREPARE_SKU_LIST.PRIOR_PREPARE_NUM, i.getPrior_prepare_num())
                    .set(SELLER_ON_PREPARE_SKU_LIST.TAKE_GOODS_TYPE, i.getTake_goods_type())
                    .execute();
        }
        return "Push success!";
    }
}