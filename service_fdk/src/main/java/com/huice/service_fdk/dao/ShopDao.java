package com.huice.service_fdk.dao;

import com.huice.service_fdk.service.vo.ShopIdVO;
import com.huice.service_fdk.service.vo.data_MerchantIdList_15;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static com.huice.service_fdk.myjooq.db.tables.SysShop.SYS_SHOP;

@Repository
public class ShopDao extends BaseDao {

    public data_MerchantIdList_15 getShopWebNameListVO(boolean isAuthOnly, Long id) {
        data_MerchantIdList_15 lst = new data_MerchantIdList_15();
        if (isAuthOnly) {
            lst.setMerchantId(
                    db.select(SYS_SHOP.MERCHANT_ID.as("merchantId"))
                            .from(SYS_SHOP)
                            .where(SYS_SHOP.AUTH_STATUS.eq((byte) 1))
                            .and(SYS_SHOP.MERCHANT_ID.eq(id))
                            .fetchAnyInto(Integer.class)
            );
            List<Integer> sid = db.select(SYS_SHOP.ID).from(SYS_SHOP).fetchInto(Integer.class);
            List<ShopIdVO> shopIdVOS = new ArrayList<>();
            for (Integer ssid : sid) {
                ShopIdVO view =
                        db.select(
                                SYS_SHOP.ID.as("shopId"),
                                SYS_SHOP.SHOP_NAME.as("shopName")
                        )
                                .from(SYS_SHOP)
                                .where(SYS_SHOP.AUTH_STATUS.eq((byte) 1))
                                .and(SYS_SHOP.MERCHANT_ID.eq(id))
                                .fetchAnyInto(ShopIdVO.class);
                if (lst != null) shopIdVOS.add(view);
            }
            lst.setShopList(shopIdVOS);
            return lst;
        } else {
            lst.setMerchantId(
                    db.select(SYS_SHOP.MERCHANT_ID.as("merchantId"))
                            .from(SYS_SHOP)
                            .where(SYS_SHOP.MERCHANT_ID.eq(Long.valueOf(id)))
                            .fetchAnyInto(Integer.class)
            );
            List<Integer> sid = db.select(SYS_SHOP.ID).from(SYS_SHOP).fetchInto(Integer.class);
            List<ShopIdVO> shopIdVOS = new ArrayList<>();
            for (Integer ssid : sid) {
                ShopIdVO view =
                        db.select(
                                SYS_SHOP.ID.as("shopId"),
                                SYS_SHOP.SHOP_NAME.as("shopName")
                        )
                                .from(SYS_SHOP)
                                .where(SYS_SHOP.MERCHANT_ID.eq(Long.valueOf(id)))
                                .fetchAnyInto(ShopIdVO.class);
                if (view != null) shopIdVOS.add(view);
            }
            lst.setShopList(shopIdVOS);
            return lst;
        }
    }
}
