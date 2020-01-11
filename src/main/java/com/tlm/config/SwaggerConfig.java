package com.tlm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: lijinyu@sensorsdata.cn
 * @date: 2020/1/11 6:49 下午
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .pathMapping("/")
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.tlm.controller"))
        .paths(PathSelectors.any())
        .build().apiInfo(new ApiInfoBuilder()
            .title("SpringBoot整合Swagger")
            .description("SpringBoot整合Swagger，详细信息......")
            .version("9.0")
            .license("The Apache License")
            .licenseUrl("http://www.baidu.com")
            .build());
  }
}

