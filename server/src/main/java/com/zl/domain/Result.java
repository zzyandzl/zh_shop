package com.zl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code =200;
    private String message;
    private Object data;
    private Long total = 0L;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, Long total) {
        this.code = code;
        this.message = message;
        this.total = total;
    }
}
