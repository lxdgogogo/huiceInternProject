package com.huice.service_dyna.service;

import com.huice.service_dyna.dao.BaseBusinessInfoDao;
import com.huice.service_dyna.entity.BaseBusinessInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SoonMachine
 * @description seller service
 */
@Service("sellerService")
public class SellerService {

    @Resource
    private BaseBusinessInfoDao baseBusinessInfoDao;

    public List<BaseBusinessInfo> queryAll(){
        return this.baseBusinessInfoDao.getBaseBusinessInfo();
    }

}
