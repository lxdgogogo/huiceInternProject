package com.huice.service_fdk.dao;

import com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier;
import com.huice.service_fdk.myjooq.db.tables.records.ForwarderSupplierRecord;
import com.huice.service_fdk.service.vo.*;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import static com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier.FORWARDER_SUPPLIER;
import static com.huice.service_fdk.myjooq.db.tables.MapSellerSkuSupplier.MAP_SELLER_SKU_SUPPLIER;
import static com.huice.service_fdk.myjooq.db.tables.SellerOnPrepareSkuList.SELLER_ON_PREPARE_SKU_LIST;
import static com.huice.service_fdk.myjooq.db.tables.SellerSpu.SELLER_SPU;
import static com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST;

@Repository
public class ForwarderDao extends BaseDao {

    public ForwarderSummaryVO getForwarderSummaryVO(Long merchant_id) {
        return db.select(
                DSL.ifnull(DSL.sum(SELLER_TO_PREPARE_SKU_LIST.SKU_NUM), 0).as("skuSum"),
                DSL.count(SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID).as("skuCount")
        )
                .from(SELLER_TO_PREPARE_SKU_LIST)
                .where(SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.eq(merchant_id))
                .fetchAnyInto(ForwarderSummaryVO.class);
    }

    public SummarySumVO getSummarySumVO(Long merchant_id){
        Integer waitPushNum = db.select(
                DSL.ifnull(DSL.sum(SELLER_TO_PREPARE_SKU_LIST.SKU_NUM), 0).as("waitPushNum"))
                .from(SELLER_TO_PREPARE_SKU_LIST)
                .where(SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.eq(merchant_id))
                .fetchAnyInto(Integer.class);
        Integer pushedNum = db.select(
                DSL.ifnull(DSL.sum(SELLER_ON_PREPARE_SKU_LIST.PREPARE_NUM), 0).as("pushedNum"))
                .from(SELLER_ON_PREPARE_SKU_LIST)
                .where(SELLER_ON_PREPARE_SKU_LIST.MERCHANT_ID.eq(merchant_id))
                .fetchAnyInto(Integer.class);

        return new SummarySumVO(waitPushNum,pushedNum);

    }
    public List<ForwarderGoodsVO> getForwarderGoodsVOlist(Long merchant_id, List<Integer> spuIdList) {
        List<ForwarderGoodsVO> ans = new ArrayList<>();
        for(Integer spu:spuIdList){
            ForwarderGoodsVO view = db.select(
                    FORWARDER_SUPPLIER.BUSINESS.as("businessName"),
                    FORWARDER_SUPPLIER.CITY.as("cityName"),
                    FORWARDER_SUPPLIER.CITY_CODE,
                    FORWARDER_SUPPLIER.FLOOR.as("floorName"),
                    FORWARDER_SUPPLIER.FLOOR_CODE,
                    MAP_SELLER_SKU_SUPPLIER.SUPPLIER_ID,
                    SELLER_SPU.GOODS_NO,
                    MAP_SELLER_SKU_SUPPLIER.ITEM_NO,
                    FORWARDER_SUPPLIER.MARKET_CODE,
                    FORWARDER_SUPPLIER.MARKET.as("marketName"),
                    MAP_SELLER_SKU_SUPPLIER.PURCHASE_PRICE,
                    MAP_SELLER_SKU_SUPPLIER.REMARK,
                    MAP_SELLER_SKU_SUPPLIER.SELLER_SKU_ID,
                    MAP_SELLER_SKU_SUPPLIER.SELLER_SPU_ID,
                    SELLER_SPU.MAIN_IMG_URL.as("spuImg"),
                    SELLER_SPU.SPU_NAME,
                    MAP_SELLER_SKU_SUPPLIER.SUPPLIER_NAME
            )
                    .from(MAP_SELLER_SKU_SUPPLIER)
                    .innerJoin(FORWARDER_SUPPLIER)
                    .on(MAP_SELLER_SKU_SUPPLIER.SUPPLIER_ID.eq(FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID).and(FORWARDER_SUPPLIER.MERCHANT_ID.equal(merchant_id)))
                    .innerJoin(SELLER_SPU)
                    .on(SELLER_SPU.ID.eq(MAP_SELLER_SKU_SUPPLIER.SELLER_SPU_ID))
                    .where(MAP_SELLER_SKU_SUPPLIER.SELLER_SPU_ID.eq(Long.valueOf(spu)))
                    .fetchAnyInto(ForwarderGoodsVO.class);
            if(view != null ) ans.add(view);
        }
        return ans;
    }

