package com.huice.service_forwarder;

import com.huice.service_forwarder.dao.BusinessDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceForwarderApplicationTests {

    @Autowired
    private BusinessDao businessDao;

    @Test
    void contextLoads() {
        System.out.println(this.businessDao.queryAll().toArray().toString());
    }

}
