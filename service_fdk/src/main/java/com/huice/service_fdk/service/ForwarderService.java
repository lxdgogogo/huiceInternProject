package com.huice.service_fdk.service;

import com.huice.service_fdk.dao.ForwarderDao;
import com.huice.service_fdk.dao.ForwarderSupplierGroupDao;
import com.huice.service_fdk.service.vo.ForwarderGoodsVO;
import com.huice.service_fdk.service.vo.ForwarderSummaryVO;
import com.huice.service_fdk.service.vo.ForwarderSupplierGroupVO;
import com.huice.service_fdk.service.vo.SummarySumVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForwarderService {
    @Resource
    private ForwarderDao forwarderDao;
    @Resource
    private ForwarderSupplierGroupDao forwarderSupplierGroupDao;


    public ForwarderSummaryVO getForwarderSummaryVO(long merchant_id){
        return forwarderDao.getForwarderSummaryVO(merchant_id);

    }

    public SummarySumVO getSummarySumVO(long merchant_id) {
        return forwarderDao.getSummarySumVO(merchant_id);
    }

    public List<ForwarderGoodsVO> getForwarderGoodsVOlist(long merchant_id, List<Integer> spuIdList) {
        return forwarderDao.getForwarderGoodsVOlist(merchant_id,spuIdList);
    }
    public List<ForwarderSupplierGroupVO> getForwarderSupplierGroupVO(long merchant_id) {
        return forwarderSupplierGroupDao.getForwarderSupplierGroupVO(merchant_id);
    }


}
