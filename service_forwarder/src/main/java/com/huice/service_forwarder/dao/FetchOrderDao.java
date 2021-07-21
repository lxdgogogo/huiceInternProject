package com.huice.service_forwarder.dao;

import com.huice.service_forwarder.controller.query.SupplierListQuery;
import com.huice.service_forwarder.entity.FetchOrder;
import org.jooq.Condition;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import java.util.List;
import static com.huice.service_forwarder.db.tables.SellerFetchOrder.SELLER_FETCH_ORDER;
import static org.jooq.impl.DSL.concat;
import static org.jooq.impl.DSL.noCondition;
/**
 * @author SoonMachine
 */
@Repository
public class FetchOrderDao extends BaseDao{
    public List<FetchOrder> takeGoodsInList(){
        return this.db.select()
                .from(SELLER_FETCH_ORDER)
                .fetchInto(FetchOrder.class);
    }

    public List<FetchOrder> fetchOrdersByQuery(SupplierListQuery supplierListQuery){
        Condition condition = noCondition();
        if (supplierListQuery.getStatus() != null){
            condition.and(SELLER_FETCH_ORDER.STATUS.eq(supplierListQuery.getStatus()));
        }
        if (supplierListQuery.getCityId() != null){
            condition.and(SELLER_FETCH_ORDER.CITY_ID.eq(supplierListQuery.getCityId()));
        }
        if (supplierListQuery.getBizFullName() != null){
            condition.and(SELLER_FETCH_ORDER.BIZ_NAME.eq(supplierListQuery.getBizFullName()));
        }
        if (supplierListQuery.getSpuGoodsNo() != null){
            condition.and(SELLER_FETCH_ORDER.SPU_GOODS_NO.like(concat("%",supplierListQuery.getSpuGoodsNo(),"%")));
        }
        if (supplierListQuery.getMarketId() != null){
            condition.and(SELLER_FETCH_ORDER.MARKET_ID.eq(supplierListQuery.getMarketId()));
        }

        return this.db.select()
                .from(SELLER_FETCH_ORDER)
                .where(condition)
                .fetchInto(FetchOrder.class);
    }
}
