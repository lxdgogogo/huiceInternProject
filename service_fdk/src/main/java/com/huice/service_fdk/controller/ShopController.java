package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.service.vo.data_MerchantIdList_15;
import org.springframework.web.bind.annotation.*;
import com.huice.service_fdk.service.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Resource
    private ShopService shopService;

    //15.店铺筛选条件的店铺列表,当前商户店铺名称列表
    @GetMapping("/web/name_list")
    public Result<List<data_MerchantIdList_15>> ShopWebName_list(@RequestBody boolean isAuthOnly, @RequestParam String token) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Result.ok(shopService.getShopWebNameListVO(isAuthOnly), "hah");

//        return Result.error(404,"出错啦^*^");
    }
}
