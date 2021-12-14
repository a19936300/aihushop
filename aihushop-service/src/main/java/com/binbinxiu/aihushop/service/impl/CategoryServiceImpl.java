package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.Category;
import com.binbinxiu.aihushop.mapper.CategoryMapper;
import com.binbinxiu.aihushop.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类  服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
