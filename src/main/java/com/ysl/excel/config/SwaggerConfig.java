package com.ysl.excel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("默认模块")
                .globalOperationParameters(Collections.emptyList()).apiInfo(getApiInfo())
                .enable(true).select()
                .apis(RequestHandlerSelectors.basePackage("com.ysl.excel.controller")).build();
    }

    private ApiInfo getApiInfo() {
        String title = "Excel导入导出示例（基于 ExcelUtils 2.0 版本）";
        String description = "Excel导入导出示例";
        String version = "v2.0";
        Contact contact = new Contact("", "", "");
        String license = "ExcelUtils 2.0 版本";
        String licenseUrl = "";
        ApiInfo apiInfo = new ApiInfo(title, description, version, "", contact, license, licenseUrl,
                Collections.emptyList());
        return apiInfo;
    }

}

