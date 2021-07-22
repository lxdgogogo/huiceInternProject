package com.huice.service_fdk.Controller;

import com.huice.service_fdk.common.AuthContext;
import com.huice.service_fdk.common.Result;
import com.huice.service_fdk.service.*;
import com.huice.service_fdk.service.vo.ForwarderGoodsVO;
import com.huice.service_fdk.service.vo.ForwarderSummaryVO;
import com.huice.service_fdk.service.vo.ForwarderSupplierGroupVO;
import com.huice.service_fdk.service.vo.SummarySumVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/forwarder")
public class ForwarderController {
    @Resource
    private ForwarderService forwarderService;


    //2.代拿汇总 - 待推送(左侧) （获取待推送汇总数据）
    @GetMapping ("/wait/push/summary")
    public Result<ForwarderSummaryVO> WaitPushSummary(HttpServletRequest request) {
        long merchantId = Long.parseLong(request.getParameter("merchantId"));
        //if(merchant_id == null){String msg ="未授权，请先登录";return Result.error(401,msg);}
        String msg = "调用2.代拿汇总 - 待推送(左侧) （获取待推送汇总数据）";
        return Result.ok(forwarderService.getForwarderSummaryVO(merchantId),msg);
    }

    //4.代拿汇总 -  右侧表头的待推送数据和已推送数据
    @GetMapping ("/summary/sum")
    public Result<SummarySumVO> SummarySum(Integer supplierId, HttpServletRequest request) {
        long merchantId = Long.parseLong(request.getParameter("merchantId"));
        //if(merchant_id == null){String msg ="未授权，请先登录";return Result.error(401,msg);}
        String msg = "调用4.代拿汇总 -  右侧表头的待推送数据和已推送数据";
        return Result.ok(forwarderService.getSummarySumVO(merchantId),msg);
    }

    //7.指定货品时的供货商信息
    @PostMapping("/supplier/info")
    public Result<List<ForwarderGoodsVO>> SupplierInfo(List<Integer> spuIdList, HttpServletRequest request) {
        long merchantId = Long.parseLong(request.getParameter("merchantId"));
        //这里供货商一定存在在左侧销售商好友列表中
        String msg = "调用7.指定货品时的供货商信息";
        return Result.ok(forwarderService.getForwarderGoodsVOlist(merchantId,spuIdList),msg);
    }

    //8.指定供货商时的供货商列表
    @PostMapping ("/supplier/list")
    public Result<List<ForwarderSupplierGroupVO>> SupplierList(HttpServletRequest request) {
        long merchantId = Long.parseLong(request.getParameter("merchantId"));
        String msg = "调用8.指定供货商时的供货商列表";
        return Result.ok(forwarderService.getForwarderSupplierGroupVO(merchantId),msg);
    }

    //11.已推送备货汇总数据
    @GetMapping("/pushed/summary")
    public Result<ForwarderSummaryVO> getPushedSummary(HttpServletRequest request){
        long merchantId = Long.parseLong(request.getParameter("merchantId"));
        ForwarderSummaryVO forwarderSummaryVO = forwarderService.getForwarderSummaryVO(merchantId);
        return Result.ok(forwarderSummaryVO);
    }
}

