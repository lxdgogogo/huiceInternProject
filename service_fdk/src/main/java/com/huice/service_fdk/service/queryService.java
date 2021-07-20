package com.huice.service_fdk.service;

import com.huice.service_fdk.dao.ForwarderPageInitVODao;
import com.huice.service_fdk.dao.ForwarderSupplierGroupDao;
//import com.huice.service_fdk.dao.PageContentContainerSKUDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class queryService {
    @Resource
    private final ForwarderSupplierGroupDao forwarderSupplierGroupDao = new ForwarderSupplierGroupDao();

    @Resource
    private final ForwarderPageInitVODao forwarderPageInitVODao = new ForwarderPageInitVODao();

    //@Resource
    //private final PageContentContainerSKUDao pageContentContainerSKUDao = new PageContentContainerSKUDao();

    public List<ForwarderSupplierGroupVO> getForwarderSupplierGroupVO(long id) {
        return forwarderSupplierGroupDao.getForwarderSupplierGroupVO(id);
    }
    public ForwarderPageInitVO getForwarderPageInitVO(long id){
        return forwarderPageInitVODao.getForwarderPageInitVO(id);
    }
    public PageContentContainerSKU getPageContentContainerSKU(long id){
       // return pageContentContainerSKUDao.getPageContentContainerSKU(id);
        return null;
    }
}
