package com.huice.service_fdk.service;

import com.huice.service_fdk.dao.ShopDao;
import com.huice.service_fdk.service.vo.data_MerchantIdList_15;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopService {
    @Resource
    private ShopDao shopDao;

    public List<data_MerchantIdList_15> getShopWebNameListVO(boolean isAuthOnly) {
        return shopDao.getShopWebNameListVO(isAuthOnly);
    }
}
