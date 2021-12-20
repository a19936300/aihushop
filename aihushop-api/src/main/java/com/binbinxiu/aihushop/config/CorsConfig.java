package com.binbinxiu.aihushop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 跨域
 *
 * @author binbin
 * @date 2021/12/14 21:24
 */
@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOriginPattern("*");
        //1.设置是否发送cookie信息
        config.setAllowCredentials(true);
        //2.设置允许请求的方式
        config.addAllowedMethod("*");
        //3.设置允许header
        config.addAllowedHeader("*");
        //4.为url添加映射的路径
        UrlBasedCorsConfigurationSource source =new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",config);
        //5.返回重新定义好的corsource
        return new CorsFilter(source);
    }
}
