package com.huice.service_forwarder.service;

import com.huice.service_forwarder.controller.query.OnGettingList;
import com.huice.service_forwarder.controller.query.SupplierListQuery;
import com.huice.service_forwarder.controller.vo.DemandForThree;
import com.huice.service_forwarder.controller.vo.DemandForTwo;
import com.huice.service_forwarder.controller.vo.PageContentContainer;
import com.huice.service_forwarder.dao.FetchOrderDao;
import com.huice.service_forwarder.dao.SellerDao;
import com.huice.service_forwarder.entity.FetchOrder;
import com.huice.service_forwarder.entity.SellerName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SoonMachine
 */
@Service
public class FetchOrderService {

    @Autowired
    private FetchOrderDao fetchOrderDao;

    @Autowired
    private SellerDao sellerDao;






/*    public List<PageContentContainer> getGoodList(OnGettingList onGettingList){

    }*/



}
