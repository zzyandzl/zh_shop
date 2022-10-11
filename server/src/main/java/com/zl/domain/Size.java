package com.zl.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Size {
    private Integer id;
    private String content;
    private Double price;
    private Integer state;
    private Integer goodsId;
}
