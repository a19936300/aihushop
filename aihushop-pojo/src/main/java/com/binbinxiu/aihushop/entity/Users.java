package com.binbinxiu.aihushop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表 
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id 用户id
     */
    @TableId("id")
    private String id;

    /**
     * 用户名 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码 密码
     */
    @TableField("password")
    private String password;

    /**
     * 昵称 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 真实姓名
     */
    @TableField("realname")
    private String realname;

    /**
     * 头像
     */
    @TableField("face")
    private String face;

    /**
     * 手机号 手机号
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 邮箱地址 邮箱地址
     */
    @TableField("email")
    private String email;

    /**
     * 性别 性别 1:男  0:女  2:保密
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 生日 生日
     */
    @TableField("birthday")
    private LocalDate birthday;

    /**
     * 创建时间 创建时间
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间 更新时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;


}
