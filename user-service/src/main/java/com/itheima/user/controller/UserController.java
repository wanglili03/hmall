package com.itheima.user.controller;

import com.itheima.user.pojo.User;
import com.itheima.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        User user = userService.findUserById(id);
        return user;
    }

}
