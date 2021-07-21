package com.huice.service_fdk.service;

import com.huice.service_fdk.service.model.CityModel;

import java.util.List;

public interface ISellerForwarderService {

    /**
     *  指定供货商时的城市信息，查询
     **/
    List<CityModel> selectCityInfo();

}
