package com.huice.service_forwarder.controller;

import com.huice.service_forwarder.common.R;
import com.huice.service_forwarder.controller.vo.CityTree;
import com.huice.service_forwarder.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SoonMachine
 * @description 需求1
 */
@RestController
@RequestMapping
public class BusinessController {

    /**
     * 服务对象
     */
    @Autowired
    private BusinessService businessService;

    @PostMapping("seller/cityTree")
    public R hasPassedCityList(){

        List<CityTree> cityTrees = this.businessService.queryAllBusiness();
        return R.ok().data("list",cityTrees);

    }

}
