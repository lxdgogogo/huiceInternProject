package com.huice.service_fdk.service;

import lombok.Data;

/**
 * 代拿汇总 -  右侧表头的待推送数据和已推送数据
 */
@Data
public class SummarySumVO {
    /**
     * 已推送
     */
    private Number pushedNum;
    /**
     * 待推送
     */
    private Number waitPushNum;

    public SummarySumVO(Integer waitPushNum, Integer pushedNum) {
        this.pushedNum = pushedNum;
        this.waitPushNum = waitPushNum;
    }
}
