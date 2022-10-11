package com.zl.mapper;

import com.zl.domain.Goods;
import com.zl.domain.User;
import com.zl.dto.GoodsDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    /*查询类别下是否有商品*/
    @Select("select count(*) from goods where sort_id = #{SortId}")
    int selectGoodsBySortId(@Param("SortId") Integer SortId);

   /*通过名称，价格，类别查询是否存在相同商品*/
    @Select("select count(*) from goods where sort_id = #{SortId} and goodsName=#{goodsName} and goodsPrice=#{goodsPrice}")
    int selectGoodsByParam(GoodsDto goodsDto);

    /*新增商品*/
    int insertGoods(GoodsDto goodsDto);

    /*修改商品*/
    int updateGoods(GoodsDto goodsDto);

    /*删除商品*/
    int deleteGoods(Integer goodId);

    /*批量删除*/
    int deleteBatchByid(String ids);

    /*动态查询*/
    List<Goods> searchGoods(GoodsDto goodsDto);

    /*商品分页显示*/
    List<Goods> selectGoodsByPage();
}
