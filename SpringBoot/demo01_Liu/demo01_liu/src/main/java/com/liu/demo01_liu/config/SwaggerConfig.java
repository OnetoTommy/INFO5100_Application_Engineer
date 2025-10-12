package com.liu.demo01_liu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration  // 声明为配置类
@EnableSwagger2 // 启用 Swagger2
public class SwaggerConfig {

    /**
     * 配置 Swagger2 相关的 Bean
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())  // 接口文档信息
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example")) // 扫描的包路径
                .paths(PathSelectors.any())  // 所有路径都生成接口文档
                .build();
    }

    /**
     * 自定义 API 信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("项目 API 文档")       // 标题
                .description("这是使用 Swagger2 生成的接口文档示例") // 描述
                .version("1.0.0")           // 版本号
                .build();
    }
}