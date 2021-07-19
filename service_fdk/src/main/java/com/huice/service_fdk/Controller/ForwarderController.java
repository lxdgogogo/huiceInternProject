package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/forwarder")
public class ForwarderController {

    //2.代拿汇总 - 待推送(左侧) （获取待推送汇总数据）
    @GetMapping ("/wait/push/summary")
    public Result WaitPushSummary(@PathVariable("id") Long id) {
        String msg = "调用提供者成功，请求参数为："+id;
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        return Result.ok(LocalDateTime.now(),msg);
    }

    //4.代拿汇总 -  右侧表头的待推送数据和已推送数据
    @GetMapping ("/summary/sum")
    public Result SummarySum(@PathVariable("id") Long id) {
        String msg = "调用提供者成功，请求参数为："+id;
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        return Result.ok(LocalDateTime.now(),msg);
    }

    //7.指定供货商时的货品信息
    @GetMapping ("/supplier/info")
    public Result SupplierInfo(@PathVariable("id") Long id) {
        String msg = "调用提供者成功，请求参数为："+id;
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        return Result.ok(LocalDateTime.now(),msg);
    }

    //8.指定供货商时的供货商列表
    @GetMapping ("/supplier/list")
    public Result SupplierList(@PathVariable("id") Long id) {
        String msg = "调用提供者成功，请求参数为："+id;
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        return Result.ok(LocalDateTime.now(),msg);
    }
}

