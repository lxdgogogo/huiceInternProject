package com.hc.summer.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户信息表(SysUser)实体类
 *
 * @author caoruiqi
 * @since 2020-11-12 10:58:35
 */
@Data
public class SysUserDO implements Serializable {
    private static final long serialVersionUID = 941993400828504951L;
    /**
    * 主键| 曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "id", value="用户id", required = true, dataType = "Long")
    private Long id;

    @ApiModelProperty(name = "merchantId", value="商户号", required = true, dataType = "Long")
    private Long merchantId;
    /**
    * 发发号|曹瑞琪|2020年11月2日11:34:52
    */

    @ApiModelProperty(name = "ffNumber", value="用户发发号", required = false, dataType = "Long")
    private Integer ffNumber;
    /**
    * 手机号|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "phone", value="手机号", required = true, dataType = "string")
    private String phone;

    /**
     * 省|曹瑞琪|2020年11月2日11:34:52
     */
    @ApiModelProperty(name = "province", value="省", required = false, dataType = "int")
    private Integer province;
    /**
     * 市|曹瑞琪|2020年11月2日11:34:52
     */
    @ApiModelProperty(name = "city", value="市", required = false, dataType = "int")
    private Integer city;
    /**
     * 区县|曹瑞琪|2020年11月2日11:34:52
     */
    @ApiModelProperty(name = "district", value="区县", required = false, dataType = "int")
    private Integer district;
    @ApiModelProperty(name = "area", value="省市区名称", required = false, dataType = "string")
    private String area;
    /**
    * 地址|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "address", value="地址", required = false, dataType = "string")
    private String address;
    /**
    * 密码|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "password", value="用户密码", required = true, dataType = "string")
    private String password;
    /**
    * 头像|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "avatar", value="头像", required = false, dataType = "string")
    private String avatar;
    /**
    * 用户名 未来使用登录|crq|2020年11月7日
    */
    @ApiModelProperty(name = "userName", value="用户名", required = false, dataType = "string")
    private String userName;
    /**
    * 昵称|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "nickName", value="昵称", required = false, dataType = "string")
    private String nickName;
    /**
    * 店铺/公司名称|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "shopName", value="店铺", required = false, dataType = "string")
    private String shopName;
    /**
    * 联系人|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "contacts", value="联系人", required = false, dataType = "string")
    private String contacts;
    /**
     * 是否关闭状态|@1 关闭 @0 开启 |曹瑞琪|2020年11月2日11:34:52
     */
    @ApiModelProperty(name = "disabled", value = "是否关闭状态", required = false, dataType = "byte")
    private Byte disabled;
    /**
     * 用户类型 1 销售商 2  供应商 3 员工|曹瑞琪|2020年11月2日11:34:52
     */
    @ApiModelProperty(name = "userType", value = "用户类型 1 销售商 2  供应商 3 员工", required = false, dataType = "byte")
    private Byte userType;
    @ApiModelProperty(name = "fenxiaoModelType", value = "分销类型【自销：SELF_SALE；分销：FENXIAO_SALE】",
                      required = false, dataType = "String")
    private String fenxiaoModelType;
    /**
     * 员工的父级用户id,供应商级别 此字段 为null|曹瑞琪|2020年11月2日11:34:52
     */
    @ApiModelProperty(name = "pid", value = "父级id", required = false, dataType = "Long")
    private Long pid;
    /**
     * 最后一次修改密码时间|曹瑞琪|2020年11月2日11:34:52
     */
    @ApiModelProperty(name = "lastChgpwdTime", value = "最后一次修改密码时间", required = false, dataType = "date")
    private LocalDateTime lastChgpwdTime;
    /**
    * 最后一次登录时间|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "lastLoginTime", value=" 最后一次登录时间", required = false, dataType = "date")
    private LocalDateTime lastLoginTime;
    /**
    * 最后一次登录ip|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "lastLoginIp", value=" 最后一次登录ip|", required = false, dataType = "string")
    private String lastLoginIp;
    /**
    * 创建时间|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "createTime", value="创建时间 ", required = false, dataType = "date")
    private LocalDateTime createTime;
    /**
    * 修改时间|曹瑞琪|2020年11月2日11:34:52
    */
    @ApiModelProperty(name = "editTime", value=" 修改时间", required = false, dataType = "date")
    private LocalDateTime editTime;
    /**
    * 是否为付费用户| 0 否 1是|曹瑞琪|2020年11月12日
     */
    @ApiModelProperty(name = "rechargeFlag", value = " 是否为付费用户| 0 否 1是", required = false, dataType = "int")
    private Integer rechargeFlag;

    /**
     * 密码盐|曹瑞琪|2020年11月12日
     */
    @ApiModelProperty(name = "salt", value = "密码盐", required = false, dataType = "string")
    private String salt;

    @ApiModelProperty(name = "nickNo", value = "分销中间件ID", dataType = "String")
    private String nickNo;

    @ApiModelProperty(name = "fenxiao_model", value = "分销中间件ID", dataType = "String")
    private String fenxiaoModel;

    @ApiModelProperty(name = "forwarderId", value = "代拿系统ID", dataType = "Long")
    private Long forwarderId;

}