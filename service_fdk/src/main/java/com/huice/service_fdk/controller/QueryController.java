package com.huice.service_fdk.controller;

import com.huice.service_fdk.common.AuthContext;
import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.common.page.PageParam;
import com.huice.service_fdk.service.*;
import com.huice.service_fdk.service.vo.ForwarderPageInitVO;
import com.huice.service_fdk.service.vo.ForwarderSupplierGroupVO;
import com.huice.service_fdk.service.vo.SupplierGoodsList;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/query")
public class QueryController {
    @Resource
    private QueryService queryService;

    // 1.获取代拿供货商分组

    @GetMapping("/wait/push/biz/summary/list")
    public Result<List<ForwarderSupplierGroupVO>> getForwarderSupplierGroupVO(HttpServletRequest request) {
        long id = Long.parseLong(request.getParameter("merchantId"));
        return Result.ok(queryService.getForwarderSupplierGroupVO(id));
    }

    //3.待推送列表分页查询
    @PostMapping("/wait/push/page")
    public Result<PageContentContainer<SupplierGoodsList>> select(@RequestBody PageParam pageParam) {

        return Result.ok(queryService.getPage(pageParam));
    }

    //5.获取级联档口地址初始化接口

    @GetMapping("/wait/push/page/init")
    public Result<ForwarderPageInitVO> getForwarderPageInitVODao() {
        String idString = AuthContext.getRequestParameter("merchantId");
        if(idString == null){
            return Result.error(500,"request的ID是空的");
        }
        long id = Long.parseLong(idString);
        //long id = Long.parseLong(request.getParameter("merchantId"));
        return Result.ok(queryService.getForwarderPageInitVODao(id));
    }

    //12.已推送供货商列表
    @GetMapping("" +
            "/pushed/biz/summary/list")
    public Result<List<ForwarderSupplierGroupVO>> getForwarderSupplierOnPrepareGroupDao(HttpServletRequest request) {
        long id = Long.parseLong(request.getParameter("merchantId"));
        return Result.ok(queryService.getForwarderSupplierOnPrepareGroupDao(id));
    }

}
