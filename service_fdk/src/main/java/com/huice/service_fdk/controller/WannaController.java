package com.huice.service_fdk.controller;


import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.entity.GoPrepareParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wanna")
public class WannaController {

    //10.推送给代拿 - 点击推送至代拿,支持跨页全选
    @PostMapping("/submit/forwarder")
    public Result WannaSubmitForwarder(@RequestBody GoPrepareParam param, @RequestParam String token) {
        if (param.isSelectedAll()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return Result.ok(200, "推送成功！！！");

        }
        return null;
    }
}
