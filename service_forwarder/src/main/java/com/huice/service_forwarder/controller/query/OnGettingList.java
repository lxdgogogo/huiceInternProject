package com.huice.service_forwarder.controller.query;

import lombok.Data;

import java.util.List;

/**
 * @author SoonMachine
 */
@Data
public class OnGettingList {
    private String bizFullName;

    private Long cityId;

    private Long floorId;

    private Long marketId;

    private Long merchantId;

    private Integer order;

    private Integer pageIndex;

    private Integer pageSize;

    private List<Long> skuIdList;

    private Integer sort;

    private String spuGoodsNo;

    private Integer status;
}
