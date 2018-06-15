package com.yanjun.mybatis.mapper;

import com.yanjun.mybatis.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();
}
