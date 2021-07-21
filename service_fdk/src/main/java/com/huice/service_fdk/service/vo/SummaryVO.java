package com.huice.service_fdk.service.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SummaryVO {
    private String avatar;//对方头像URL
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime;
    private long saleOrderId;
    private String saleOrderNo;//单号
    private String sellerName;//对方名称
    private Number totalAmount;//单内金额总计
}
