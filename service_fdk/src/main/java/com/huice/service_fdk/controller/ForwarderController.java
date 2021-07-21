package com.huice.service_fdk.controller;

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
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/forwarder")
public class ForwarderController {
    @Resource
    private ForwarderService forwarderService;


    private static String getRequestParameter(String parameterName){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if(requestAttributes instanceof ServletRequestAttributes){
            HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
            String value = request.getParameter(parameterName);
            String nullStr = "null";
            if(nullStr.equals(value) || org.springframework.util.StringUtils.isEmpty(value)){
                return null;
            }
            return value;
        }
        return null;
    }
    //2.代拿汇总 - 待推送(左侧) （获取待推送汇总数据）
    @GetMapping ("/wait/push/summary")
    public Result<ForwarderSummaryVO> WaitPushSummary() {
        Long merchant_id= Long.valueOf(Objects.requireNonNull(getRequestParameter("merchant_id")));
        //if(merchant_id == null){String msg ="未授权，请先登录";return Result.error(401,msg);}
        String msg = "调用2.代拿汇总 - 待推送(左侧) （获取待推送汇总数据）";
        return Result.ok(forwarderService.getForwarderSummaryVO(merchant_id),msg);
    }

    //4.代拿汇总 -  右侧表头的待推送数据和已推送数据
    @GetMapping ("/summary/sum")
    public Result<SummarySumVO> SummarySum(Integer supplierId) {
        Long merchant_id= Long.valueOf(Objects.requireNonNull(getRequestParameter("merchant_id")));
        //if(merchant_id == null){String msg ="未授权，请先登录";return Result.error(401,msg);}
        String msg = "调用4.代拿汇总 -  右侧表头的待推送数据和已推送数据";
        return Result.ok(forwarderService.getSummarySumVO(merchant_id),msg);
    }

    //7.指定货品时的供货商信息
    @PostMapping("/supplier/info")
    public Result<List<ForwarderGoodsVO>> SupplierInfo(List<Integer> spuIdList) {
        Long merchant_id= Long.valueOf(Objects.requireNonNull(getRequestParameter("merchant_id")));
        //这里供货商一定存在在左侧销售商好友列表中
        String msg = "调用7.指定货品时的供货商信息";
        return Result.ok(forwarderService.getForwarderGoodsVOlist(merchant_id,spuIdList),msg);
    }

    //8.指定供货商时的供货商列表
    @PostMapping ("/supplier/list")
    public Result<List<ForwarderSupplierGroupVO>> SupplierList() {
        String msg = "调用8.指定供货商时的供货商列表";
        Long merchant_id= Long.valueOf(Objects.requireNonNull(getRequestParameter("merchant_id")));
        return Result.ok(forwarderService.getForwarderSupplierGroupVO(merchant_id),msg);
    }
}

