package com.huice.service_forwarder.service;


import com.huice.service_forwarder.controller.query.SupplierListQuery;
import com.huice.service_forwarder.controller.vo.DemandForTwo;
import com.huice.service_forwarder.dao.FetchOrderDao;
import com.huice.service_forwarder.dao.SellerDao;
import com.huice.service_forwarder.entity.FetchOrder;
import com.huice.service_forwarder.entity.SellerName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author SoonMachine
 */
@Service
public class FetchOrderService {

    @Autowired
    private FetchOrderDao fetchOrderDao;

    @Autowired
    private SellerDao sellerDao;


    public List<DemandForTwo> querySupplierInformation(SupplierListQuery supplierListQuery){
        List<FetchOrder> fetchOrders = this.fetchOrderDao.fetchOrdersByQuery(supplierListQuery);
        List<DemandForTwo> res = new ArrayList<>();
        Map<Long, DemandForTwo> demandForTwoMap = new HashMap<>();
        Map<Long, HashSet<Long>> spuMap = new HashMap<>();
        for (FetchOrder fetchOrder : fetchOrders){
            Long merchantId = fetchOrder.getMerchantId();
            if (!demandForTwoMap.containsKey(merchantId)){
                SellerName sellerName = this.sellerDao.querySellerNameBySellId(merchantId);
                DemandForTwo demandForTwo = new DemandForTwo();
                demandForTwo.setSellerName(sellerName.getSellerName());
                demandForTwo.setSellerShortName(sellerName.getSellerShortName());
                demandForTwo.setMerchantId(merchantId);
                demandForTwo.setTotalKind(0);
                demandForTwo.setTotalNum(0);
                demandForTwoMap.put(merchantId,demandForTwo);
                spuMap.put(merchantId,new HashSet<>());
            }
            Integer totalNum = demandForTwoMap.get(merchantId).getTotalNum();
            totalNum ++;
            demandForTwoMap.get(merchantId).setTotalNum(totalNum);
        }

        for (FetchOrder fetchOrder : fetchOrders){
            Long merchantId = fetchOrder.getMerchantId();
            Long platformSpuId = fetchOrder.getPlatformSpuId();
            spuMap.get(merchantId).add(platformSpuId);
        }

        for (Long id : demandForTwoMap.keySet()){
            int size = spuMap.get(id).size();
            DemandForTwo demandForTwo = demandForTwoMap.get(id);
            demandForTwo.setTotalKind(size);
            res.add(demandForTwo);
        }

        return res;
    }



/*    public List<PageContentContainer> getGoodList(OnGettingList onGettingList){

    }*/



}
