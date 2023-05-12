package com.itheima.user.service.impl;

import com.itheima.user.mapper.UserMapper;
import com.itheima.user.pojo.User;
import com.itheima.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserById(Long id) {
       return userMapper.findUserById(id);
    }
}
