package com.zl.controller;

import com.zl.common.Result;
import com.zl.domain.Sort;
import com.zl.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sort")
public class SortController {

    @Autowired
    SortService sortService;

    /*添加一个类别*/
    @PostMapping("/saveOneSort")
    public Result saveOne(Sort sort){
        return sortService.saveSort(sort);
    }

    /*删除一个类别*/
    @PostMapping("/deleteOneById")
    public Result deleteOne(Integer id){
        return sortService.deleteOneSortById(id);

    }

    /*删除多个类别*/
    @PostMapping("/deleteManySort")
    public Result deleteManySort(String id){
        return sortService.deleteManySortById(id);

    }

    /*修改类别*/
    @PostMapping("/updateSort")
    public Result updateSort(Sort sort){
        return sortService.updateSort(sort);

    }

    /*根据一个类别名查类别*/
    @PostMapping("/selectSortByName")
    public Result selectOneSortByName(String sortName){
        return sortService.selectOneSortByName(sortName);
    }

    /*根据类别id查询类别*/
    @PostMapping("/selectSortById")
    private Result selectOneById(Integer id){
        return sortService.selectOneSortById(id);
    }

    /*查询所有类别*/
    @PostMapping("/selectAllSort")
    public Result selectAllSort(){
        return sortService.selectAllSort();
    }

}
