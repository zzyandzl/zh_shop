package com.zl.mapper;

import com.zl.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SortMapper {

    //添加一个类别
    int saveSort(Sort sort);
    //删除一个类别
    int deleteOneSortById(Integer id);
    //删除多个类别
    int deleteManySortById(String id);
    //修改类别
    int updateSort(Sort sort);
    //根据类别名查询类别
    Sort selectOneSortByName(String sortName);
    //根据类别id查类别
    Sort selectOneSortById(Integer id);
    //查询所有类别
    List<Sort> selectAllSort();


}
