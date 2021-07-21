package com.huice.service_forwarder;

import com.huice.service_forwarder.controller.query.SupplierListQuery;
import com.huice.service_forwarder.controller.vo.CityTree;
import com.huice.service_forwarder.dao.BusinessDao;
import com.huice.service_forwarder.dao.FetchOrderDao;
import com.huice.service_forwarder.entity.FetchOrder;
import com.huice.service_forwarder.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ServiceForwarderApplicationTests {

    @Autowired
    private BusinessService businessService;

    @Autowired
    private FetchOrderDao fetchOrderDao;

    @Test
    void contextLoads() {
        List<CityTree> cityTrees = this.businessService.queryAllBusiness();
        for (CityTree cityTree : cityTrees){
            System.out.println(cityTree.getCityName());
        }
    }
    @Test
    void test2() {
        SupplierListQuery supplierListQuery = new SupplierListQuery();
        supplierListQuery.setSpuGoodsNo("7211");
        List<FetchOrder> fetchOrders = this.fetchOrderDao.fetchOrdersByQuery(supplierListQuery);
        for (FetchOrder fetchOrder : fetchOrders){
            System.out.println(fetchOrder.getId());
            System.out.println(fetchOrder.getCityName());
        }
    }


}
