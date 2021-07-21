package com.huice.service_fdk.service.vo;


import lombok.Data;

/**
 *代拿汇总 - 待推送(左侧) （获取待推送汇总数据）
 */
@Data
public class ForwarderSummaryVO {
    /**
     * sku种类
     */
    private Long skuCount;

    /**
     * sku总数量
     */
    private Number skuSum;
}
