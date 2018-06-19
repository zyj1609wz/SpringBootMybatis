package com.yanjun.mybatis.controller;

import com.yanjun.mybatis.bean.User;
import com.yanjun.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("get/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.get(id);
    }

    @GetMapping("findAll")
    public List<User> getUser() {
        return userService.findAll();
    }

    @PostMapping("insert")
    public int insert(@RequestBody User user) {
        return userService.insert(user);
    }

}
