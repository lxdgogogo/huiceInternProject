package com.huice.service_forwarder.service;

import com.huice.service_forwarder.controller.vo.CityTree;
import com.huice.service_forwarder.controller.vo.Floor;
import com.huice.service_forwarder.controller.vo.Market;
import com.huice.service_forwarder.dao.BusinessDao;
import com.huice.service_forwarder.entity.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author SoonMachine
 * @description 对应需求1
 */
@Service
public class BusinessService {

    @Autowired
    private BusinessDao businessDao;

    public List<CityTree> queryAllBusiness(){
        List<CityTree> res = new ArrayList<>();
        List<Business> list = this.businessDao.queryAll();
        Map<Long,CityTree> cityTreeMap = new HashMap<>();
        Map<Long,Market> marketMap = new HashMap<>();
        for (Business b :
                list) {
            Long cityCode = b.getCityCode();
            if (!cityTreeMap.containsKey(cityCode)) {
                String cityName = b.getCityName();
                CityTree cityTree = new CityTree();
                cityTree.setCityCode(cityCode);
                cityTree.setCityId(0L);
                cityTree.setMarketList(new ArrayList<>());
                cityTree.setCityName(cityName);
                cityTreeMap.put(cityCode,cityTree);
            }
        }

        for (Business b :
                list) {
            Long cityCode = b.getCityCode();
            Long marketCode = b.getMarketCode();
            if (!marketMap.containsKey(marketCode)){
                String marketName = b.getMarketName();
                Market market = new Market();
                market.setCityCode(cityCode);
                market.setMarketId(0L);
                market.setMarketName(marketName);
                market.setMarketCode(marketCode);
                market.setFloorList(new ArrayList<>());
                marketMap.put(marketCode,market);
            }
        }

        for (Business b :
        list){
            Long floorCode = b.getFloorCode();
            String floorName = b.getFloorName();
            Long marketCode = b.getMarketCode();
            Floor floor = new Floor();
            floor.setFloorName(floorName);
            floor.setFloorCode(floorCode);
            floor.setMarketCode(marketCode);
            marketMap.get(marketCode).getFloorList().add(floor);
        }

        for (Long marketCode : marketMap.keySet()){
            Market market = marketMap.get(marketCode);
            Long cityCode = market.getCityCode();
            cityTreeMap.get(cityCode).getMarketList().add(market);
        }

        for (Long cityCode : cityTreeMap.keySet()){
            CityTree cityTree = cityTreeMap.get(cityCode);
            res.add(cityTree);
        }
        return res;
    }
}
