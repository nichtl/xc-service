package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.TimeZoneName;
import com.xuecheng.xc_mall_tiny_01.mbg.model.TimeZoneNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneNameMapper {
    int countByExample(TimeZoneNameExample example);

    int deleteByExample(TimeZoneNameExample example);

    int deleteByPrimaryKey(String name);

    int insert(TimeZoneName record);

    int insertSelective(TimeZoneName record);

    List<TimeZoneName> selectByExample(TimeZoneNameExample example);

    TimeZoneName selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    int updateByExample(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    int updateByPrimaryKeySelective(TimeZoneName record);

    int updateByPrimaryKey(TimeZoneName record);
}