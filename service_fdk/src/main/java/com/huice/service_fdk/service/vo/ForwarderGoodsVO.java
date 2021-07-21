package com.huice.service_fdk.service.vo;

import lombok.Data;

@Data
public class ForwarderGoodsVO {
    private String businessName;//档口名称
    private String cityName;//城市名称
    private Long cityCode;//城市编码
    private String floorName;//楼层名称
    private Long floorCode;//楼层编码
    private Long forwarderSupplierId;//代拿端档口id
    private String goodsNo;//商家编码
    private String itemNo;//货号
    private Long marketCode;//市场编码
    private String marketName;//市场名称
    private Number purchasePrice;//拿货价
    private String remark;//备注
    private Long sellerSkuId;//销售商skuID
    private Long sellerSpuId;//销售商spuID
    private String spulmg;//spu图片
    private String spuName;//spu名称
    private String supplierName;//档口全称

    public String getBusinessName() {
        return businessName;
    }

    public String getCityName() {
        return cityName;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public String getFloorName() {
        return floorName;
    }

    public Long getFloorCode() {
        return floorCode;
    }

    public Long getForwarderSupplierId() {
        return forwarderSupplierId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public Long getMarketCode() {
        return marketCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public Number getPurchasePrice() {
        return purchasePrice;
    }

    public String getRemark() {
        return remark;
    }

    public Long getSellerSkuId() {
        return sellerSkuId;
    }

    public Long getSellerSpuId() {
        return sellerSpuId;
    }

    public String getSpulmg() {
        return spulmg;
    }

    public String getSpuName() {
        return spuName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public ForwarderGoodsVO(String businessName, String cityName, Long cityCode,
                            String floorName, Long floorCode, Long forwarderSupplierId,
                            String goodsNo, String itemNo, Long marketCode, String marketName,
                            Number purchasePrice, String remark, Long sellerSkuId, Long sellerSpuId,
                            String spulmg, String spuName, String supplierName) {
        this.businessName = businessName;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.floorName = floorName;
        this.floorCode = floorCode;
        this.forwarderSupplierId = forwarderSupplierId;
        this.goodsNo = goodsNo;
        this.itemNo = itemNo;
        this.marketCode = marketCode;
        this.marketName = marketName;
        this.purchasePrice = purchasePrice;
        this.remark = remark;
        this.sellerSkuId = sellerSkuId;
        this.sellerSpuId = sellerSpuId;
        this.spulmg = spulmg;
        this.spuName = spuName;
        this.supplierName = supplierName;
    }
}
