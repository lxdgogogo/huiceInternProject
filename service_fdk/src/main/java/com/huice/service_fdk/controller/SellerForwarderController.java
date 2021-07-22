package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.Controller.VO.CityVO;
import com.huice.service_fdk.service.ISellerForwarderService;
import com.huice.service_fdk.service.model.CityModel;
import org.jooq.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/sellerForwarder")
public class SellerForwarderController {

    @Autowired
    private ISellerForwarderService sellerForwarderService;

    /**
     *  11.指定供货商时的城市信息
     *  param:
     *  forwarderId: 销售商代拿ID
     *  platformCode: 平台编号
     */
    @PostMapping(value = "/baseCityTree")
    public Result<List<CityVO>> getCityTree(@RequestBody Long forwarderId, @RequestBody Long platformCode){
        if (forwarderId == null || platformCode == null)
            return Result.error(200, "未接收到参数");
        List<CityModel> cityModels = sellerForwarderService.selectCityInfo();
        List<CityVO> cityVOS = new ArrayList();
        for (CityModel cityModel : cityModels){
            CityVO cityVO = new CityVO(cityModel.getCityCode(), cityModel.getCityId(), cityModel.getCityName(), cityModel.getMarketList());
            cityVOS.add(cityVO);
        }
        return Result.ok(cityVOS, "success");
    }

}
