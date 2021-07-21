package com.huice.service_forwarder.controller.vo;

import lombok.Data;

/**
 * @author SoonMachine
 * @description 需求二需要的数据
 */
@Data
public class DemandForTwo {
    private Long merchantId;
    private String sellerName;
    private String sellerShortName;
    private Integer totalKind;
    private Integer totalNum;
}
