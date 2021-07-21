package com.huice.service_fdk.service.impl;

import com.huice.service_fdk.dao.ForwarderDao;
import com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier;
import com.huice.service_fdk.myjooq.db.tables.records.ForwarderSupplierRecord;
import com.huice.service_fdk.service.ISellerForwarderService;
import com.huice.service_fdk.service.model.CityModel;
import com.huice.service_fdk.service.model.FloorModel;
import com.huice.service_fdk.service.model.MarketModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerForwardServiceImpl implements ISellerForwarderService {

    @Autowired
    private ForwarderDao forwarderDao;

    @Override
    public List<CityModel> selectCityInfo() {
        List<ForwarderSupplierRecord> forwarderSupplierRecords =  forwarderDao.getCityModelTree();
        List<Long> cityCodeList = new ArrayList<>();
        List<Long> MarketCodeList = new ArrayList<>(); // 不同城市的MarketCode是否会产生相同
        List<CityModel> cityModels = new ArrayList<>();
        for (ForwarderSupplierRecord forwarderSupplierRecord : forwarderSupplierRecords){
            if (!cityCodeList.contains(forwarderSupplierRecord.getCityCode())){
                // 树顶City
                CityModel cityModel = new CityModel();
                cityModel.setCityCode(forwarderSupplierRecord.getCityCode());
                // cityID是什么，在哪一张表
                cityModel.setCityId(forwarderSupplierRecord.getId());
                cityModel.setCityName(forwarderSupplierRecord.getCity());
//                cityModel.setMarketList(new ArrayList<>());

                // 树中层Markrt
                MarketModel marketModel = new MarketModel();
                marketModel.setCityCode(forwarderSupplierRecord.getCityCode());
                // MarketId是否是供货商ID
                marketModel.setMarketId(forwarderSupplierRecord.getForwarderSupplierId());
                marketModel.setMarketName(forwarderSupplierRecord.getMarket());
                marketModel.setMarkerCode(forwarderSupplierRecord.getMarketCode());
//                marketModel.setFloorList(new ArrayList<FloorModel>());

                // 树底层Floor
                FloorModel floorModel = new FloorModel();
                floorModel.setFloorCode(forwarderSupplierRecord.getFloorCode());
                floorModel.setFloorName(forwarderSupplierRecord.getFloor());
                floorModel.setMarketCode(forwarderSupplierRecord.getMarketCode());

                List<FloorModel> floorModels = new ArrayList<>();
                floorModels.add(floorModel);
                marketModel.setFloorList(floorModels);

                List<MarketModel> marketModels = new ArrayList<>();
                marketModels.add(marketModel);
                cityModel.setMarketList(marketModels);
                cityModels.add(cityModel);

                cityCodeList.add(forwarderSupplierRecord.getCityCode());

            }

        }
        return cityModels;
    }
}
