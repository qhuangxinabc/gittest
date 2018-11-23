package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//使用阿里巴巴的
@Service
public class BrandServiceImpl implements BrandService{
    //查询所有的品牌
    @Autowired
    private BrandMapper brandMapper;
    public List<TbBrand> queryAll() {
        return brandMapper.queryAll();
    }
}
