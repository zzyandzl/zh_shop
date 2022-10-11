package com.zl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends BaseDto{

    @NotNull(message = "请输入名称")
    private String username;

    @NotNull(message = "请输入密码")
    private String password;

    @NotNull(message = "请输入电话")
    private Long phone;

    @NotNull(message = "请输入邮箱")
    private String email;

    private String avatar;
}
