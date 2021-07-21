/*
 * Copyright 2019-2020 北京掌上先机网络科技有限公司
 */

package com.huice.service_fdk.common.page;

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

    @Override
    public Integer getPage() {
        return pageIndex;
    }

    @Override
    public Integer getSize() {
        return pageSize;
    }
}
