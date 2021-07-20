package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.service.ForwarderPageInitVO;
import com.huice.service_fdk.service.ForwarderSupplierGroupVO;
import com.huice.service_fdk.service.PageContentContainerSKU;
import com.huice.service_fdk.service.queryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/query")
public class QueryController {
    @Resource
    private queryService queryService;
    // 1.获取代拿供货商分组

    @GetMapping("/wait/push/biz/summary/list/{id}")
    public Result<List<ForwarderSupplierGroupVO>> getForwarderSupplierGroupVO(@PathVariable String id) {
        return Result.ok(queryService.getForwarderSupplierGroupVO(Long.parseLong(id)));
    }

    //3.待推送列表分页查询
    @GetMapping("/wait/push/page")
    public Result<PageContentContainerSKU> getPageContentContainerSKU(long id){
        return Result.ok(queryService.getPageContentContainerSKU(id));
    }

    //5.获取级联档口地址初始化接口

    @PostMapping("/wait/push/page/init")
    public Result<ForwarderPageInitVO> getForwarderPageInitVODao(long id) {
        return Result.ok(queryService.getForwarderPageInitVO(id));
    }


}
