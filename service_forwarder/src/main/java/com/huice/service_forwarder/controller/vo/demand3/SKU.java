package com.huice.service_forwarder.controller.vo.demand3;

import lombok.Data;

/**
 * @author SoonMachine
 */
@Data
public class SKU {
    private Integer availableNum;
    private Long skuId;
    private String skuName;
    private Integer toReturnNum;
}
