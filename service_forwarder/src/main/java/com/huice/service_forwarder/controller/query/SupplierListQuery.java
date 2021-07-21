package com.huice.service_forwarder.controller.query;

import lombok.Data;

/**
 * @author SoonMachine
 */
@Data
public class SupplierListQuery {
    private String bizFullName;
    private Long cityId;
    private Long floorId;
    private Long marketId;
    private String spuGoodsNo;
    private Byte status;
}
