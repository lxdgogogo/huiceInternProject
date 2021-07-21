package com.huice.service_fdk.service.vo;

import lombok.Data;

@Data
public class SKUItemVO {
    private int orderSkuNum;//系统子单中的SKU数量
    private Number purchasePrice;//拿货价
    private int sellerSkuId;
    private String skuName;//单品名称
    private long supplierId;//供应商 id
    private long sellerSpuId;//spu对应的skuID
}
