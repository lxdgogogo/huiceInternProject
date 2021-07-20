package com.huice.service_fdk.service;

import com.huice.service_fdk.dao.ForwarderDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ForwarderService {
    @Resource
    private ForwarderDao forwarderDao;

    public ForwarderSummaryVO getForwarderSummaryVO(Integer merchant_id){
        return forwarderDao.getForwarderSummaryVO(merchant_id);

    }
}
