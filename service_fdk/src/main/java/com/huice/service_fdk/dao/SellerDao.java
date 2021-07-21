package com.huice.service_fdk.dao;

import com.huice.service_fdk.service.vo.SellerSpuVO;
import com.huice.service_fdk.common.page.PageContent;
import com.huice.service_fdk.common.page.PageContentContainer;
import com.huice.service_fdk.entity.QueryPageSellerSpuParam;
import org.springframework.stereotype.Repository;

import javax.xml.ws.RespectBinding;

@Repository
public class SellerDao {

    public PageContentContainer<SellerSpuVO> getSellerGoodsQueryPage(QueryPageSellerSpuParam pageParam, Long merchant_id) {
        PageContent<SellerSpuVO> pageContent = new PageContent<>();

        return null;
    }
}
