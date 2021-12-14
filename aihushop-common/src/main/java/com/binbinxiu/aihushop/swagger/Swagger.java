package com.binbinxiu.aihushop.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 3.0
 *
 * @author binbin
 * @date 2021/12/13 21:44
 */
public class Swagger {
    @Bean
    public Docket docket(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .enable(true)
//                .groupName("ZRJ")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.binbinxiu.aihushop.controller"))
//                .paths(PathSelectors.ant("/controller/**"))
//                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.binbinxiu.aihushop.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    @SuppressWarnings("all")
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("天天吃货，电商平台")
                .description("这是一个吃货的家")
                .version("1.0.1")
                .license("www.imooc.com")
                .contact(new Contact("zhangfei","www.baidu.com","123@123.com"))
                .termsOfServiceUrl("ww.ww")
                .build();
    }
}
