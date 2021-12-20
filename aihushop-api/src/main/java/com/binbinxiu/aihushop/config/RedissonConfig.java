package com.binbinxiu.aihushop.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Redisson config
 *
 * @author binbin
 * @date 2021/12/20 22:06
 */
@Component
public class RedissonConfig {
    @Bean
    public RedissonClient get(){
        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://192.168.31.60:6379");
        RedissonClient redisson = Redisson.create(config);
        return redisson;
    }
}
