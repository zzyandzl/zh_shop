package com.zl.service.Impl;

import com.zl.common.Result;
import com.zl.dto.UserDto;
import com.zl.mapper.UserMapper;
import com.zl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceLmpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result SaveUser(UserDto userDto) {

        return new Result(200,"新增成功");
    }
}
