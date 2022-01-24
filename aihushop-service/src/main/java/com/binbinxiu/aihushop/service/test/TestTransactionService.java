package com.binbinxiu.aihushop.service.test;

import com.binbinxiu.aihushop.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestTransactionService   {

    @Autowired
    private IStuService stuService;

    /**
     * 一、默认没有事务时，异常前都正常落库，异常之后没有落库
     * 二、testPropagationTrans加上事务，该方法某个方法报异常，所有的都会回滚
     * 三、testPropagationTrans下的某个方法上有事务，在这个方法之前执行成功的方法不会回滚（注解加在接口上同样生效）
     *
     */
    //@Transactional(propagation = Propagation.REQUIRED)
    public void testPropagationTrans(){
        stuService.saveParent();
        stuService.saveChildren();
    }
}
