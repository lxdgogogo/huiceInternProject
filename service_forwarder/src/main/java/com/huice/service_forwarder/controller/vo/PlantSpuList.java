package com.huice.service_forwarder.controller.vo;

import lombok.Data;
import java.util.List;
/**
 * @author SoonMachine
 */
@Data
public class PlantSpuList {
    private String bizFullName;

    private String mainImgUrl;

    private List<PlantSku> skuList;

    /**
     * SPU 拿货数量
     */
    private Integer spuFetchNum;

    private String spuGoodsNo;

    private Long spuId;

    /**
     * SPU 退货数量
     */
    private Integer spuReturnNum;

}
