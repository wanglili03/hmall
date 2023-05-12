package com.itheima.order.mapper;

import com.itheima.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Mapper
public interface OrderMapper {
    @Select("select * from tb_order where id=#{id}")
    Order findOrderById(Long id);
}
