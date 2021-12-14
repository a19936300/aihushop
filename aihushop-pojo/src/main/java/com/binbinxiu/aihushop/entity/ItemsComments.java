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
 * 商品评价表 
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("items_comments")
public class ItemsComments implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键
     */
    @TableId("id")
    private String id;

    /**
     * 用户id 用户名须脱敏
     */
    @TableField("user_id")
    private String userId;

    /**
     * 商品id
     */
    @TableField("item_id")
    private String itemId;

    /**
     * 商品名称
     */
    @TableField("item_name")
    private String itemName;

    /**
     * 商品规格id 可为空
     */
    @TableField("item_spec_id")
    private String itemSpecId;

    /**
     * 规格名称 可为空
     */
    @TableField("sepc_name")
    private String sepcName;

    /**
     * 评价等级 1：好评 2：中评 3：差评
     */
    @TableField("comment_level")
    private Integer commentLevel;

    /**
     * 评价内容
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
