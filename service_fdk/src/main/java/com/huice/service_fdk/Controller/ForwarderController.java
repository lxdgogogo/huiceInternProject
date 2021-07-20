package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.service.ForwarderService;
import com.huice.service_fdk.service.ForwarderSummaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/forwarder")
public class ForwarderController {
    @Resource
    private ForwarderService forwarderService;


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
    //2.代拿汇总 - 待推送(左侧) （获取待推送汇总数据）
    @GetMapping ("/wait/push/summary")
    public Result WaitPushSummary() {
        Integer merchant_id=Integer.valueOf(getRequestParameter("merchant_id")).intValue();
        String msg = "调用2.代拿汇总 - 待推送(左侧) （获取待推送汇总数据）";
        ForwarderSummaryVO forwarderSummaryVO = forwarderService.getForwarderSummaryVO(merchant_id);
        return Result.ok(forwarderSummaryVO,msg);
    }

    //4.代拿汇总 -  右侧表头的待推送数据和已推送数据
    @GetMapping ("/summary/sum")
    public Result SummarySum(Integer supplierId) {
        Integer merchant_id=Integer.valueOf(getRequestParameter("merchant_id")).intValue();
        String msg = "调用4.代拿汇总 -  右侧表头的待推送数据和已推送数据";


        return Result.ok(LocalDateTime.now(),msg);
    }

    //7.指定供货商时的货品信息
    @PostMapping("/supplier/info")
    public Result SupplierInfo(@PathVariable("id") Long id) {
        String msg = "调用提供者成功，请求参数为："+id;
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        return Result.ok(LocalDateTime.now(),msg);
    }

    //8.指定供货商时的供货商列表
    @PostMapping ("/supplier/list")
    public Result SupplierList(@PathVariable("id") Long id) {
        String msg = "调用提供者成功，请求参数为："+id;
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        return Result.ok(LocalDateTime.now(),msg);
    }
}

