package com.huice.service_fdk.Controller.vo;

import lombok.Data;

import java.util.ArrayList;
/*
 需求：十四、货品列表
 接口描述:  查SPU/SKU列表，按SPU/SKU条数分页，并按SPU聚合展示
 响应参数:  data-list<SellerSpuVO>  业务数据
 接口地址:  /seller/goods/queryPage
 请求方式： POST
 */

@Data
public class SellerSpuVO {
    private forwarderSupplierInfoList forwarderSupplierInfoList;
    private String goodsLink;
    private String goodsNo;
    private Integer id;
    private ArrayList images[];
    private String imgUrl;
    private boolean linked = false;
    private int realNum = 0;
    private String remark;
    private Integer saleStatus;
    private int salesNum;
    private String shopIdListString;
    private ShopIdAndName shops;
    private SellerSkuVO skuList;
    private String spuGoodsNo;
    private String spuName;
    private Integer spuPackFlag;
    private Integer spuStagnantFlag;
    private int spuStock;
    private spuSupplierInfoList spuSupplierInfoList;
    private Integer takeGoodsType;
}





