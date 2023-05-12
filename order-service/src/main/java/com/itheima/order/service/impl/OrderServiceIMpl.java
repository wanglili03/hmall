package com.itheima.order.service.impl;



import com.itheima.order.mapper.OrderMapper;
import com.itheima.order.pojo.Order;
import com.itheima.order.service.OrderService;

import feign.clients.UserClient;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import feign.pojo.User;


/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Service
public class OrderServiceIMpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserClient userClient;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Override
    public Order findOrderById(Long id) {
        Order order = orderMapper.findOrderById(id);
        User user = userClient.findById(order.getUserId());
        order.setUser(user);
        String queueName = "sim.queue";
        rabbitTemplate.convertAndSend(queueName,order.getId());
        return order;
    }
}
