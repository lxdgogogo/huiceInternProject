/*
 * Copyright 2019-2020 北京掌上先机网络科技有限公司
 */

package com.huice.service_fdk.common.page;

import com.fasterxml.jackson.annotation.JsonIgnore;


public interface IPageParam {

    /**
     * 当前页码
     */
    @JsonIgnore
    Integer getPage();

    /**
     * 页容量
     */
    @JsonIgnore
    Integer getSize();
}
