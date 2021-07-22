package com.hc.summer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 登录结果
 *
 * @author wendiyou
 * @date 2021-06-03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户登录结果")
@Accessors(chain = true)
public class LoginResult {

    @ApiModelProperty(name = "userId", value = "用户ID", dataType = "Long")
    private Long userId;
    @ApiModelProperty(name = "userName",value = "用户名",dataType = "String")
    private String userName;
    @ApiModelProperty(name = "phone",value = "手机号",dataType = "String")
    private String userPhone;
    @ApiModelProperty(name = "roleType",value = "角色类型",dataType = "Byte")
    private Byte roleType;
    @ApiModelProperty(name = "token",value = "token",dataType = "String")
    private String token;
}