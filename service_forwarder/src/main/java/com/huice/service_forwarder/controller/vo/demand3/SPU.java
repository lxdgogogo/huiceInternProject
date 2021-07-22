package com.huice.service_forwarder.controller.vo.demand3;

import com.huice.service_forwarder.controller.vo.demand3.SKU;
import lombok.Data;

import java.util.List;

/**
 * @author SoonMachine
 */
@Data
public class SPU {
    private String mainImgUrl;
    private List<SKU> skuList;
    private String spuGoodsNo;
    private Long spuId;
    private String spuName;
}
