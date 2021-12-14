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
 * 商品图片 
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("items_img")
public class ItemsImg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片主键
     */
    @TableId("id")
    private String id;

    /**
     * 商品外键id 商品外键id
     */
    @TableField("item_id")
    private String itemId;

    /**
     * 图片地址 图片地址
     */
    @TableField("url")
    private String url;

    /**
     * 顺序 图片顺序，从小到大
     */
    @TableField("sort")
    private Integer sort;

    /**
     * 是否主图 是否主图，1：是，0：否
     */
    @TableField("is_main")
    private Integer isMain;

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
