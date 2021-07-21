package com.huice.service_fdk.service.vo;

import java.util.ArrayList;

public class Market {
    private  long cityCode;//城市编码
    private ArrayList<Floor> floorList;//楼层列表
    private final long marketCode;//市场编码
    private String marketName;//市场名称

    public Market(long marketCode) {
        this.marketCode = marketCode;
    }

    public ArrayList<Floor> getFloorList() {
        return floorList;
    }

    public long getCityCode() {
        return cityCode;
    }

    public long getMarketCode() {
        return marketCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public void setCityCode(long cityCode) {
        this.cityCode = cityCode;
    }

    public Market(long cityCode, long marketCode, String marketName) {
        this.cityCode = cityCode;
        this.marketCode = marketCode;
        this.marketName = marketName;
        this.floorList = new ArrayList<>();
    }
}
