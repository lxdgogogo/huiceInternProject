package com.huice.service_fdk.dao;

import com.huice.service_fdk.service.vo.ForwarderSupplierGroupVO;
import com.huice.service_fdk.service.vo.ForwarderSupplierVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier.FORWARDER_SUPPLIER;

@Repository
public class ForwarderSupplierGroupDao extends BaseDao{
    public List<ForwarderSupplierGroupVO> getForwarderSupplierGroupVO(long id){
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
        HashMap<String,List<ForwarderSupplierVO>> map = new HashMap<>();
        for (ForwarderSupplierVO vo : forwarderSupplierVOList) {
            List<ForwarderSupplierVO> list = map.getOrDefault(vo.getGroupName(),new ArrayList<>());
            list.add(vo);
            map.put(vo.getGroupName(),list);
        }
        for(Map.Entry<String,List<ForwarderSupplierVO>> entry:map.entrySet()){
            ForwarderSupplierGroupVO groupVO = new ForwarderSupplierGroupVO(entry.getKey(), entry.getValue());
            forwarderSupplierGroupVOList.add(groupVO);
        }
        return forwarderSupplierGroupVOList;

    }
}
