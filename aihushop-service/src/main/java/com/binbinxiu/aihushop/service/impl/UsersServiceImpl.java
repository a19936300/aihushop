package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.Users;
import com.binbinxiu.aihushop.mapper.UsersMapper;
import com.binbinxiu.aihushop.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
