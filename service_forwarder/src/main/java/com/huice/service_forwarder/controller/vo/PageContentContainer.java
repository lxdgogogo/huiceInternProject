package com.huice.service_forwarder.controller.vo;

import lombok.Data;

import java.util.List;

/**
 * @author SoonMachine
 */
@Data
public class PageContentContainer {

    private List<DemandForThree> list;

    private Integer total;
}
