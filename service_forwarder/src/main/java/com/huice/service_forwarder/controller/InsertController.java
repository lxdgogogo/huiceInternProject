package com.huice.service_forwarder.controller;

import com.huice.service_forwarder.entity.FetchOrder;
import com.huice.service_forwarder.service.InsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InsertController {

    @Autowired
    private InsertService insertService;

    @RequestMapping(value = "xiaoshang/insert", method = RequestMethod.POST)
    public Long insert(@RequestBody FetchOrder fetchOrder){
        return this.insertService.insert(fetchOrder);
    }
}
