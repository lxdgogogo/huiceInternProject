package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.entity.QueryPageSellerSpuParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @PostMapping("/goods/queryPage")
    public Result SellerGoodsQueryPage(@RequestBody QueryPageSellerSpuParam param, @RequestParam String token){
        if(token.equals("rainforest")){
            return Result.ok(0,"success","测试成功！！！");
        }
        return Result.error(404,"出错啦^*^");
    }
}
