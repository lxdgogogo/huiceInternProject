package com.huice.service_forwarder.controller.vo;

import lombok.Data;

/**
 * @author SoonMachine
 */
@Data
public class PlantSku {
    private Integer availableNum = 10;

    private Long skuId;

    private String skuName;

    private Integer toReturnNum = 8;
}
