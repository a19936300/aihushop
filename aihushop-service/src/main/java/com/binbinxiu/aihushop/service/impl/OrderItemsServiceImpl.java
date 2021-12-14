package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.OrderItems;
import com.binbinxiu.aihushop.mapper.OrderItemsMapper;
import com.binbinxiu.aihushop.service.IOrderItemsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单商品关联表  服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems> implements IOrderItemsService {

}
