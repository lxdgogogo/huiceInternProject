package com.huice.service_fdk.service;

public class ForwarderSupplierVO {
    private final String business;//档口
    private final String city;//城市
    private final Integer cityCode;//城市编码
    private final String floor;//楼层
    private final Integer floorCode;//楼层编码
    private final Integer forwarderSupplierId;//代拿端档口id
    private final String groupName;//分组名称 (城市+市场)
    private final String market;//市场
    private final String marketCode;//市场编码
    private final SummaryVO summary;//汇总信息
    private final String supplierName;//档口全称


    public String getBusiness() {
        return business;
    }

    public String getCity() {
        return city;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getFloor() {
        return floor;
    }

    public int getFloorCode() {
        return floorCode;
    }

    public int getForwarderSupplierId() {
        return forwarderSupplierId;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getMarket() {
        return market;
    }

    public String getMarketCode() {
        return marketCode;
    }

    public SummaryVO getSummary() {
        return summary;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public ForwarderSupplierVO(String business, String city, int cityCode, String floor,
                               int floorCode, int forwarderSupplierId, String groupName, String market,
                               String marketCode, SummaryVO summary, String supplierName) {
        this.business = business;
        this.city = city;
        this.cityCode = cityCode;
        this.floor = floor;
        this.floorCode = floorCode;
        this.forwarderSupplierId = forwarderSupplierId;
        this.groupName = groupName;
        this.market = market;
        this.marketCode = marketCode;
        this.summary = summary;
        this.supplierName = supplierName;
    }
}
