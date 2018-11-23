package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandMapper {
    //查询所有的品牌
    List<TbBrand> queryAll();
}
