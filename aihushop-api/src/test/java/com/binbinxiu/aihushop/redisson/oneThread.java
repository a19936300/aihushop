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
        try {
            boolean b = lock.tryLock(3, 1, TimeUnit.SECONDS);
            logger.info("获取分布式锁成功-----{}",lock);
            if(b){
                //执行save方法
                Thread.sleep(30);
            }
        } catch (Exception e) {
            //失败回滚
        }finally {
            logger.info("释放分布式锁成功-----{}",lock);
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
