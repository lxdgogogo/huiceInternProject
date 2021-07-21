package com.huice.service_fdk.service.vo;

import lombok.Data;

/*
 需求：十四、货品列表
 接口描述:  查SPU/SKU列表，按SPU/SKU条数分页，并按SPU聚合展示
 响应参数:  data-list-forwarderSupplierInfoList-ShopIdAndName<shops>  代拿供货商列表
 接口地址:  /seller/goods/queryPage
 请求方式： POST
 */
@Data
public class ShopIdAndName {
    private Integer id;
    private String imgUrl;
    private String name;
}
