package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.Orders;
import com.binbinxiu.aihushop.mapper.OrdersMapper;
import com.binbinxiu.aihushop.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表; 服务实现类
 * </p>
 *
 * @author binbin
 * @since 2021-12-14
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
