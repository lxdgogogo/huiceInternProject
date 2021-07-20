package com.huice.service_dyna.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 代拿市场档口商户信息表(BaseBusinessInfo)实体类
 *
 * @author makejava
 * @since 2021-07-20 00:33:20
 */

@Data
public class BaseBusinessInfo implements Serializable {
    private static final long serialVersionUID = -17766727692555116L;
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
}
