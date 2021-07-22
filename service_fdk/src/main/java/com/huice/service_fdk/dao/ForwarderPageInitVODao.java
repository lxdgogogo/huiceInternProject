package com.huice.service_fdk.dao;

import com.huice.service_fdk.service.vo.*;
import org.springframework.stereotype.Repository;

import java.util.*;

import static com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier.FORWARDER_SUPPLIER;


@Repository
public class ForwarderPageInitVODao extends BaseDao{
    public ForwarderPageInitVO getForwarderPageInitVO(long id){
        ForwarderPageInitVO forwarderPageInitVO = new ForwarderPageInitVO();
        List<Long> cityCodeList = db.selectDistinct(FORWARDER_SUPPLIER.CITY_CODE)
                .from(FORWARDER_SUPPLIER)
                .where(FORWARDER_SUPPLIER.MERCHANT_ID.equal(id))
                .fetchInto(Long.class);

        List<ForwarderPageInit> forwarderPageInitVOList = db.select(
                FORWARDER_SUPPLIER.CITY_CODE,
                FORWARDER_SUPPLIER.CITY.as("cityName"),
                FORWARDER_SUPPLIER.MARKET_CODE,
                FORWARDER_SUPPLIER.MARKET.as("marketName"),
                FORWARDER_SUPPLIER.FLOOR_CODE,
                FORWARDER_SUPPLIER.FLOOR.as("floorName")
        )
                .from(FORWARDER_SUPPLIER)
                .where(FORWARDER_SUPPLIER.MERCHANT_ID.equal(id))
                .fetchInto(ForwarderPageInit.class);

        Map<Long, List<Market>> marketCodeSet = new HashMap<>();
        for(long cityCode:cityCodeList){
            City city = new City(cityCode);
            marketCodeSet.put(cityCode, new ArrayList<>());
            forwarderPageInitVO.getCityTree().add(city);
            for(ForwarderPageInit forwarderPageInit:forwarderPageInitVOList){
                Market market;
                if(forwarderPageInit.getCityCode()==cityCode){
                    city.setCityName(forwarderPageInit.getCityName());
                    if(marketCodeSet.get(cityCode).stream()
                            .noneMatch(f-> f.getMarketCode().equals(forwarderPageInit.getMarketCode()))){
                        //如果城市中没有这个market，则创建一个market
                        market = new Market(forwarderPageInit.getCityCode(),
                                forwarderPageInit.getMarketCode(),
                                forwarderPageInit.getMarketName());
                        city.getMarketList().add(market);
                        marketCodeSet.get(cityCode).add(market);
                    }
                    else{
                        //如果城市中有这个market，则找到这个market，并将该market加入城市
                        Optional<Market> optionalMarket = marketCodeSet.get(cityCode).stream()
                                .filter(f-> f.getMarketCode().equals(forwarderPageInit.getMarketCode()))
                                .findAny();
                        assert optionalMarket.isPresent();
                        market = optionalMarket.get();
                    }
                    //如果该market没有这个楼层
                    if(market.getFloorList().stream().noneMatch(f->f.getFloorCode()==forwarderPageInit.getFloorCode())){
                        Floor floor = new Floor(forwarderPageInit.getFloorCode(),
                                forwarderPageInit.getFloorName(),
                                forwarderPageInit.getMarketCode());
                        market.getFloorList().add(floor);
                    }
                }
            }
        }
        return forwarderPageInitVO;
    }
}
