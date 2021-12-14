package com.binbinxiu.aihushop.controller;


import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.binbinxiu.aihushop.bo.UserBo;
import com.binbinxiu.aihushop.entity.Users;
import com.binbinxiu.aihushop.service.IUsersService;
import com.binbinxiu.aihushop.utils.CookieUtils;
import com.binbinxiu.aihushop.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * <p>
 * 用户表  前端控制器
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@RestController
@RequestMapping("/passport")
@Api("用户表  前端控制器")
@Slf4j
public class UsersController {

    @Autowired
    private IUsersService usersService;

    @ApiOperation("验证用户名是否存在")
    @GetMapping("/usernameIsExist")
    public R check(String username){
        //1.检查用户名
        if(StrUtil.isBlank(username)){
            return R.errorMsg("用户名不能为空");
        }
        boolean isExist = usersService.queryUserNameIsExist(username);
        if(isExist){
            return R.errorMsg("用户名已存在");
        }
        return R.ok();
    }

    @ApiOperation("注册")
    @PostMapping("/regist")
    public R regist(HttpServletRequest request, HttpServletResponse response, @RequestBody UserBo userBo){
        if(StrUtil.isBlank(userBo.getUsername()) ||
            StrUtil.isBlank(userBo.getPassword()) ||
                StrUtil.isBlank(userBo.getConfirmPassword())){
            return R.errorMsg("用户名或者密码不能为空");
        }

        boolean isExist = usersService.queryUserNameIsExist(userBo.getUsername());
        if(isExist){
            return R.errorMsg("用户名已存在");
        }

        Users users =  usersService.createUser(userBo);
        CookieUtils.setCookie(request,response,"user", JSONUtil.toJsonStr(users),true);
        return R.ok();
    }

    @ApiOperation("登录")
    @PostMapping("/login")
    public R login(HttpServletRequest request,
                   HttpServletResponse response,
                   @RequestBody UserBo user){
        if(StrUtil.isBlank(user.getUsername()) ||
            StrUtil.isBlank(user.getPassword())){
            return R.errorMsg("用户名或密码不能为空");
        }

        Users users = usersService.getOne(Wrappers.<Users>lambdaQuery()
                .eq(Users::getUsername, user.getUsername())
                .eq(Users::getPassword, SecureUtil.md5(user.getPassword())));
        if(ObjectUtil.isEmpty(users)){
            return R.errorMsg("用户名或密码错误");
        }
        CookieUtils.setCookie(request,response,"user", JSONUtil.toJsonStr(users),true);
        return R.ok();
    }

    @ApiOperation("登出")
    @PostMapping("/logout")
    public R logout(HttpServletRequest request, HttpServletResponse response,@RequestParam String userId){
        //1.清除用户cookie
        CookieUtils.deleteCookie(request, response, "user");
        //TODO 用户退出登录，需要清空购物车
        //TODO 分布式会话需要清除用户数据
        return R.ok();
    }

}
