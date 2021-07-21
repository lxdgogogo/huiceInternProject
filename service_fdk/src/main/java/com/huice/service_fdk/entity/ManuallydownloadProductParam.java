package com.huice.service_fdk.entity;

import lombok.Data;

//16.下载货品  入参

@Data
public class ManuallydownloadProductParam {
    private String endTime;
    private byte goodsStatus;  //@0全部  @1在架(默认) @2下架 @3已删除"
    private shopIds shopIds;
    private String startTime;
}

class shopIds{

}