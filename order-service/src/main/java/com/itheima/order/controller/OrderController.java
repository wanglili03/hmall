package com.itheima.order.controller;

import com.itheima.order.pojo.Order;
import com.itheima.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/{id}")
    public Order findByOrderId(@PathVariable Long id){

       return orderService.findOrderById(id);
    }
}
