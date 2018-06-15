package com.yanjun.mybatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public PageInfo findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList) ;
        return pageInfo;
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
