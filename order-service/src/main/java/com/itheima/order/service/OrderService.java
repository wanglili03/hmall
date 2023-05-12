package com.itheima.order.service;

import com.itheima.order.pojo.Order;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
public interface OrderService {
    Order findOrderById(Long id);
}
