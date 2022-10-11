package com.zl.dto;

import com.zl.domain.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsDto extends BaseDto{
    private String goodsName;
    private Double goodsPrice;
    /*类别id*/
    private Integer sortId;
    /*规格id*/
    private Size size;
    /*库存*/
    private Integer goodsInventory;
    private String goodsImg;
    private String goodsDes;
    /*保质期*/
    private Date ShelfLifetime;
    /*上下架状态*/
    private Integer goodsState;
}
