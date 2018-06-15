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

    public PageInfo findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.findAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }
}
