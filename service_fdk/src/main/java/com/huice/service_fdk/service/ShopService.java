package com.huice.service_fdk.service;

import com.huice.service_fdk.dao.ShopDao;
import com.huice.service_fdk.service.vo.data_MerchantIdList_15;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShopService {
    @Resource
    private ShopDao shopDao;

    public data_MerchantIdList_15 getShopWebNameListVO(boolean isAuthOnly, Long id) {
        return shopDao.getShopWebNameListVO(isAuthOnly, id);
    }
}
