package com.huice.service_fdk.service.vo;

import lombok.Data;

import java.util.List;

/*
 需求：十五、店铺筛选条件的店铺列表
 接口描述:  当前商户店铺名称列表
 响应参数:  data 业务数据  店铺Id列表
 接口地址:  /shop/web/name_list
 请求方式： GET
 */

@Data
public class data_MerchantIdList_15 {
    private Integer merchantId;
    private List<ShopIdVO> shopList;
}
