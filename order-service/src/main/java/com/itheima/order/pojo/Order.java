package com.itheima.order.pojo;


import lombok.Data;
import feign.pojo.User;


/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    private User user;
}

