package com.huice.service_fdk.service;

public class ForwarderSupplierVO {
    private String business;//档口
    private String city;//城市
    private Integer cityCode;//城市编码
    private String floor;//楼层
    private Integer floorCode;//楼层编码
    private Integer forwarderSupplierId;//代拿端档口id
    private String groupName;//分组名称 (城市+市场)
    private String market;//市场
    private String marketCode;//市场编码
    private String supplierName;//档口全称

    public String getGroupName() {
        return groupName;
    }
}
