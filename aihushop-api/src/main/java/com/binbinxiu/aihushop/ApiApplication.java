package com.binbinxiu.aihushop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * aihushop  api启动类
 *
 * @author binbin
 * @date 2021/12/7 19:34
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.binbinxiu.aihushop.mapper"})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }


}
