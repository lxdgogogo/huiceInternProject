package com.huice.service_fdk.service.vo;

import lombok.Data;

import java.util.List;

@Data
public class SupplierGoodsList {
    private List<SPU> spuList;//一些spu
    private String supplierGroupName;//供货商分组名称
    private long supplierId;//供货商 id
    private String supplierName;//供货商名称
    private int totalNum;//sku 总数量
    private int totalSKU;//sku 种类数
}
