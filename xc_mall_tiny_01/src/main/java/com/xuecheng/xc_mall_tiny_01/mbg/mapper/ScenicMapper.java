package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.Scenic;
import com.xuecheng.xc_mall_tiny_01.mbg.model.ScenicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicMapper {
    int countByExample(ScenicExample example);

    int deleteByExample(ScenicExample example);

    int insert(Scenic record);

    int insertSelective(Scenic record);

    List<Scenic> selectByExample(ScenicExample example);

    int updateByExampleSelective(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExample(@Param("record") Scenic record, @Param("example") ScenicExample example);
}