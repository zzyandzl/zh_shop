package com.zl.service.Impl;

import com.zl.common.Result;
import com.zl.domain.Sort;
import com.zl.mapper.SortMapper;
import com.zl.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortServiceImpl implements SortService {

    @Autowired
    SortMapper sortMapper;
    //添加一个类别
    @Override
    public Result saveSort(Sort sort) {
        sortMapper.saveSort(sort);
        return new Result();
    }
    //删除一个类别
    @Override
    public Result deleteOneSortById(Integer id) {
        sortMapper.deleteOneSortById(id);
        return new Result();
    }
    //删除多个类别
    @Override
    public Result deleteManySortById(String id) {
        sortMapper.deleteManySortById(id);
        return new Result();
    }
    //修改类别
    @Override
    public Result updateSort(Sort sort) {
        sortMapper.updateSort(sort);
        return new Result();
    }
    //根据类别名查询类别
    @Override
    public Result selectOneSortByName(String sortName) {
        sortMapper.selectOneSortByName(sortName);
        return new Result();
    }

    @Override
    public Result selectOneSortById(Integer id){
        sortMapper.selectOneSortById(id);
        return new Result();
    }
    //查询所有类别
    @Override
    public Result selectAllSort() {
        sortMapper.selectAllSort();
        return new Result();
    }
}
