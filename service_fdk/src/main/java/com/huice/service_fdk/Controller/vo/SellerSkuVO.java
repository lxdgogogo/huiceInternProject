package com.huice.service_fdk.Controller.vo;

import lombok.Data;

import java.util.ArrayList;

/*
 需求：十四、货品列表
 接口描述:  查SPU/SKU列表，按SPU/SKU条数分页，并按SPU聚合展示
 响应参数:  data-list-skuList  该货品下所属单品
 接口地址:  /seller/goods/queryPage
 请求方式： POST
 */
@Data
public class SellerSkuVO {
    private int availableNum;
    private String distributeSupplier;
    private String goodsNo;
    private Integer id;
    private String imgUrl;
    private Integer merchantId;
    private int occupiedNum;
    private int purchasePrice;
    private int realNum;
    private String remark;
    private int retailPrice;
    private Integer saleStatus;
    private int salesNum;
    private ShopIdAndName shops;
    private singleSkuList singleSkuList;
    private String skuName;
    private Integer skuPackFlag;
    private String spuGoodsNo;
    private Integer spuId;
    private String spuImgUrl;
    private String spuName;
    private ArrayList[] supplierList;
    private Integer takeGoodsType;
    private int toOutNum;
}