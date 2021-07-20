package com.huice.service_dyna;

import com.huice.service_dyna.service.SellerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class ServiceDynaApplicationTests {

    @Autowired
    private SellerService sellerService;

    @Test
    void contextLoads() {
        System.out.println(Arrays.toString(this.sellerService.queryAll().toArray()));

    }

}
