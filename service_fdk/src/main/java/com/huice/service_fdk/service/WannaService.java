package com.huice.service_fdk.service;

import com.huice.service_fdk.dao.WannaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WannaService {
    // 10.推送至代拿
    @Autowired
    @Resource
    private WannaDao wannaDao;

    public Integer setSubmitForwarderVO(boolean selectedAll, List<Integer> spuIds) {
        return wannaDao.setSubmitForwarderVO(selectedAll, spuIds);
    }
}

