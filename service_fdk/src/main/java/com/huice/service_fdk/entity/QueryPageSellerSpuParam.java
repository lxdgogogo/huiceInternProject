package com.huice.service_fdk.entity;

import lombok.Data;

import java.util.ArrayList;

//14.货品列表  入参

@Data
public class QueryPageSellerSpuParam {
    private boolean distribute = false;
    private Integer firstShowSpuId;
    private String goodsNo;
    private Integer goodsNoSortType;
    private Integer intentionalPackSkuId;
    private boolean isMoreCondition = false;
    private Integer merchantId;
    private Integer packType;
    private Integer pageIndex;
    private Integer pageSize;
    private boolean pagingBySpu = false;
    private String saleStatus = "/";
    ///
    private ArrayList[] shopIds;
    private String skuName;
    private String spuGoodsNo;
    private Integer spuId;
    ///
    private ArrayList[] spuIds;
    private String spuName;
    ///
    private ArrayList[] stockNum;
    private ArrayList[] supplierIds;
    private Integer supplierType;
}
