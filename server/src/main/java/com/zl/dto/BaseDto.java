package com.zl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseDto {
    private Integer pageNum=1;

    private Integer pageSize=3;

    private Integer id;
}
