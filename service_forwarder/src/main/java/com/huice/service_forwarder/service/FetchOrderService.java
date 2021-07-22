package com.huice.service_forwarder.service;


import com.huice.service_forwarder.controller.query.OnGettingList;
import com.huice.service_forwarder.controller.query.SupplierListQuery;
import com.huice.service_forwarder.controller.vo.DemandForTwo;
import com.huice.service_forwarder.controller.vo.demand3.PageContentContainer;
import com.huice.service_forwarder.controller.vo.demand3.SKU;
import com.huice.service_forwarder.controller.vo.demand3.SPU;
import com.huice.service_forwarder.dao.FetchOrderDao;
import com.huice.service_forwarder.dao.SellerDao;
import com.huice.service_forwarder.entity.FetchOrder;
import com.huice.service_forwarder.entity.SellerName;
import com.huice.service_forwarder.entity.SpuNameAndUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.Temporal;
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



    public List<PageContentContainer> getGoodList(OnGettingList onGettingList){
        List<PageContentContainer> res = new ArrayList<>();
        List<FetchOrder> fetchOrders = this.fetchOrderDao.onTakingGoodList(onGettingList);
        Map<Long,PageContentContainer> pageContentContainerMap = new HashMap<>();
        Map<Long, SPU> spuMap = new HashMap<>();

        for (FetchOrder f :
                fetchOrders){
            Long bizId = f.getBizId();
            if (!pageContentContainerMap.containsKey(bizId)){
                String bizName = f.getBizName();
                Double refFetchPrice = f.getRefFetchPrice();
                PageContentContainer pageContentContainer = new PageContentContainer();
                pageContentContainer.setBizFullName(bizName);
                pageContentContainer.setBizId(bizId);
                pageContentContainer.setMoneyAmount(refFetchPrice);
                pageContentContainer.setSpuList(new ArrayList<>());
                pageContentContainerMap.put(bizId,pageContentContainer);
            }
            Long platformSpuId = f.getPlatformSpuId();
            if (!spuMap.containsKey(platformSpuId)){
                String spuGoodsNo = f.getSpuGoodsNo();
                SpuNameAndUrl spuNameAndUrl = this.fetchOrderDao.querySpuUrl(platformSpuId);
                SPU spu = new SPU();
                spu.setSpuId(platformSpuId);
                spu.setSpuGoodsNo(spuGoodsNo);
                spu.setSpuName(spuNameAndUrl.getSpuName());
                spu.setMainImgUrl(spuNameAndUrl.getSpuUrl());
                spu.setSkuList(new ArrayList<>());
                spuMap.put(platformSpuId,spu);
                pageContentContainerMap.get(bizId).getSpuList().add(spu);
            }


            Long platformSkuId = f.getPlatformSkuId();
            String skuName = f.getSkuName();
            SKU sku = new SKU();
            sku.setSkuId(platformSkuId);
            sku.setSkuName(skuName);
            sku.setAvailableNum(10);
            sku.setToReturnNum(10);
            spuMap.get(platformSpuId).getSkuList().add(sku);
        }

        for (Long bizId : pageContentContainerMap.keySet()){
            PageContentContainer pageContentContainer = pageContentContainerMap.get(bizId);
            int size = pageContentContainer.getSpuList().size();
            pageContentContainer.setTotalKind(size);
            int total = 0;
            for (SPU spu : pageContentContainer.getSpuList()){
                total += spu.getSkuList().size();
            }
            pageContentContainer.setTotalNum(total);
            res.add(pageContentContainer);
        }
        return res;
    }



}
