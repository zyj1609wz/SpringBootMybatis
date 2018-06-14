package com.yanjun.mybatis.controller;

import com.yanjun.mybatis.bean.User;
import com.yanjun.mybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
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
    public List<User> getUser(@PathVariable("name") String name) {
        return userService.get(name);
    }

    @GetMapping("insert")
    public int insert(@Param("name") String name, @Param("age") Integer age) {
        return userService.insert(name, age);
    }

    @GetMapping("delete")
    public int delete(@Param("id") Integer id) {
        return userService.delete(id);
    }

    @GetMapping("update")
    public int update(@Param("id") Integer id, @Param("age") Integer age) {
        return userService.update(id, age);
    }


}
