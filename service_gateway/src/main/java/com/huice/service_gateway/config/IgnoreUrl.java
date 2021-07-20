package com.huice.service_gateway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName  不经过token检验的url地址 从配置文件中获取
 * @Description
 * @Author caoruiqi
 * @Date 2020/11/5 17:14
 */
@Component
@Data
@ConfigurationProperties(prefix = "ignore-url")
public class IgnoreUrl {

    private List<Permission> list;

    @Data
    public static  class Permission {
        private String path;
    }
}
