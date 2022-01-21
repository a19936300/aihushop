package com.binbinxiu.aihushop.service.impl;

import com.binbinxiu.aihushop.entity.ItemsSpec;
import com.binbinxiu.aihushop.mapper.ItemsSpecMapper;
import com.binbinxiu.aihushop.service.IItemsSpecService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

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

    @Autowired
    private RedissonClient redissonClient;

    @Override
    public void decreaseItemSpecStock(String specId, int buyCounts) {
        RLock lock = redissonClient.getLock("PRODUCT_SPEC_" + specId);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    ItemsSpec itemsSpec = super.getById(specId);
                    Integer stock = itemsSpec.getStock();
                    if(stock.intValue() > buyCounts){
                        itemsSpec.setStock(stock.intValue() - buyCounts);
                        super.updateById(itemsSpec);
                    }else{
                        throw new RuntimeException("订单创建失败，原因：库存不足!");
                    }
                }finally {
                    lock.unlock();
                }
            }else{
                throw new RuntimeException("订单创建失败!");
            }
        }catch (Exception e){
            throw new RuntimeException("订单创建失败!,系统异常");
        }
    }
}
