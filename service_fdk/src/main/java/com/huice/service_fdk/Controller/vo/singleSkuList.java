package com.huice.service_fdk.Controller.vo;

import lombok.Data;

import java.util.ArrayList;

/*
 需求：十四、货品列表
 接口描述:  查SPU/SKU列表，按SPU/SKU条数分页，并按SPU聚合展示
 响应参数:  data-list-skuList-singleSkuList  SKU下的单品SKU
 接口地址:  /seller/goods/queryPage
 请求方式： POST
 */
@Data
public class singleSkuList {
        private Integer availableStock;
        private Integer contentNum;
        private Integer distributeSupplierId;
        private String distributeSupplierName;
        private String goodsNo;
        private String imgUrl;
        private Integer innerSkuId;
        private Integer occupiedStock;
        private Integer ofPackSkuId;
        private Integer ofPackSpuId;
        private Integer realStock;
        private Integer scannedStock;
        private String shopIdListString;
        private ArrayList[] shopNames;
        private int singlePrice;
        private String skuName;
        private String skuNo;
        private String spuGoodsNo;
        private Integer spuId;
        private String spuName;
        private Integer supplierId;
        private ArrayList[] supplierName;
        private Integer takeGoodsType;
}
