package com.huice.service_forwarder.controller.vo;

import lombok.Data;

import java.util.List;

/**
 * @author SoonMachine
 * @description 对应需求1
 */
@Data
public class Market {

    private Long cityCode;

    private List<Floor> floorList;

    private Long marketCode;

    private Long marketId;

    private String marketName;
}
