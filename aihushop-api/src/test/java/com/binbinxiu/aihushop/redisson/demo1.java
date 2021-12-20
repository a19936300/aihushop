package com.binbinxiu.aihushop.redisson;

import org.junit.jupiter.api.Test;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * TODO
 *
 * @author binbin
 * @date 2021/12/20 18:33
 */
public class demo1 {

    public static RedissonClient get(){
        // 1. Create config object
        Config config = new Config();
        config.useSingleServer()
                // use "rediss://" for SSL connection
                .setAddress("redis://192.168.31.60:6379");
        // 2. Create Redisson instance

        // Sync and Async API
        RedissonClient redisson = Redisson.create(config);
        return redisson;
    }



    public static void main(String[] args) {
        RedissonClient redissonClient = get();
        Thread one = new Thread(new oneThread(redissonClient));
        Thread two = new Thread(new oneThread(redissonClient));
        Thread three = new Thread(new oneThread(redissonClient));
        Thread four = new Thread(new oneThread(redissonClient));
        one.start();
        two.start();
        three.start();
        four.start();

    }

}
