package com.huice.service_fdk.service.vo;

import lombok.Data;

/*
 需求：十四、货品列表
 接口描述:  查SPU/SKU列表，按SPU/SKU条数分页，并按SPU聚合展示
 响应参数:  data 业务数据
 接口地址:  /seller/goods/queryPage
 请求方式： POST
 */

@Data
public class data_PageContentContainer_SellerSpuVO_14 {
    private SellerSpuVO list;
    private Integer total;
}
