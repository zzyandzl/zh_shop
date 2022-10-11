package com.zl.controller;

import com.zl.common.Result;
import com.zl.dto.UserDto;
import com.zl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public Result SaveUser(@Valid UserDto userDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new Result(-1,"格式错误");
        }
        return userService.SaveUser(userDto);
    }
}
