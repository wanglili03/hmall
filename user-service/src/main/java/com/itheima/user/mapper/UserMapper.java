package com.itheima.user.mapper;

import com.itheima.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Mapper
public interface UserMapper {
    @Select("select * from tb_user where id=#{id}")
    User findUserById(Long id);
}
