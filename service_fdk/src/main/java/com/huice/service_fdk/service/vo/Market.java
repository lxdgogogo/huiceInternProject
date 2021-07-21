package com.huice.service_fdk.service.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Market {
    private Long cityCode;//城市编码
    private List<Floor> floorList;//楼层列表
    private Long marketCode;//市场编码
    private String marketName;//市场名称

    public Market(long marketCode) {
        this.marketCode = marketCode;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public Long getMarketCode() {
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

    public Market(){}

    public Market(Long cityCode, Long marketCode, String marketName) {
        this.cityCode = cityCode;
        this.marketCode = marketCode;
        this.marketName = marketName;
        this.floorList = new ArrayList<>();
    }
}
