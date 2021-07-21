package com.huice.service_fdk.controller.VO;

import com.huice.service_fdk.service.model.MarketModel;
import com.huice.service_fdk.service.vo.Market;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CityVO {
    private Long cityCode;//城市编码
    private String cityName;//城市名称
    private List<MarketModel> marketList;

    public CityVO(Long cityCode, String cityName, List<MarketModel> marketList){
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.marketList = marketList;
    }
}
