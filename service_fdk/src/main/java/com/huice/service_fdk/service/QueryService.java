package com.huice.service_fdk.service;

import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.common.page.PageParam;
import com.huice.service_fdk.dao.ForwarderPageInitVODao;
import com.huice.service_fdk.dao.ForwarderSupplierGroupDao;
//import com.huice.service_fdk.dao.PageContentContainerSKUDao;
import com.huice.service_fdk.dao.ForwarderSupplierOnPrepareGroupDao;
import com.huice.service_fdk.dao.PageForwarderSupplierDao;
import com.huice.service_fdk.service.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QueryService {
    // 1.获取代拿供货商分组
    @Resource
    private final ForwarderSupplierGroupDao forwarderSupplierGroupDao = new ForwarderSupplierGroupDao();

    //3.待推送列表分页查询
    @Resource
    private final PageForwarderSupplierDao pageForwarderSupplierDao = new PageForwarderSupplierDao();

    //5.获取级联档口地址初始化接口
    @Resource
    private final ForwarderSupplierOnPrepareGroupDao forwarderSupplierOnPrepareGroupDao = new ForwarderSupplierOnPrepareGroupDao();

    //12.已推送供货商列表
    @Resource
    private final ForwarderPageInitVODao forwarderPageInitVODao = new ForwarderPageInitVODao();

    public List<ForwarderSupplierGroupVO> getForwarderSupplierGroupVO(long id) {
        return forwarderSupplierGroupDao.getForwarderSupplierGroupVO(id);
    }

    public PageContentContainer<SupplierGoodsList> getPage(PageParam pageParam) {
        PageContentContainer<SupplierGoodsList> page = pageForwarderSupplierDao.getPage();
        List<SupplierGoodsList> supplierGoodsLists = page.getList();
        List<Long> supplierIds = supplierGoodsLists.stream().map(SupplierGoodsList::getSupplierId).collect(Collectors.toList());
        List<SPU> spuList = pageForwarderSupplierDao.getSpuList(supplierIds);
        List<SKUItemVO> skuItemVOList = pageForwarderSupplierDao.getSkuList(supplierIds, pageParam);
        spuList.forEach(
                o -> o.setSkuList(skuItemVOList.stream().filter(
                        i -> i.getSellerSpuId() == o.getSpuId()
                ).collect(Collectors.toList()))
        );
        supplierGoodsLists.forEach(
                o -> o.setSpuList(spuList.stream().filter(
                        i -> i.getSkuList().get(0).getSupplierId() == o.getSupplierId()
                ).collect(Collectors.toList()))
        );
        return page;
    }

    public List<ForwarderSupplierGroupVO> getForwarderSupplierOnPrepareGroupDao(long id) {
        return forwarderSupplierOnPrepareGroupDao.getForwarderSupplierGroupVO(id);
    }

    public ForwarderPageInitVO getForwarderPageInitVODao(long id) {
        return forwarderPageInitVODao.getForwarderPageInitVO(id);
    }
}
