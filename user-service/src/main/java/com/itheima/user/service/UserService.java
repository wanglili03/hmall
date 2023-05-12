package com.itheima.user.service;

import com.itheima.user.pojo.User;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
public interface UserService {
    User findUserById(Long id);
}
