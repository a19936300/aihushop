package com.binbinxiu.aihushop;

import lombok.extern.java.Log;
import lombok.extern.jbosslog.JBossLog;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
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
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }

    @GetMapping
    public void get(){
        log.info("这是 info 日志");
        log.error("这是 error 日志");
        log.debug("这是 debug 日志");
        log.warn("这是 warn 日志");
        log.trace("这是 啥 日志");
    }
}
