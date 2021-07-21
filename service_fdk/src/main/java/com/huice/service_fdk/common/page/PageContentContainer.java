/*
 * Copyright 2019-2020 北京掌上先机网络科技有限公司
 */

package com.huice.service_fdk.common.page;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * @author zhengbaole
 */
public interface PageContentContainer<T> {

    /**
     * 总量
     *
     * @param total 总量
     */
    void setTotal(Integer total);

    /**
     * 列表
     *
     * @param list 列表
     */
    void setList(List<T> list);

    /**
     * 获取列表
     *
     * @return 列表
     */
    List<T> getList();

    /**
     * 获取总量
     *
     * @return 总量
     */
    Integer getTotal();

    /**
     * 结果是否为空列表
     */
    @JsonIgnore
    default boolean isEmpty() {
        return null == getList() || getList().isEmpty();
    }
}
