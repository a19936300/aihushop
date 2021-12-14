package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.Items;
import com.binbinxiu.aihushop.mapper.ItemsMapper;
import com.binbinxiu.aihushop.service.IItemsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items> implements IItemsService {

}
