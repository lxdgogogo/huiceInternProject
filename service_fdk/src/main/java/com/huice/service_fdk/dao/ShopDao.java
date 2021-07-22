package com.huice.service_fdk.dao;

import com.huice.service_fdk.myjooq.db.tables.SysShop;
import com.huice.service_fdk.service.vo.ShopIdVO;
import com.huice.service_fdk.service.vo.data_MerchantIdList_15;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ShopDao extends BaseDao {

    public List<data_MerchantIdList_15> getShopWebNameListVO(boolean isAuthOnly) {
        List<data_MerchantIdList_15> lst = new ArrayList<>();
        List<Integer> ShopIdList = db.select(SysShop.SYS_SHOP.ID).from(SysShop.SYS_SHOP).fetchInto(Integer.class);
        if (isAuthOnly) {
            for (Integer id : ShopIdList) {
                data_MerchantIdList_15 view = new data_MerchantIdList_15();
                //assert view != null;
                view.setMerchantId(
                        db.select(SysShop.SYS_SHOP.MERCHANT_ID.as("merchantId"))
                                .from(SysShop.SYS_SHOP)
                                .where(SysShop.SYS_SHOP.AUTH_STATUS.eq((byte) 1))
                                .fetchAnyInto(Integer.class)
                );
                view.setShopList(
                        db.select(
                                SysShop.SYS_SHOP.ID.as("shopId"),
                                SysShop.SYS_SHOP.SHOP_NAME.as("shopName")
                        )
                                .from(SysShop.SYS_SHOP)
                                .where(SysShop.SYS_SHOP.AUTH_STATUS.eq((byte) 1))
                                .fetchAnyInto(ShopIdVO.class)
                );
                if (view != null) lst.add(view);
            }
            return lst;
        } else {
            for (Integer id : ShopIdList) {
                data_MerchantIdList_15 view = new data_MerchantIdList_15();
                view.setMerchantId(
                        db.select(SysShop.SYS_SHOP.MERCHANT_ID.as("merchantId"))
                                .from(SysShop.SYS_SHOP)
                                .where(SysShop.SYS_SHOP.ID.eq(Long.valueOf(id)))
                                .fetchAnyInto(Integer.class)
                );
                view.setShopList(
                        db.select(
                                SysShop.SYS_SHOP.ID.as("shopId"),
                                SysShop.SYS_SHOP.SHOP_NAME.as("shopName")
                        )
                                .from(SysShop.SYS_SHOP)
                                .where(SysShop.SYS_SHOP.ID.eq(Long.valueOf(id)))
                                .fetchAnyInto(ShopIdVO.class)
                );
                if (view != null) lst.add(view);
            }
            return lst;
        }
    }
}
