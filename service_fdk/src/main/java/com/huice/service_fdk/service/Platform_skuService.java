package com.huice.service_fdk.service;

import com.huice.service_fdk.dao.Platform_skuDao;
import com.huice.service_fdk.entity.ManuallydownloadProductParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class Platform_skuService {

    @Resource
    private Platform_skuDao platform_skuDao;


    public String getnewDownload(ManuallydownloadProductParam param, long merchant_id) {
        return platform_skuDao.getnewDownload(param,merchant_id);
    }
}
