package com.hc.summer.service.data;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description 平台货品
 * @Author niuzhenyu
 * @Date 2021/7/10 13:42
 **/
@Data
public class PlatformSkuVO {

    private Long merchantId;

    private Long shopId;

    private Integer platformId;

    private String goodsId;

    private String goodsName;

    private String skuId;

    private String skuCode;

    private String skuName;

    private String outerId;

    private String skuOuterId;

    private BigDecimal price;

    private String imgUrl;

    private String mainImgUrl;

}
