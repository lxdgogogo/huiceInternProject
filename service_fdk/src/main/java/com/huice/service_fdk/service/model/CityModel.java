package com.huice.service_fdk.service.model;

import com.huice.service_fdk.service.vo.Market;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CityModel {
    private Long cityCode;

    private Long cityId;

    private String cityName;

    private List<Market> marketList;
}
