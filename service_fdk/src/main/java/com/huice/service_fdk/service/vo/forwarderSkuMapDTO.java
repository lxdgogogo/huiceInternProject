package com.huice.service_fdk.service.vo;
import lombok.Data;

/**
 *代拿汇总 - 待推送(左侧) （获取待推送汇总数据）
 */
@Data
public class forwarderSkuMapDTO {
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
    private Float purchasePrice;//拿货价
    private String remark;//备注
    private Long sellerSkuId;//销售商skuID
    private Long sellerSpuId;//销售商spuID
    private String supplierName;//档口全称
}
