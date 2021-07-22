package com.hc.summer.pojo.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * 用户登录请求参数
 *
 * @author wendiyou
 * @date 2021-06-03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("登录参数")
public class LoginParam {

    @ApiModelProperty(name = "phone" , value = "登录账号",example = "18330236337")
    @NotEmpty
    private  String phone;

    @ApiModelProperty(name = "password" ,value = "密码",example = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92")
    @NotEmpty
    private String password;
}
