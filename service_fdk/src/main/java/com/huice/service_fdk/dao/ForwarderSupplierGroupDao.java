package com.huice.service_fdk.dao;

import com.huice.service_fdk.service.ForwarderSupplierGroupVO;
import com.huice.service_fdk.service.ForwarderSupplierVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier.FORWARDER_SUPPLIER;

@Repository
public class ForwarderSupplierGroupDao extends BaseDao{
    public List<ForwarderSupplierGroupVO> getForwarderSupplierGroupVO(long id){
        //FORWARDER_SUPPLIER.GROUP_NAME,
        List<String> groups = db.selectDistinct(FORWARDER_SUPPLIER.GROUP_NAME)
                .from(FORWARDER_SUPPLIER)
                .where(FORWARDER_SUPPLIER.MERCHANT_ID.equal(id))
                .fetchInto(String.class);
        List<ForwarderSupplierVO> forwarderSupplierVOList =db.select(
                FORWARDER_SUPPLIER.BUSINESS,
                FORWARDER_SUPPLIER.CITY,
                FORWARDER_SUPPLIER.CITY_CODE,
                FORWARDER_SUPPLIER.FLOOR,
                FORWARDER_SUPPLIER.FLOOR_CODE,
                FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID,
                FORWARDER_SUPPLIER.GROUP_NAME,
                FORWARDER_SUPPLIER.MARKET,
                FORWARDER_SUPPLIER.MARKET_CODE,
                FORWARDER_SUPPLIER.SUPPLIER_NAME
        )
                .from(FORWARDER_SUPPLIER)
                .where(FORWARDER_SUPPLIER.MERCHANT_ID.equal(id))
                .fetchInto(ForwarderSupplierVO.class);
        List<ForwarderSupplierGroupVO> forwarderSupplierGroupVOList = new ArrayList<>();
        for(String group:groups){
            ForwarderSupplierGroupVO forwarderSupplierGroupVO = new ForwarderSupplierGroupVO(group);
            forwarderSupplierGroupVOList.add(forwarderSupplierGroupVO);
            forwarderSupplierGroupVO.getSuppliers().addAll(
                            forwarderSupplierVOList.stream()
                            .filter(forwarderSupplierVO -> forwarderSupplierVO.getGroupName().equals(group))
                            .collect(Collectors.toList())
                    );
        }
        return forwarderSupplierGroupVOList;

    }
}
