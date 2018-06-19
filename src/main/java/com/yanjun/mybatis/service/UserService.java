package com.yanjun.mybatis.service;

import com.yanjun.mybatis.bean.User;
import com.yanjun.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<User> getInIds(List<Integer> ids) {
        List<User> userList = new ArrayList<>();
        return userList;
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int insert(List<User> list) {
        return userMapper.insertList(list);
    }

}
