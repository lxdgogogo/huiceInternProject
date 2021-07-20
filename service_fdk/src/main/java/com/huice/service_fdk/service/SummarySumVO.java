package com.huice.service_fdk.service;

import lombok.Data;

/**
 * 代拿汇总 -  右侧表头的待推送数据和已推送数据
 */
@Data
public class SummarySumVO {
    /**
     * sku种类
     */
    private Number pushedNum;
    /**
     * sku总数量
     */
    private Number waitPushNum;
}
