package com.huice.service_fdk.service.vo;

import lombok.Data;

/*
 需求：十四、货品列表
 接口描述:  查SPU/SKU列表，按SPU/SKU条数分页，并按SPU聚合展示
 响应参数:  data-list-spuSupplierInfoList  一货多供需求新增 供货商-货号列表 可能为空（供货商不存在的情况）
 接口地址:  /seller/goods/queryPage
 请求方式： POST
 */

@Data
public class spuSupplierInfoList {
    private boolean fromSingle;
    private Integer mainFlag;
    private int purchasePrice;
    private String remarks;
    private Integer sellerSpuId;
    private String spuGoodsNo;
    private Integer supplierId;
    private Integer supplierMerchantId;
    private String supplierName;
}
