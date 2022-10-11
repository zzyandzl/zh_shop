package com.zl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SizeDto extends BaseDto{
    @NotNull(message = "规格内容不能为空")
    private String content;
    @NotNull(message = "价格不能为空")
    private Double price;
    @NotNull(message = "状态不能为空")
    private Integer state;
    @NotNull(message = "商品id不能为空")
    private Integer goodsId;
}
