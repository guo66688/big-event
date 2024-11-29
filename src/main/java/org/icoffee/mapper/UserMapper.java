package org.icoffee.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.icoffee.pojo.User;
@Mapper
public interface UserMapper {
//    根据用户名查找用户
    @Select("select * from user where username=#{username}")
    User findByUserName(String username);
//    添加
    @Insert("insert into user(username,password,create_time,update_time)"+
            "values(#{username},#{password},now(),now())")
    void add(String username, String password);
}
