package com.binbinxiu.aihushop.redisson.less01;

import com.binbinxiu.aihushop.service.test.TestTransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.transaction.TestTransaction;

/**
 * 事务的传播
 */
@SpringBootTest
public class TransactionTest {

    @Autowired
    private TestTransactionService testTransactionService;


    /**
     * REQUIRED: 如果没有事务就新建事务，如果有就加入
     * SUPPORTS： 如果有事务就加入，如果没有就没有
     * MANDATORY：必须有个事务，没有就报异常
     * REQUIRES_NEW：如果有事务，挂起新创建一个事务，如果没有事务，则同REQUIRED
     * NOT_SUPPORTED：如果有事务，挂起不用事务执行
     * NEVER：如果有事务就抛异常
     * NESTED：如果当前有事务，则开启子事务
     *         如果当前没有事务，则同 REQUIRED
     *         但是如果主事务提交，则会携带子事务一起提交
     *         如果主事务回滚，则子事务会一起回滚，相反子事务异常，则父事务可以回滚或不回滚
     */
    @Test
    public void myTest(){
        testTransactionService.testPropagationTrans();
    }
}
