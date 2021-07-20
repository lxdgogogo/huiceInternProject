package com.huice.service_forwarder.dao;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author SoonMachine
 * @description BaseDao of JOOQ
 * @date 2021-7-19 17:55:19
 */
@Repository
public class BaseDao {
    @Resource(name = "dslContext")
    DSLContext db;

    @Resource(name = "dslContextCheckMerchant")
    DSLContext dbCheckMerchant;

}
