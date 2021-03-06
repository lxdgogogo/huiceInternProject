package com.huice.service_fdk.service.vo;

import lombok.Data;

import java.util.List;

@Data
public class SPU {
    private String goodsLink;//宝贝链接
    private String goodsNo;//货品spu商家编码
    private String mainImgUrl;//图片 url
    private boolean multiSupplier;//是否为一货多供的标识
    private List<SKUItemVO> skuList;//sku 们
    private String spuGoodsNo;//货号
    private int spuId;//货品id
    private String spuName;//货品名称
}
