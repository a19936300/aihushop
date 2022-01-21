package com.binbinxiu.aihushop.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.binbinxiu.aihushop.bo.UserBo;
import com.binbinxiu.aihushop.entity.Users;
import com.binbinxiu.aihushop.mapper.UsersMapper;
import com.binbinxiu.aihushop.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
    private final String face = "";

    @Override
    public boolean queryUserNameIsExist(String userName) {
        Users users = super.getOne(Wrappers.<Users>lambdaQuery().eq(Users::getUsername, userName));
        return ObjectUtil.isNotEmpty(users);
    }

    @Override
    public Users createUser(UserBo userBo) {
        Users users = new Users();
        users.setUsername(userBo.getUsername());
        users.setPassword(SecureUtil.md5(userBo.getPassword()));
        users.setFace(face);
        users.setId(IdUtil.objectId());
        users.setCreatedTime(LocalDateTime.now());
        users.setUpdatedTime(LocalDateTime.now());
        super.save(users);
        return users;
    }
}
