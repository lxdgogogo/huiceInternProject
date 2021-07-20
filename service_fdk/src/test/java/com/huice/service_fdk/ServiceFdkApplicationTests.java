package com.huice.service_fdk;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.service.ForwarderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ServiceFdkApplicationTests {

    @Resource
    private ForwarderService forwarderService;
    @Test
    void getSummarySumVOTest() {
        System.out.print(Result.ok(forwarderService.getSummarySumVO((long)1)));
    }

    @Test
    void getForwarderGoodsVOlistTest() {
        String msg ;
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.print(Result.ok(forwarderService.getForwarderGoodsVOlist((long)9636,arrayList)));
    }
}
