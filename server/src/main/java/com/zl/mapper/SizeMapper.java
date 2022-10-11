package com.zl.mapper;

import com.zl.domain.Size;
import com.zl.dto.SizeDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeMapper {

    int insertSize(SizeDto sizeDto);

    Size selectSizeById(SizeDto sizeDto);

    int updateSize(SizeDto sizeDto);

    int deleteSize(Integer id);

    List<Size> selectSizeByid(Integer goodsId);
}
