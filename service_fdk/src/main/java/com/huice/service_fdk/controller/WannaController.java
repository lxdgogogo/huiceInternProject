package com.huice.service_fdk.Controller;


import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.entity.GoPrepareParam;
import com.huice.service_fdk.service.WannaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/wanna")
public class WannaController {

    @Autowired
    private WannaService wannaService;

    //10.推送给代拿 - 点击推送至代拿,支持跨页全选
    @PostMapping("/submit/forwarder")
    public Result setWannaSubmitForwarder(@RequestBody GoPrepareParam param, @RequestParam String token) {
        //if (taken) {
        // 全选
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (param.isSelectedAll()) {
            return Result.ok(Integer.toString(wannaService.setSubmitForwarderVO(param.isSelectedAll(), param.getSpuIds())), "推送全部订单成功！！！");
        } else {
            return Result.ok(Integer.toString(wannaService.setSubmitForwarderVO(param.isSelectedAll(), param.getSpuIds())), "推送已选订单成功！！！");
        }
    }
}
