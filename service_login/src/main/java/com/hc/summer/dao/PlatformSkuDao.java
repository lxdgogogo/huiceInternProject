package com.hc.summer.dao;

import com.hc.summer.common.page.PageContentContainer;
import com.hc.summer.service.data.PlatformSkuVO;
import com.hc.summer.service.data.param.PlatformSkuDownloadParam;
import org.springframework.stereotype.Component;

/**
 * @Description 类描述
 * @Author niuzhenyu
 * @Date 2021/7/10 13:48
 **/
@Component
public class PlatformSkuDao extends BaseDao {

    private PageContentContainer<PlatformSkuVO> querySkuListPageLimit(PlatformSkuDownloadParam param) {
        return null;
    }
}
