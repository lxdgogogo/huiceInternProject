package com.huice.service_forwarder.controller.vo;

import lombok.Data;

import java.util.List;

/**
 * @author SoonMachine
 */
@Data
public class DemandForThree {
    private String bizFullName;
    private Long bizId;
    private Double moneyAmount;
    private List<SPU> spuList;
    private Integer totalKind;
    private Integer totalNum;
}
