package com.huice.service_forwarder.dao;

import com.huice.service_forwarder.entity.SellerName;
import org.jooq.types.ULong;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.huice.service_forwarder.db.tables.Seller.SELLER;
/**
 * @author SoonMachine
 */
@Repository
public class SellerDao extends BaseDao{
    public SellerName querySellerNameBySellId(Long sellerId){
        List<SellerName> sellerNames = this.db.select(SELLER.NAME, SELLER.SHORT_NAME)
                .from(SELLER)
                .where(SELLER.ID.eq(ULong.valueOf(sellerId)))
                .fetchInto(SellerName.class);

        if (!sellerNames.isEmpty()) {
            return sellerNames.get(0);
        } else {
            SellerName sellerName = new SellerName();
            sellerName.setSellerName("商家名称不存在");
            sellerName.setSellerShortName("商家简称不存在");
            return sellerName;
        }
    }
}
