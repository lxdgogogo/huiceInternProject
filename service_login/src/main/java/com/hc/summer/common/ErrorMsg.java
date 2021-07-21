package com.hc.summer.common;

/**
 * @Description 错误码与错误信息获取接口
 * @Author liuyuqing
 * @Date 2020/10/30 10:21
 **/
public interface ErrorMsg {

    /**
     * 获取错误码
     *
     * @return 错误码
     * @author liuyuqing
     * @lastEditor liuyuqing
     * @createTime 2020/10/30 15:20
     * @editTime 2020/10/30 15:20
     **/
    int getCode();

    /**
     * 获取错误信息
     *
     * @return 错误信息
     * @author liuyuqing
     * @lastEditor liuyuqing
     * @createTime 2020/10/30 15:20
     * @editTime 2020/10/30 15:20
     **/
    String getMsg();
}
