package com.huice.service_fdk.service.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Floor {
    private Long floorCode;//楼层编码
    private String floorName ;//楼层名字
    private Long marketCode;//市场编码

}
