package com.huice.service_fdk.dao;

import com.huice.service_fdk.entity.ManuallydownloadProductParam;
import com.huice.service_fdk.myjooq.db.tables.records.PlatformSkuRecord;
import com.huice.service_fdk.service.vo.SpuGoodsVO;
import org.springframework.stereotype.Repository;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.huice.service_fdk.myjooq.db.tables.MapSellerSpuShop.MAP_SELLER_SPU_SHOP;
import static com.huice.service_fdk.myjooq.db.tables.PlatformSku.PLATFORM_SKU;
import static com.huice.service_fdk.myjooq.db.tables.SellerSku.SELLER_SKU;
import static com.huice.service_fdk.myjooq.db.tables.SellerSpu.SELLER_SPU;

@Repository
public class Platform_skuDao extends BaseDao{
    public String getnewDownload(ManuallydownloadProductParam param, long merchant_id) {
        String endTime = param.getEndTime();
        String startTime = param.getStartTime();
        List<PlatformSkuRecord> ans = new ArrayList<>();
        List<SpuGoodsVO> spulist = new ArrayList<>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate endTimel = LocalDate.parse(endTime, dateTimeFormatter);
        LocalDate startTimel = LocalDate.parse(startTime, dateTimeFormatter);
        Map<Integer, String> shopids = param.getShopIds();
        byte goodsStatus = param.getGoodsStatus();
        if (goodsStatus == 1 || goodsStatus == 2 || goodsStatus == 3 || goodsStatus == 4) {
            for (Integer shopid : shopids.keySet()) {
                ans.addAll(db.select().
                        from(PLATFORM_SKU).
                        where(PLATFORM_SKU.MERCHANT_ID.eq(merchant_id).
                                and(PLATFORM_SKU.SHOP_ID.eq(Long.valueOf(shopid))).
                                and(PLATFORM_SKU.MODIFIED.between(startTimel.atStartOfDay(), endTimel.atStartOfDay())).
                                and(PLATFORM_SKU.SALE_STATUS.eq(goodsStatus))
                        ).
                        fetchInto(PlatformSkuRecord.class));

            }
        }
        else{
            for (Integer shopid : shopids.keySet()) {
                ans.addAll(db.select().
                        from(PLATFORM_SKU).
                        where(PLATFORM_SKU.MERCHANT_ID.eq(merchant_id).
                                and(PLATFORM_SKU.SHOP_ID.eq(Long.valueOf(shopid))).
                                and(PLATFORM_SKU.MODIFIED.between(startTimel.atStartOfDay(), endTimel.atStartOfDay()))
                        ).
                        fetchInto(PlatformSkuRecord.class));
            }}

        String s=ans.toString();
        int count = ans.size();
        s += "已成功下载货品信息"+count+"条";
        HashMap<String,Long> map = new HashMap<>();
        HashMap<SpuGoodsVO,List<PlatformSkuRecord>> mapX = new HashMap<>();
        //spu维度更新表
        for (PlatformSkuRecord vo : ans) {
            SpuGoodsVO spuGoodsVO = new SpuGoodsVO();
            spuGoodsVO.setGOODS_ID(vo.getGoodsId());
            spuGoodsVO.setGOODS_NAME(vo.getGoodsName());
            spuGoodsVO.setPLATFORM_ID(vo.getPlatformId());
            spuGoodsVO.setOUTER_ID(vo.getOuterId());
            spuGoodsVO.setMAIN_IMG_URL(vo.getMainImgUrl());
            spuGoodsVO.setSHOP_ID(vo.getShopId());
            List<PlatformSkuRecord> list = mapX.getOrDefault(spuGoodsVO,new ArrayList<>());
            list.add(vo);
            mapX.put(spuGoodsVO,list);
        }
        for(SpuGoodsVO spuGoodsVO: mapX.keySet()){
            Long tmp = db.insertInto(SELLER_SPU)
                    .set(SELLER_SPU.MERCHANT_ID, merchant_id)
                    .set(SELLER_SPU.SPU_NAME, spuGoodsVO.getGOODS_NAME())
                    .set(SELLER_SPU.PLATFORM_ID, spuGoodsVO.getPLATFORM_ID())
                    .set(SELLER_SPU.GOODS_ID, spuGoodsVO.getGOODS_ID())
                    .set(SELLER_SPU.GOODS_NO, spuGoodsVO.getOUTER_ID())
                    .set(SELLER_SPU.SOURCE, (byte) (2 & 0xFF))
                    .set(SELLER_SPU.SALE_STATUS, goodsStatus)
                    .set(SELLER_SPU.CREATED, LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai"))))
                    .set(SELLER_SPU.MODIFIED, LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai"))))
                    .set(SELLER_SPU.MAIN_IMG_URL, spuGoodsVO.getMAIN_IMG_URL())
                    .returning(SELLER_SPU.ID).fetchOne().getId();
            assert tmp != null;
            db.insertInto(MAP_SELLER_SPU_SHOP)
                    .set(MAP_SELLER_SPU_SHOP.MERCHANT_ID,merchant_id)
                    .set(MAP_SELLER_SPU_SHOP.SELLER_SPU_ID,tmp)
                    .set(MAP_SELLER_SPU_SHOP.CREATED,LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai"))))
                    .set(MAP_SELLER_SPU_SHOP.MODIFIED,LocalDateTime.now(Clock.system(ZoneId.of("Asia/Shanghai"))))
                    .set(MAP_SELLER_SPU_SHOP.SHOP_ID,spuGoodsVO.getSHOP_ID())
                    .returning(MAP_SELLER_SPU_SHOP.ID).fetchOne();
            map.put(spuGoodsVO.getGOODS_ID(),tmp);
        }
        //sku维度更新表
        for(PlatformSkuRecord platformSkuRecord:ans){
            String[] strs = platformSkuRecord.getBarcode().split(",", -1);
            db.insertInto(SELLER_SKU)
                    .set(SELLER_SKU.MERCHANT_ID, merchant_id)
                    .set(SELLER_SKU.PLATFORM_SKU_REC_ID,Long.parseLong(platformSkuRecord.getSkuId()))
                    .set(SELLER_SKU.SOURCE_TYPE, (byte)(2 & 0xFF))
                    .set(SELLER_SKU.SALE_STATUS,goodsStatus)
                    .set(SELLER_SKU.SPU_ID,map.get(platformSkuRecord.getGoodsId()))
                    .set(SELLER_SKU.SKU_NAME,platformSkuRecord.getSkuName())
                    .set(SELLER_SKU.SKU_NO,platformSkuRecord.getSkuOuterId())
                    .set(SELLER_SKU.SKU_CODE,platformSkuRecord.getSkuCode())
                    .set(SELLER_SKU.BARCODE_NUM,(short)(strs.length-1))
                    .set(SELLER_SKU.REAL_NUM,platformSkuRecord.getStockNum())
                    .set(SELLER_SKU.OCCUPIED_NUM,platformSkuRecord.getHoldStock())
                    .set(SELLER_SKU.RETAIL_PRICE,platformSkuRecord.getPrice())
                    .set(SELLER_SKU.IMG_URL,platformSkuRecord.getImgUrl())
                    .set(SELLER_SKU.CREATED,platformSkuRecord.getCreated())
                    .set(SELLER_SKU.MODIFIED,platformSkuRecord.getModified())
            .returning(SELLER_SKU.ID).fetchOne();
        }
        return s;
        }

    }
