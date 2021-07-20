package com.huice.service_fdk.entity;

import lombok.Data;

import java.util.ArrayList;

//10.推送给代拿  入参

@Data
public class GoPrepareParam {

    private String endTime;
    private boolean rememberChoice = false;
    private boolean selectedAll = false;
    private ArrayList[] spulds;
    private String startTime;

}
