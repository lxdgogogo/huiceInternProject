package com.hc.summer.controller;

import com.hc.summer.common.Result;
import com.hc.summer.service.data.param.PlatformSkuDownloadParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 类描述
 * @Author niuzhenyu
 * @Date 2021/7/10 13:21
 **/
@Api(tags = "数据来源")
@RestController
@RequestMapping("/data")
public class DataSourceController {


    @ApiOperation("下载平台货品")
    @PostMapping("/download/goods/list")
    public Result<?> downloadPlatformSku(@RequestBody PlatformSkuDownloadParam param) {
        return Result.ok();
    }


    @ApiOperation("下载订单")
    @GetMapping("/download/trade/list")
    public Result<?> downloadTrade(@RequestParam @ApiParam(name = "本次生成订单数量，最大不能超过50条，默认1条", value = "num") Integer num) {
        return Result.ok();
    }


}
