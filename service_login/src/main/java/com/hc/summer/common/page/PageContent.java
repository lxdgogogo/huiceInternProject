/*
 * Copyright 2019-2020 北京掌上先机网络科技有限公司
 */

package com.hc.summer.common.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

/**
 * @author zhengbaole
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageContent<T> implements PageContentContainer<T> {

    protected Integer total = 0;
    protected List<T> list = Collections.emptyList();
}
