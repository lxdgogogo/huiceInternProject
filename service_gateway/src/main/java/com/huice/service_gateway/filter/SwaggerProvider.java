package com.huice.service_gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.support.NameUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author caoruiqi
 * @创建时间 2020/10/20
 * @描述
 */
@Component
@Primary
@Slf4j
public class SwaggerProvider implements SwaggerResourcesProvider {

    @Resource
    private RouteLocator routeLocator;

    @Autowired
    private GatewayProperties gatewayProperties;

    /**
     * swagger2默认的url后缀
     */
    public static final String SWAGGER2URL = "/v2/api-docs";

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        List<String> routes = new ArrayList<>();
        routeLocator.getRoutes().subscribe(route -> routes.add(route.getId()));
        gatewayProperties.getRoutes().stream().filter(routeDefinition -> routes.contains(routeDefinition.getId())).forEach(
                route -> {
                    route.getPredicates().stream()
                    .filter(predicateDefinition -> ("Path").equalsIgnoreCase(predicateDefinition.getName()))
                    .forEach(predicateDefinition -> resources.add(
                            swaggerResource(route.getId(),predicateDefinition.getArgs().get(
                                                                                          NameUtils.GENERATED_NAME_PREFIX + "0")
                                                                                          .replace("**", SWAGGER2URL))));
        });

        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        log.info("name:{},location:{}",name,location);
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }

}
