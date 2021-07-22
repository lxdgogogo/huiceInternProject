package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.Result;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class Platform_skuController {
    //16.下载货品，手动下载平台货品
    @PostMapping("/download")
    public Result ShopWebName_list(@RequestBody boolean isAuthOnly, @RequestParam String token) {
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
