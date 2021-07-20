package com.huice.service_forwarder.dao;

import com.huice.service_forwarder.entity.Business;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.huice.service_forwarder.db.tables.BaseBusinessInfo.BASE_BUSINESS_INFO;
/**
 * @author SoonMachine
 * @description Base information about business
 */
@Repository
public class BusinessDao extends BaseDao{

    public List<Business> queryAll(){
        return this.db.select()
                .from(BASE_BUSINESS_INFO)
                .fetchInto(Business.class);
    }

}
