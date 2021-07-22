package com.huice.service_fdk;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.common.page.PageParam;
import com.huice.service_fdk.dao.ForwarderDao;
import com.huice.service_fdk.service.ForwarderService;
import com.huice.service_fdk.service.impl.SellerForwardServiceImpl;
import com.huice.service_fdk.service.model.CityModel;
import com.huice.service_fdk.service.vo.ForwarderSummaryVO;
import com.huice.service_fdk.service.QueryService;
import com.huice.service_fdk.service.vo.SupplierGoodsList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ServiceFdkApplicationTests {

    @Resource
    private ForwarderService forwarderService;
    @Resource
    private QueryService queryService;
    @Resource
    private SellerForwardServiceImpl sellerForwardService;
    @Resource
    private ForwarderDao forwarderDao;

    @Test
    void getSummarySumVOTest() {
        System.out.print(Result.ok(forwarderService.getSummarySumVO((long)1)));
    }

    @Test
    void getForwarderGoodsVOlistTest() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.print(Result.ok(forwarderService.getForwarderGoodsVOlist((long)9636,arrayList)));
    }
    @Test
    void getPageForwarderSupplierDao() {
        PageParam pageParam = new PageParam();
        PageContentContainer<SupplierGoodsList> pageContentContainer =  queryService.getPage(pageParam);
        System.out.println(pageContentContainer);
    }

    @Test
    void getForwarderCity() {
        List<CityModel> cityModels = sellerForwardService.selectCityInfo();
        System.out.println(cityModels);
    }

    @Test
    void getForwarderPushed() {
        ForwarderSummaryVO forwarderSummaryVO = forwarderService.getForwarderPushedSummaryVO(0);
        System.out.println(forwarderSummaryVO);
    }

}
