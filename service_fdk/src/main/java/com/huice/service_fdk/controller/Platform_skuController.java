package com.huice.service_fdk.controller;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.entity.ManuallydownloadProductParam;
import com.huice.service_fdk.service.Platform_skuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@RestController
@RequestMapping("/platform_sku")
public class Platform_skuController {

    @Resource
    private Platform_skuService platform_skuService;

    private static String getRequestParameter(String parameterName){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if(requestAttributes instanceof ServletRequestAttributes){
            HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
            String value = request.getParameter(parameterName);
            String nullStr = "null";
            if(nullStr.equals(value) || org.springframework.util.StringUtils.isEmpty(value)){
                return null;
            }
            return value;
        }
        return null;
    }

    //16.下载货品，手动下载平台货品
    @PostMapping("/download")
    public Result<String> newDownload(@RequestBody ManuallydownloadProductParam param) {
        long merchant_id= Long.parseLong(Objects.requireNonNull(getRequestParameter("merchant_id")));
        String msg = "调用16.下载货品，手动下载平台货品";
        return Result.ok(platform_skuService.getnewDownload(param,merchant_id),msg);
    }
}
