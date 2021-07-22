/*
 * Copyright 2019-2020 北京掌上先机网络科技有限公司
 */

package com.hc.summer.common.page;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @author zhengbaole
 */
@Data
public class PageParam implements IPageParam {

    public static final int DEFAULT_PAGE_ROWS = 20;
    public static final int DEFAULT_CURRENT_PAGE = 1;
    /**
     * Page Index
     */
    protected Integer pageIndex = DEFAULT_CURRENT_PAGE;
    /**
     * Page Size
     */
    protected Integer pageSize = DEFAULT_PAGE_ROWS;

    @JsonIgnore
    @Override
    public Integer getPage() {
        return pageIndex;
    }

    @JsonIgnore
    @Override
    public Integer getSize() {
        return pageSize;
    }
}
