package com.huice.service_fdk.service.model;

import lombok.Data;

import java.util.List;

@Data
public class CityModel {
    private Long cityCode;

    private Long cityId;

    private String cityName;

    private List<MarketModel> marketList;
}
