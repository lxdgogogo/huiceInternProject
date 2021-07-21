package com.huice.service_forwarder.controller;

import com.huice.service_forwarder.common.R;
import com.huice.service_forwarder.controller.query.OnGettingList;
import com.huice.service_forwarder.controller.query.SupplierListQuery;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SoonMachine
 */
@RestController
@RequestMapping
@Api(tags = "需求2,3相关接口")
public class OnGettingController {

    public R supplierList(@RequestBody SupplierListQuery supplierListQuery){
        return R.ok();
    }


    public R getGoodList(@RequestBody OnGettingList onGettingList){
        return R.ok();
    }


}
