package com.yanjun.mybatis.controller;

import com.github.pagehelper.PageInfo;
import com.yanjun.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("findAll")
    public PageInfo getUser(int pageNum, int pageSize) {
        return userService.findAll(pageNum,pageSize);
    }
}
