package com.huice.service_fdk.controller;

import com.huice.service_fdk.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopController {

    //15.店铺筛选条件的店铺列表,当前商户店铺名称列表
    @GetMapping("/web/name_list")
    public Result ShopWebName_list(@PathVariable boolean isAuthOnly, @RequestParam String token) {
        if(token.equals("rainforest")) {
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
