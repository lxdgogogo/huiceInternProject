package com.huice.service_forwarder.controller.vo.demand3;

import lombok.Data;

import java.util.List;

/**
 * @author SoonMachine
 */
@Data
public class PageContentContainer {
    private String bizFullName;
    private Long bizId;
    private Double moneyAmount;
    private List<SPU> spuList;
    private Integer totalKind;
    private Integer totalNum;
}
