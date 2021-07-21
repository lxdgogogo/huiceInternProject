package com.huice.service_fdk.service.vo;

public class Floor {
    private final long floorCode;//楼层编码
    private  String floorName ;//楼层名字
    private  long marketCode;//市场编码

    public Floor(long floorCode) {
        this.floorCode = floorCode;
    }

    public Floor(long floorCode, String floorName, long marketCode) {
        this.floorCode = floorCode;
        this.floorName = floorName;
        this.marketCode = marketCode;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public void setMarketCode(int marketCode) {
        this.marketCode = marketCode;
    }

    public long getFloorCode() {
        return floorCode;
    }

    public String getFloorName() {
        return floorName;
    }

    public long getMarketCode() {
        return marketCode;
    }
}
