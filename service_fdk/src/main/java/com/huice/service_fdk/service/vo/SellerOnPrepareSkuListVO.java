package com.huice.service_fdk.service.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class SellerOnPrepareSkuListVO {
    private Integer id;
    private Long merchant_id;
    private Long supplier_id;
    private Long seller_sku_id;
    private BigDecimal prepare_num;
    private LocalDateTime created = LocalDateTime.now();
    private LocalDateTime modified;
    private BigDecimal wish_more_prepare_num = new BigDecimal(0);
    private BigDecimal prior_prepare_num;
    private byte take_goods_type;
}
