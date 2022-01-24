package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.Stu;
import com.binbinxiu.aihushop.mapper.StuMapper;
import com.binbinxiu.aihushop.service.IStuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements IStuService {

    @Override
    public void saveParent() {
        Stu stu = new Stu();
        stu.setName("parent");
        stu.setAge(19);
        super.save(stu);
    }

    @Override

    public void saveChildren() {
        saveChildren1();
        int a = 1/0;
        saveChildren2();

    }

    private void saveChildren2() {
        Stu stu = new Stu();
        stu.setName("children2");
        stu.setAge(19);
        super.save(stu);
    }

    private void saveChildren1() {
        Stu stu = new Stu();
        stu.setName("children1");
        stu.setAge(19);
        super.save(stu);
    }


}
