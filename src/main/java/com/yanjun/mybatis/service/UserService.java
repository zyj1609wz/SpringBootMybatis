package com.yanjun.mybatis.service;

import com.yanjun.mybatis.bean.User;
import com.yanjun.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> get(String name) {
        return userMapper.findByName(name);
    }

    public int insert(String name, Integer age) {
        return userMapper.insert(name, age);
    }

    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    public int update(Integer id, Integer age) {
        return userMapper.update(id, age);
    }

}
