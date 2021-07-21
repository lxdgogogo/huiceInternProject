package com.huice.service_fdk.service;

import com.huice.service_fdk.Controller.vo.SellerSpuVO;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.common.page.PageParam;
import com.huice.service_fdk.dao.ForwarderDao;
import com.huice.service_fdk.dao.PageForwarderSupplierDao;
import com.huice.service_fdk.dao.SellerDao;
import com.huice.service_fdk.entity.QueryPageSellerSpuParam;

import javax.annotation.Resource;

public class SellerService {

    @Resource
    private SellerDao sellerDao;


    public PageContentContainer<SellerSpuVO> getSellerGoodsQueryPage(QueryPageSellerSpuParam pageParam, Long merchant_id) {
        return sellerDao.getSellerGoodsQueryPage(pageParam,merchant_id);
    }


}