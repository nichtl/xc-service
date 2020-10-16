package com.xuecheng.xc_mall_tiny_01.controller;

import com.xuecheng.framework.model.response.*;
import com.xuecheng.xc_mall_tiny_01.mbg.model.PmsBrand;
import com.xuecheng.xc_mall_tiny_01.service.IPmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author admin
 * @description
 * @ 2020/10/16
 */
@Api(value = "PmsBrandController",tags = {"brand 管理"})
@RestController
@RequestMapping("/PmsBrand")
public class PmsBrandController  {
    @Autowired
    IPmsBrandService  brandService;
    private  static  final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);
    @ApiOperation("所有商品信息")
    @GetMapping("/listAll")
    @ResponseBody
    public QueryResponseResult getBrandList(){
        Integer count = brandService.getListcount();
        QueryResult result = new QueryResult();
        result.setList(brandService.listAllBrand());
        result.setTotal(count);
        return new QueryResponseResult(CommonCode.SUCCESS,result);
    }
    @ApiOperation("添加商品信息")
    @PostMapping("/createBrand")
    @ResponseBody
    public ResponseResult createBrand(@RequestBody PmsBrand pmsBrand){
        Integer count = brandService.createBrand(pmsBrand);
        if(count == 1){
        return  ResponseResult.SUCCESS();
        }
        return  ResponseResult.FAIL();
    }
    @ApiOperation("更新商品信息")
    @GetMapping("/updatebrand/{id}")
    @ResponseBody
    public  ResponseResult UpdateBrand(@PathVariable("id") Long id,@RequestBody PmsBrand pmsBrand){
        Integer count  = brandService.updateBrand(id,pmsBrand);
        if(count == 1){
            return  ResponseResult.SUCCESS();
        }
        return  ResponseResult.FAIL();

    }
    @ApiOperation("分页查询 默认1页10条")
    @GetMapping("/pagelist")
    @ResponseBody
    public  QueryResponseResult pagelist(@RequestParam(value = "pagenum" ,defaultValue = "1") Integer PageNum,
                                    @RequestParam(value = "size",defaultValue = "10") Integer size ){
        Integer  Totalcount = brandService.getListcount();
        List<PmsBrand> brandList = brandService.listBrand(PageNum,size);
        QueryResult  result = new QueryResult();
        result.setList(brandList);
        result.setTotal(Totalcount);
        return  new QueryResponseResult(CommonCode.SUCCESS,result);
    }







}
