package com.hc.summer.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
    String token ="eyJhbGciOiJIUzI1NiJ9" +
            ".eyJtZXJjaGFudElkIjoyMSwiZmZOdW1iZXIiOjI3NjQxNjEsImV4cCI6MTYwNTQwNDgxMSwidXNlcklkIjozMH0.9sDIe9g4nPGbHiXTAVrp0kTe1zI27v_xWRmFiK3bO5c";

    @Bean
    public Docket createRestApi() {

        //添加head参数start
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("token").defaultValue(token).description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        //添加head参数end

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).globalOperationParameters(pars)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("summer API Doc")
                .description("This is a restful api document of summer.")
                .version("1.0")
                .build();
    }
}

