package com.binbinxiu.aihushop.redisson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;

import java.util.concurrent.TimeUnit;


/**
 * TODO
 *
 * @author binbin
 * @date 2021/12/20 19:21
 */
public class oneThread implements Runnable{

    private RedissonClient redissonClient;

    public oneThread(RedissonClient redissonClient) {
        this.redissonClient = redissonClient;
    }

    private Logger logger = LogManager.getLogger(getClass());

    @Override
    public void run() {

        RLock lock = redissonClient.getLock("lock");
        logger.error("thread----{}, lock:{}",Thread.currentThread().getId(),lock);
            if(lock.tryLock()){
                try{
                    logger.error("trylock thread ----{},lock:{}",Thread.currentThread().getId(),lock);
                    logger.error("aaaaaaaaaaaaaa");
                }finally {
                    lock.unlock();
                }
            }else{
                logger.error("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
            }
    }
}
