package com.zl.service;

import com.zl.domain.Result;
import com.zl.dto.UserDto;

public interface UserService {

    Result SaveUser(UserDto userDto);
}
