package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.ItemsSpec;
import com.binbinxiu.aihushop.mapper.ItemsSpecMapper;
import com.binbinxiu.aihushop.service.IItemsSpecService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Service
public class ItemsSpecServiceImpl extends ServiceImpl<ItemsSpecMapper, ItemsSpec> implements IItemsSpecService {

}