    public List<ForwarderSupplierVO> getCityModelTree(){  // ?????????id
        return db.select(
                FORWARDER_SUPPLIER.BUSINESS,
                FORWARDER_SUPPLIER.CITY,
                FORWARDER_SUPPLIER.CITY_CODE,
                FORWARDER_SUPPLIER.FLOOR,
                FORWARDER_SUPPLIER.FLOOR_CODE,
                FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID,
                FORWARDER_SUPPLIER.GROUP_NAME,
                FORWARDER_SUPPLIER.MARKET,
                FORWARDER_SUPPLIER.MARKET_CODE,
                FORWARDER_SUPPLIER.SUPPLIER_NAME)
                .from(ForwarderSupplier.FORWARDER_SUPPLIER)
                .fetchInto(ForwarderSupplierVO.class);
    }

    public ForwarderSummaryVO getForwarderPushedSummaryVO(Long merchant_id) {
        return db.select(
                DSL.ifnull(DSL.sum(SELLER_TO_PREPARE_SKU_LIST.SKU_NUM), 0).as("skuSum"),
                DSL.count(SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID).as("skuCount")
        )
                .from(SELLER_TO_PREPARE_SKU_LIST)
                .where(SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID.eq(merchant_id))
                .fetchAnyInto(ForwarderSummaryVO.class);
    }

    public String getSupplierAssign(long merchantId, List<forwarderSkuMapDTO> forwarderSkuMapDTOs) {
        Integer size = forwarderSkuMapDTOs.size();
        for(forwarderSkuMapDTO forwarderSkuMapDTO:forwarderSkuMapDTOs) {
            BigDecimal calculation = new BigDecimal(Float.toString(forwarderSkuMapDTO.getPurchasePrice()));
            db.insertInto(MAP_SELLER_SKU_SUPPLIER)
                    .set(MAP_SELLER_SKU_SUPPLIER.MERCHANT_ID, merchantId)
                    .set(MAP_SELLER_SKU_SUPPLIER.SELLER_SKU_ID, forwarderSkuMapDTO.getSellerSkuId())
                    .set(MAP_SELLER_SKU_SUPPLIER.SELLER_SPU_ID, forwarderSkuMapDTO.getSellerSpuId())
                    .set(MAP_SELLER_SKU_SUPPLIER.SUPPLIER_ID, forwarderSkuMapDTO.getForwarderSupplierId())
                    .set(MAP_SELLER_SKU_SUPPLIER.REMARK, forwarderSkuMapDTO.getRemark())
                    .set(MAP_SELLER_SKU_SUPPLIER.ITEM_NO, forwarderSkuMapDTO.getItemNo())
                    .set(MAP_SELLER_SKU_SUPPLIER.PURCHASE_PRICE, calculation)
                    .set(MAP_SELLER_SKU_SUPPLIER.CREATED, LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai"))))
                    .set(MAP_SELLER_SKU_SUPPLIER.MODIFIED,LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai"))))
                    .set(MAP_SELLER_SKU_SUPPLIER.CITY,forwarderSkuMapDTO.getCityName())
        .set(MAP_SELLER_SKU_SUPPLIER.MARKET,forwarderSkuMapDTO.getMarketName())
        .set(MAP_SELLER_SKU_SUPPLIER.FLOOR,forwarderSkuMapDTO.getFloorName())
                    .set(MAP_SELLER_SKU_SUPPLIER.BUSINESS,forwarderSkuMapDTO.getBusinessName())
                            .set(MAP_SELLER_SKU_SUPPLIER.SUPPLIER_NAME,forwarderSkuMapDTO.getSupplierName())
                    .returning(MAP_SELLER_SKU_SUPPLIER.ID).fetchOne();
        }
        return "????????????"+size+"????????????????????????";
    }
}
