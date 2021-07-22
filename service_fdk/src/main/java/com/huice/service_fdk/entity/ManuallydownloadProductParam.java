package com.huice.service_fdk.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

//16.下载货品  入参

@Data
public class ManuallydownloadProductParam {
    private String endTime;
    private byte goodsStatus;  //@0全部  @1在架(默认) @2下架 @3已删除"
    private Map<Integer,String> shopIds;
    private String startTime;

    public String getEndTime() {
        return endTime;
    }

    public byte getGoodsStatus() {
        return goodsStatus;
    }

    public Map<Integer,String> getShopIds() {
        return shopIds;
    }

    public String getStartTime() {
        return startTime;
    }

}



