package com.yanjun.mybatis.mapper;

import com.yanjun.mybatis.bean.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UserMapper extends Mapper<User>, MySqlMapper<User> {

}
