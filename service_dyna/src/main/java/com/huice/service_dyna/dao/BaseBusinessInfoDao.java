package com.huice.service_dyna.dao;

import com.huice.service_dyna.entity.BaseBusinessInfo;
import org.springframework.stereotype.Repository;
import static com.huice.service_dyna.db.tables.BaseBusinessInfo.BASE_BUSINESS_INFO;

import java.util.List;

/**
 * @author SoonMachine
 */

@Repository
public class BaseBusinessInfoDao extends BaseDao{

    public List<BaseBusinessInfo> getBaseBusinessInfo(){
        return db.select()
                .from(BASE_BUSINESS_INFO)
                .fetchInto(BaseBusinessInfo.class);
    }
}
