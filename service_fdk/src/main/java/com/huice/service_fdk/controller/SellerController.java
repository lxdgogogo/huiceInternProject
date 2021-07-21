package com.huice.service_fdk.controller;

import com.huice.service_fdk.service.vo.SellerSpuVO;
import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.entity.QueryPageSellerSpuParam;
import com.huice.service_fdk.service.SellerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Resource
    private SellerService sellerService;

    private static String getRequestParameter(String parameterName){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if(requestAttributes instanceof ServletRequestAttributes){
            HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
            String value = request.getParameter(parameterName);
            String nullStr = "null";
            if(nullStr.equals(value) || org.springframework.util.StringUtils.isEmpty(value)){
                return null;
            }
            return value;
        }
        return null;
    }

    @PostMapping("/goods/queryPage")
    public Result<PageContentContainer<SellerSpuVO>> SellerGoodsQueryPage(@RequestBody QueryPageSellerSpuParam pageParam){
        Long merchant_id= Long.valueOf(Objects.requireNonNull(getRequestParameter("merchant_id")));
        return Result.ok(sellerService.getSellerGoodsQueryPage(pageParam,merchant_id));
    }
}
