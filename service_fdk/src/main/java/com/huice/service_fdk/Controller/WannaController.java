package com.huice.service_fdk.Controller;


import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.entity.GoPrepareParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wanna")
public class WannaController {

    //10.推送给代拿 - 点击推送至代拿,支持跨页全选
    @PostMapping("/submit/forwarder")
    public Result WannaSubmitForwarder(@RequestBody GoPrepareParam param, @RequestParam String token) {
        if(token.equals("rainforest")) {
            //String msg = "调用提供者成功，请求参数为：" + hashCode();

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return Result.ok(200,"ok","hah");
            //return Result.ok(LocalDateTime.now());
        }
        return Result.error(404,"出错啦^*^");
    }
}
