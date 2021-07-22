package com.hc.summer.dao;

import com.hc.summer.common.page.PageContent;
import com.hc.summer.common.page.PageContentContainer;
import com.hc.summer.common.page.PageParam;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Consumer;

/**
 * @Description Base dao
 * @Author zhengbaole
 * @Date 2020/11/11
 **/
@Repository
public class BaseDao {

    @Value("${security.data.enabled:false}")
    private Boolean enabled;

    @Resource(name = "dslContext")
    protected DSLContext db;

    protected <T> PageContentContainer<T> getPageResult(SelectLimitStep<?> query, PageParam param, Class<T> clz) {
        return getPageResult(query, param.getPageIndex(), param.getPageSize(), clz);
    }

    protected <T> PageContentContainer<T> getPageResult(
            SelectLimitStep<?> query, PageParam param, Class<T> clz, Consumer<T> processor) {
        PageContentContainer<T> pageResult = getPageResult(query, param.getPageIndex(), param.getPageSize(), clz);
        List<T> list = pageResult.getList();
        list.forEach(processor);
        return pageResult;
    }

    protected <T> PageContentContainer<T> getPageResult(SelectLimitStep<?> query, PageParam param, Class<T> clz,
            PageContentContainer<T> container) {
        return getPageResult(query, param.getPageIndex(), param.getPageSize(), clz, container);
    }

    /**
     * 推荐使用 {@link #getPageResult(SelectLimitStep, PageParam, Class)}
     *
     * @deprecated 推荐入参类型继承 {@link PageParam} 类
     */
    @Deprecated
    protected <T> PageContentContainer<T> getPageResult(SelectLimitStep<?> select, Integer currentPage,
            Integer pageRows, Class<T> clazz) {
        return getPageResult(select, currentPage, pageRows, clazz, null);
    }

    /**
     * 推荐使用 {@link #getPageResult(SelectLimitStep, PageParam, Class)}
     *
     * @deprecated 推荐入参类型继承 {@link PageParam} 类
     */
    @Deprecated
    private <T> PageContentContainer<T> getPageResult(SelectLimitStep<?> select, Integer currentPage,
            Integer pageRows, Class<T> clazz, PageContentContainer<T> container) {
        if (pageRows == null || pageRows <= 0) {
            pageRows = PageParam.DEFAULT_PAGE_ROWS;
        }
        PageContentContainer<T> result;
        if (null != container) {
            result = container;
        } else {
            result = new PageContent<>();
        }
        if (select == null) {
            result.setTotal(0);
            result.setList(Collections.emptyList());
            return result;
        }
        int count = fetchCount(select);
        if (currentPage == null || currentPage < PageParam.DEFAULT_CURRENT_PAGE) {
            currentPage = PageParam.DEFAULT_CURRENT_PAGE;
        }
        result.setTotal(count);
        if ((currentPage - 1) * pageRows >= count) {
            result.setList(Collections.emptyList());
            return result;
        }
        if (count > 0) {
            result.setList(select.limit((currentPage - 1) * pageRows, (int) pageRows).fetchInto(clazz));
        }
        return result;
    }

    protected int fetchCount(Select<?> select) {
        return db.fetchCount(select);
    }

    public interface GetPage<T, E> {

        PageContentContainer<T> page(SelectLimitStep<?> query, E param, Class<T> clz);
    }


    /**
     * List 升序排列 查询条件 where in 条件中排序用
     *
     * @author weike
     * @lastEditor weike
     * @createTime 2021/1/28 14:46
     * @editTime
     **/
    protected static <T extends Comparable<? super T>> List<T> ascendingOrder(List<T> list) {
        java.util.Objects.requireNonNull(list, "Condition object list is null. ");
        Collections.sort(list);
        return list;
    }

    /**
     * List 升序排列 查询条件 where in 条件中排序用
     *
     * @author zhengbaole
     * @lastEditor zhengbaole
     * @createTime 2021/2/2 7:23 PM
     * @editTime
     **/
    protected static <T extends Comparable<? super T>> List<T> ascendingOrder(Set<T> set) {
        Objects.requireNonNull(set, "Condition object list is null. ");
        ArrayList<T> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
