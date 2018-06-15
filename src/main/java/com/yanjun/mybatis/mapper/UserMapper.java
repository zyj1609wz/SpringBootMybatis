package com.yanjun.mybatis.mapper;

import com.yanjun.mybatis.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where name = #{name}")
    List<User> findByName(@Param("name") String name);

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user ( name ,age ) values (#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Delete("delete from user where id = #{id}")
    int delete(@Param("id") Integer id);

    @Update("update user set age = #{age} where id = #{id}")
    int update(@Param("id") Integer id, @Param("age") Integer age);
}
