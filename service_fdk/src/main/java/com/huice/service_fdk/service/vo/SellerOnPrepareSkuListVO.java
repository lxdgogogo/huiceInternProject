package com.huice.service_fdk.service.vo;

import lombok.Data;

@Data
public class SellerOnPrepareSkuListVO {
    private Integer id;
    private Integer merchant_id;
    private Integer supplier_id;
    private Integer seller_sku_id;
    private Integer prepare_num;
    private String created;
    private String modified;
    private Integer wish_more_prepare_num;
    private byte take_goods_type;
}
