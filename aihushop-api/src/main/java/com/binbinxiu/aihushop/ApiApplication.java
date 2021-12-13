package com.binbinxiu.aihushop;

import com.binbinxiu.aihushop.entity.User;
import com.binbinxiu.aihushop.service.IUserService;
import lombok.extern.java.Log;
import lombok.extern.jbosslog.JBossLog;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * aihushop  api启动类
 *
 * @author binbin
 * @date 2021/12/7 19:34
 */
@SpringBootApplication
@Slf4j
@RestController
@MapperScan(basePackages = {"com.binbinxiu.aihushop.mapper"})
public class ApiApplication {

    @Autowired
    private IUserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }


    @GetMapping
    public void get(){
        log.info("hahah");
        log.error("heihei");
        for (User user : userService.list()) {
            log.error("user: {}",user);
        }
    }


}
