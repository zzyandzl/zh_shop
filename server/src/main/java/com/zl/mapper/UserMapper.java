package com.zl.mapper;

import com.zl.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /*查询部门中是否存在该人*/
    @Select("select count(*) from user where username=#{username} and phone=#{telphone}")
    int selectUserIfExit(UserDto userDto);

    /*查询部门中是否存在该人*/
    @Select("select count(*) from user where username=#{username} and password=#{password}")
    int selectUser(UserDto userDto);

    /*新增用户*/
    int SaveUser(UserDto userDto);
}
