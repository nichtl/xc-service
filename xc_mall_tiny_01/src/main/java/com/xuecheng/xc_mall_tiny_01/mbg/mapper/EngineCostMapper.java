package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.EngineCost;
import com.xuecheng.xc_mall_tiny_01.mbg.model.EngineCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineCostMapper {
    int countByExample(EngineCostExample example);

    int deleteByExample(EngineCostExample example);

    int deleteByPrimaryKey(@Param("costName") String costName, @Param("engineName") String engineName, @Param("deviceType") Integer deviceType);

    int insert(EngineCost record);

    int insertSelective(EngineCost record);

    List<EngineCost> selectByExample(EngineCostExample example);

    EngineCost selectByPrimaryKey(@Param("costName") String costName, @Param("engineName") String engineName, @Param("deviceType") Integer deviceType);

    int updateByExampleSelective(@Param("record") EngineCost record, @Param("example") EngineCostExample example);

    int updateByExample(@Param("record") EngineCost record, @Param("example") EngineCostExample example);

    int updateByPrimaryKeySelective(EngineCost record);

    int updateByPrimaryKey(EngineCost record);
}