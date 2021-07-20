package com.huice.service_fdk.Controller.vo;

import lombok.Data;

/*
 需求：十四、货品列表
 接口描述:  查SPU/SKU列表，按SPU/SKU条数分页，并按SPU聚合展示
 响应参数:  data-list-forwarderSupplierInfoList  代拿供货商列表
 接口地址:  /seller/goods/queryPage
 请求方式： POST
 */
@Data
public class forwarderSupplierInfoList {
    private String business;
    private String city;
    private Integer cityCode;
    private String floor;
    private Integer floorCode;
    private String market;
    private String marketCode;
    private int purchasePrice;
    private String remarks;
    private String spuGoodsNo;
    private Integer supplierId;
    private String supplierName;
}
