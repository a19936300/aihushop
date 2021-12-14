package com.binbinxiu.aihushop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品分类 
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名称
     */
    @TableField("name")
    private String name;

    /**
     * 分类类型
     */
    @TableField("type")
    private Integer type;

    /**
     * 父id
     */
    @TableField("father_id")
    private Integer fatherId;

    /**
     * 图标
     */
    @TableField("logo")
    private String logo;

    /**
     * 口号
     */
    @TableField("slogan")
    private String slogan;

    /**
     * 分类图
     */
    @TableField("cat_image")
    private String catImage;

    /**
     * 背景颜色
     */
    @TableField("bg_color")
    private String bgColor;


}
