package com.huice.service_fdk.service;

import com.huice.service_fdk.entity.FetchOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("service_forwarder")
public interface PushDainaService {

    @GetMapping(value = "xiaoshang/insert")
    @RequestMapping(value = "xiaoshang/insert", method = RequestMethod.POST)
    Long insert(FetchOrder fetchOrder);
}

