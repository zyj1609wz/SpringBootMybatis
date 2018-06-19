package com.yanjun.mybatis.controller;

import com.yanjun.mybatis.bean.User;
import com.yanjun.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("get/{name}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.get(id);
    }

    @GetMapping("findAll")
    public List<User> getUser() {
        return userService.findAll();
    }
}
