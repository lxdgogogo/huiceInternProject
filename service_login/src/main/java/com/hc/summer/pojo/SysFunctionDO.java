package com.hc.summer.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (SysFunction)实体类
 *
 * @author caoruiqi
 * @since 2021-06-07 10:39:16
 */
@Data
@ApiModel("菜单")
public class SysFunctionDO implements Serializable {
    private static final long serialVersionUID = 467631185262418109L;

    private Long id;
    /**
     * 父级ID|文弟友|2021-01-18
     */
    private Long parentId;
    /**
     * 功能地址|文弟友|2021-01-18
     */
    private String functionUrl;
    /**
     * 功能图标|文弟友|2021-01-18
     */
    private String functionIcon;
    /**
     * 功能名|文弟友|2021-01-18
     */
    private String functionName;
    /**
     * 功能层级|文弟友|2021-01-18
     */
    private Byte functionLevel;
    /**
     * 排序字段|文弟友|2021-01-18
     */
    private Byte sort;
    /**
     * 备注|文弟友|2021-01-18
     */
    private String remark;
    /**
     * 菜单类型|@0：Web端菜单；@1：App菜单|文弟友|2021-01-27
     */
    private Byte type;

    private Date created;

    private Date modified;

    /**
     * 是否被选中
     */
    private Boolean checked = true;
    /**
     * 子菜单
     */
    private List<SysFunctionDO> childrenList;


}
