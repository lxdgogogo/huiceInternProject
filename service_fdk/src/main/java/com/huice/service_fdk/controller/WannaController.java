package com.huice.service_fdk.Controller;


import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.entity.FetchOrder;
import com.huice.service_fdk.entity.GoPrepareParam;
import com.huice.service_fdk.service.PushDainaService;
import com.huice.service_fdk.service.WannaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/wanna")
public class WannaController {

    @Autowired
    private WannaService wannaService;
    private PushDainaService pushDainaService;
    private List<FetchOrder> fetchOrder;


    //10.推送给代拿 - 点击推送至代拿,支持跨页全选
    @PostMapping("/submit/forwarder")
    public Result<?> setWannaSubmitForwarder(@RequestBody GoPrepareParam param, @RequestParam String token) {

        //更新数据表 SellerOnPrepareSkuList，返回FetchOrder列表
        fetchOrder = wannaService.setSubmitForwarderVO(param.isSelectedAll(), param.getSpuIds());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 循环！！！遍历fetchOrder导入SellerFetchOrder数据
        // 调用代拿端方法，将数据推入代拿数据表 SellerFetchOrder
        for (FetchOrder fetchOrder : fetchOrder) {
            pushDainaService.insert(fetchOrder);
        }
        if (param.isSelectedAll()) {
            return Result.ok("推送全部订单成功！！！");
        } else {
            return Result.ok("推送已选订单成功！！！");
        }
    }
}
