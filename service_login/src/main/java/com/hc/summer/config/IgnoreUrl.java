package com.hc.summer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 白名单
 *
 * @author wendiyou
 * @date 2021-06-03
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
