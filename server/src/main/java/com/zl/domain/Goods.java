package com.zl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Double goodsPrice;
    /*类别id*/
    private Integer sortId;
    /*规格id*/
    private List<Size> size;
    /*库存*/
    private Integer goodsInventory;
    private String goodsImg;
    private String goodsDes;
    /*保质期*/
    private Date ShelfLifetime;
    /*上下架状态*/
    private Integer goodsState;
}
