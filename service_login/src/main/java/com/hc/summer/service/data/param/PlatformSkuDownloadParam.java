package com.hc.summer.service.data.param;

import com.hc.summer.common.page.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description 下载平台货品入参
 * @Author niuzhenyu
 * @Date 2021/7/10 13:25
 **/
@Data
@ApiModel("下载平台货品入参")
public class PlatformSkuDownloadParam extends PageParam {

    @ApiModelProperty("开始时间")
    private String startTime;

    @ApiModelProperty("结束时间")
    private String endTime;

    @ApiModelProperty("店铺id")
    private Long shopId;

    @ApiModelProperty("销售商商户id")
    private Long merchantId;

}
