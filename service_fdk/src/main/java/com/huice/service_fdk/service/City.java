package com.huice.service_fdk.service;

import java.util.ArrayList;

public class City {
    private long cityCode;//城市编码
    private String cityName;//城市名称
    private ArrayList<Market> marketList;

    public City(long cityCode) {
        this.cityCode = cityCode;
        this.marketList = new ArrayList<>();
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }
}
