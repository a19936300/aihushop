package com.binbinxiu.aihushop.service;

import com.binbinxiu.aihushop.bo.UserBo;
import com.binbinxiu.aihushop.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表  服务类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
public interface IUsersService extends IService<Users> {

    /**
     * 查询用户名是否存在
     *
     * @param userName
     * @return boolean
     */
    public boolean queryUserNameIsExist(String userName);

    /**
     * 创建用户
     *
     * @param userBo
     * @return com.binbinxiu.aihushop.entity.Users
     */
    Users createUser(UserBo userBo);
}
