package com.binbinxiu.aihushop.bo;

import lombok.Data;

/**
 * 用户登录注册Bo
 *
 * @author binbin
 * @date 2021/12/14 20:10
 */
@Data
public class UserBo {
    private String username;
    private String password;
    private String confirmPassword;
}
