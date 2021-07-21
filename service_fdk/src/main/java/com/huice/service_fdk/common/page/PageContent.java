/*
 * Copyright 2019-2020 北京掌上先机网络科技有限公司
 */

package com.huice.service_fdk.common.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhengbaole
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageContent<T> implements PageContentContainer<T> {

    protected Integer total;
    protected List<T> list;
}
