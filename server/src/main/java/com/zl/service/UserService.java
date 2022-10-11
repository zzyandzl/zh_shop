package com.zl.service;

import com.zl.common.Result;
import com.zl.dto.UserDto;

public interface UserService {

    Result SaveUser(UserDto userDto);
}
