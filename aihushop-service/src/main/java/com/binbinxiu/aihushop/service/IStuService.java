package com.binbinxiu.aihushop.service;

import com.binbinxiu.aihushop.entity.Stu;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
public interface IStuService extends IService<Stu> {

    void saveParent();

    @Transactional(propagation = Propagation.REQUIRED)
    void saveChildren();
}
