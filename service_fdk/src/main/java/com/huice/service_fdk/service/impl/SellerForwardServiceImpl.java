package com.huice.service_fdk.service.impl;

import com.google.common.collect.Lists;
import com.huice.service_fdk.dao.ForwarderDao;
import com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier;
import com.huice.service_fdk.myjooq.db.tables.records.ForwarderSupplierRecord;
import com.huice.service_fdk.service.ISellerForwarderService;
import com.huice.service_fdk.service.model.CityModel;
import com.huice.service_fdk.service.model.FloorModel;
import com.huice.service_fdk.service.model.MarketModel;
import com.huice.service_fdk.service.vo.Floor;
import com.huice.service_fdk.service.vo.ForwarderSupplierGroupVO;
import com.huice.service_fdk.service.vo.ForwarderSupplierVO;
import com.huice.service_fdk.service.vo.Market;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SellerForwardServiceImpl implements ISellerForwarderService {

    @Autowired
    private ForwarderDao forwarderDao;

    @Override
    public List<CityModel> selectCityInfo() {
        List<ForwarderSupplierVO> forwarderSupplierVOs = forwarderDao.getCityModelTree();
        HashMap<Long, List<ForwarderSupplierVO>> mapCity = new HashMap<>();

        for (ForwarderSupplierVO vo : forwarderSupplierVOs){
            List<ForwarderSupplierVO> list = mapCity.getOrDefault(vo.getCityCode(), new ArrayList<>());
            list.add(vo);
            mapCity.put(vo.getCityCode(), list);
        }
        List<CityModel> cityModels = new ArrayList<>();
        for (Map.Entry<Long, List<ForwarderSupplierVO>> entry : mapCity.entrySet()){
            HashMap<Long, List<ForwarderSupplierVO>> mapMarket = new HashMap<>();
            List<ForwarderSupplierVO> subForwarderSupplierVOs =  entry.getValue();
            for (ForwarderSupplierVO vo : subForwarderSupplierVOs){
                List<ForwarderSupplierVO> list = mapCity.getOrDefault(vo.getMarketCode(), new ArrayList<>());
                list.add(vo);
                mapMarket.put(vo.getMarketCode(), list);
            }
            List<Market> marketList = new ArrayList<>();
            for (Map.Entry<Long, List<ForwarderSupplierVO>> entry1 : mapMarket.entrySet()){
                List<Floor> floors = new ArrayList<>();
                for (ForwarderSupplierVO forwarderSupplierVO : entry1.getValue()){
                    Floor floor = new Floor();
                    floor.setMarketCode(forwarderSupplierVO.getMarketCode());
                    floor.setFloorName(forwarderSupplierVO.getFloor());
                    floor.setFloorCode(forwarderSupplierVO.getFloorCode());
                    floors.add(floor);
                }
                ForwarderSupplierVO temp = entry1.getValue().get(0);
                Market market = new Market(temp.getMarketCode(), temp.getMarketCode(), temp.getMarket());
                market.setFloorList(floors);
                marketList.add(market);
            }
            ForwarderSupplierVO temp = entry.getValue().get(0);
            CityModel cityModel = new CityModel(temp.getCityCode(), temp.getCityCode(), temp.getCity(), marketList);
            cityModels.add(cityModel);
        }

        return cityModels;
    }
}
