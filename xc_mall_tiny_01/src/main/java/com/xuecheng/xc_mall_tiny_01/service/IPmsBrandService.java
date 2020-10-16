package com.xuecheng.xc_mall_tiny_01.service;

import com.xuecheng.xc_mall_tiny_01.mbg.model.PmsBrand;

import java.util.List;

public interface IPmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);
    int getListcount();

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);



















}
