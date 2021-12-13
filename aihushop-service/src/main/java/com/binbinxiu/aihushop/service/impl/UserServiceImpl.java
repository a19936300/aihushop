package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.User;
import com.binbinxiu.aihushop.mapper.UserMapper;
import com.binbinxiu.aihushop.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
