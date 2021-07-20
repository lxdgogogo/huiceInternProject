package com.huice.service_forwarder.controller.vo;

import lombok.Data;

import java.util.List;

/**
 * @author SoonMachine
 * @description 对应需求1
 */
@Data
public class CityTree {

    private Long cityCode;

    private Long cityId;

    private String cityName;

    private List<Market> marketList;
}
