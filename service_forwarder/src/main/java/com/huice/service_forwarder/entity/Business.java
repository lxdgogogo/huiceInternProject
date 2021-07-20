package com.huice.service_forwarder.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 代拿市场档口商户信息表(BaseBusinessInfo)实体类
 *
 * @author makejava
 * @since 2021-07-20 10:42:39
 */
public class Business implements Serializable {
    private static final long serialVersionUID = 361007910402719146L;
    /**
     * 主键|曹瑞琪|2021年6月3日18:46:46
     */
    private Long id;
    /**
     * 城市编码|2021年6月3日18:50:053|曹瑞琪
     */
    private Long cityCode;
    /**
     * 城市名称|2021年6月3日18:50:053|曹瑞琪
     */
    private String cityName;
    /**
     * 市场编码|2021年6月3日18:50:053|曹瑞琪
     */
    private Long marketCode;
    /**
     * 市场名称|2021年6月3日18:50:053|曹瑞琪
     */
    private String marketName;
    /**
     * 楼层编码|2021年6月3日18:50:053|曹瑞琪
     */
    private Long floorCode;
    /**
     * 楼层名称|2021年6月3日18:50:053|曹瑞琪
     */
    private String floorName;
    /**
     * 档口编码|2021年6月3日18:50:053|曹瑞琪
     */
    private Long businessCode;
    /**
     * 档口名称|2021年6月3日18:50:053|曹瑞琪
     */
    private String businessName;
    /**
     * 档口全称|2021年6月3日18:50:053|曹瑞琪
     */
    private String businessTotalName;
    /**
     * 删除标记
     */
    private Object deleteFlag;
    /**
     * 经度|2021年6月3日18:50:053|曹瑞琪
     */
    private String xCoordinate;
    /**
     * 纬度|2021年6月3日18:50:053|曹瑞琪
     */
    private String yCoordinate;
    /**
     * 商户类型|曹瑞琪|2021年6月11日16:20:33|@0 真实商户 1虚拟商户
     */
    private Object type;

    private Date created;

    private Date modified;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityCode() {
        return cityCode;
    }

    public void setCityCode(Long cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Long getMarketCode() {
        return marketCode;
    }

    public void setMarketCode(Long marketCode) {
        this.marketCode = marketCode;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Long getFloorCode() {
        return floorCode;
    }

    public void setFloorCode(Long floorCode) {
        this.floorCode = floorCode;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public Long getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(Long businessCode) {
        this.businessCode = businessCode;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessTotalName() {
        return businessTotalName;
    }

    public void setBusinessTotalName(String businessTotalName) {
        this.businessTotalName = businessTotalName;
    }

    public Object getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Object deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(String xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public String getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(String yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

}
