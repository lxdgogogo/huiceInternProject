package com.huice.service_fdk.dao;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Description 类描述
 * @Author niuzhenyu
 * @Date 2021/7/11 20:19
 **/
@Repository
public class BaseDao {

    @Resource(name = "dslContext")
    DSLContext db;

    @Resource(name = "dslContextCheckMerchant")
    DSLContext dbCheckMerchant;

}
