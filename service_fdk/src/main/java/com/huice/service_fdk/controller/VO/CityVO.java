package com.huice.service_fdk.Controller.VO;

import com.huice.service_fdk.service.model.MarketModel;
import com.huice.service_fdk.service.vo.Market;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CityVO {
    private Long cityCode;//城市编码
    private String cityName;//城市名称
    private Long cityId;
    private List<Market> marketList;

    public CityVO(Long cityCode, Long cityId, String cityName, List<Market> marketList){
        this.cityCode = cityCode;
        this.cityId = cityId;
        this.cityName = cityName;
        this.marketList = marketList;
    }
}
