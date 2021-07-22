package com.huice.service_fdk;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.common.page.PageParam;
import com.huice.service_fdk.dao.ForwarderDao;
import com.huice.service_fdk.entity.ManuallydownloadProductParam;
import com.huice.service_fdk.service.ForwarderService;
import com.huice.service_fdk.service.Platform_skuService;
import com.huice.service_fdk.service.impl.SellerForwardServiceImpl;
import com.huice.service_fdk.service.model.CityModel;
import com.huice.service_fdk.service.vo.ForwarderSummaryVO;
import com.huice.service_fdk.service.QueryService;
import com.huice.service_fdk.service.vo.SupplierGoodsList;
import com.huice.service_fdk.service.vo.forwarderSkuMapDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Resource
    private Platform_skuService platform_skuService;

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
    void getDownload() {
        ManuallydownloadProductParam Param = new ManuallydownloadProductParam();
        Param.setEndTime("2020-11-30");
        Param.setStartTime("2020-11-20");
        Param.setGoodsStatus((byte)0);
        Map<Integer,String> test = new HashMap<>();
        test.put(1,"店铺1");
        test.put(2,"店铺2");
        Param.setShopIds(test);
        String msg = "调用16测试";
        System.out.println(Result.ok(platform_skuService.getnewDownload(Param,1),msg));
    }
    @Test
    void getForwarderPushed() {
        ForwarderSummaryVO forwarderSummaryVO = forwarderService.getForwarderPushedSummaryVO(0);
        System.out.println(forwarderSummaryVO);
    }
    @Test
    void getSupplierassign() {
        List<forwarderSkuMapDTO> test = new ArrayList<>();
        forwarderSkuMapDTO forwarderSkuMapDTO1 = new forwarderSkuMapDTO();
        forwarderSkuMapDTO1.setCityCode((long)565);
        forwarderSkuMapDTO1.setCityName("aaa");
        forwarderSkuMapDTO1.setMarketCode((long)1234);
        forwarderSkuMapDTO1.setMarketName("aaaa");
        forwarderSkuMapDTO1.setItemNo("dsjfnsi");
        forwarderSkuMapDTO1.setSellerSkuId((long)1);
        forwarderSkuMapDTO1.setRemark("aaaa");
        forwarderSkuMapDTO1.setSellerSkuId((long)1);
        forwarderSkuMapDTO1.setSellerSpuId((long)1);
        forwarderSkuMapDTO1.setFloorName("bbb");
        forwarderSkuMapDTO1.setFloorCode((long)222);
        forwarderSkuMapDTO1.setPurchasePrice((float)2.3);
        forwarderSkuMapDTO1.setForwarderSupplierId((long)1);
        forwarderSkuMapDTO1.setSupplierName("ggggg");
        forwarderSkuMapDTO1.setBusinessName("222");
        forwarderSkuMapDTO1.setGoodsNo("12344");
        test.add(forwarderSkuMapDTO1);
        String msg = "调用9.指定供货商接口";
        System.out.println(Result.ok(forwarderService.getSupplierAssign(9637,test),msg));
    }
}
