package com.huice.service_forwarder.service;

import com.huice.service_forwarder.dao.FetchOrderDao;
import com.huice.service_forwarder.entity.FetchOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertService {

    @Autowired
    private FetchOrderDao fetchOrderDao;

    public Long insert(FetchOrder fetchOrder){
        return this.fetchOrderDao.insert(fetchOrder);
    }
}
