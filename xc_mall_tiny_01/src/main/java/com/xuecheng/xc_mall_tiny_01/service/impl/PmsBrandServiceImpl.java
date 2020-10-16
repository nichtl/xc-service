package com.xuecheng.xc_mall_tiny_01.service.impl;

import com.github.pagehelper.PageHelper;
import com.xuecheng.xc_mall_tiny_01.mbg.mapper.PmsBrandMapper;
import com.xuecheng.xc_mall_tiny_01.mbg.model.PmsBrand;
import com.xuecheng.xc_mall_tiny_01.mbg.model.PmsBrandExample;
import com.xuecheng.xc_mall_tiny_01.service.IPmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author admin
 * @description
 * @ 2020/10/16
 */
@Service
public class PmsBrandServiceImpl implements IPmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int getListcount() {
        return pmsBrandMapper.countByExample(new PmsBrandExample());
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
