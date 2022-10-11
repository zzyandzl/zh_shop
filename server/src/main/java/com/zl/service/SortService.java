package com.zl.service;

import com.zl.common.Result;
import com.zl.domain.Sort;

import java.util.List;

public interface SortService {
    //添加一个类别
    Result saveSort(Sort sort);
    //删除一个类别
    Result deleteOneSortById(Integer id);
    //删除多个类别
    Result deleteManySortById(String id);
    //修改类别
    Result updateSort(Sort sort);
    //根据类别名查询类别
    Result selectOneSortByName(String sortName);
    //根据类别id查询类别
    Result selectOneSortById(Integer id);
    //查询所有类别
    Result selectAllSort();

}
