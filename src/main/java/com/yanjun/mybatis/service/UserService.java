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

    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findAll() {
        List<User> userList = userMapper.selectAll();
        return userList;
    }

}
