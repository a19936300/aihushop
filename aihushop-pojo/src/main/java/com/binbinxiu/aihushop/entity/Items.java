package com.binbinxiu.aihushop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("items")
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品主键id
     */
    @TableId("id")
    private String id;

    /**
     * 商品名称 商品名称
     */
    @TableField("item_name")
    private String itemName;

    /**
     * 分类外键id 分类id
     */
    @TableField("cat_id")
    private Integer catId;

    /**
     * 一级分类外键id
     */
    @TableField("root_cat_id")
    private Integer rootCatId;

    /**
     * 累计销售 累计销售
     */
    @TableField("sell_counts")
    private Integer sellCounts;

    /**
     * 上下架状态 上下架状态,1:上架 2:下架
     */
    @TableField("on_off_status")
    private Integer onOffStatus;

    /**
     * 商品内容 商品内容
     */
    @TableField("content")
    private String content;

    /**
     * 创建时间
     */
    @TableField("created_time")
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField("updated_time")
    private LocalDateTime updatedTime;


}
