package com.huice.service_fdk.service.model;

import lombok.Data;

import java.util.List;

@Data
public class MarketModel {
    private Long cityCode;

    private List<FloorModel> floorList;

    private Long markerCode;

    private Long marketId;

    private String marketName;
}
