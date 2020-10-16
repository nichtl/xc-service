package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.TimeZone;
import com.xuecheng.xc_mall_tiny_01.mbg.model.TimeZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneMapper {
    int countByExample(TimeZoneExample example);

    int deleteByExample(TimeZoneExample example);

    int deleteByPrimaryKey(Integer timeZoneId);

    int insert(TimeZone record);

    int insertSelective(TimeZone record);

    List<TimeZone> selectByExample(TimeZoneExample example);

    TimeZone selectByPrimaryKey(Integer timeZoneId);

    int updateByExampleSelective(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);

    int updateByExample(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);

    int updateByPrimaryKeySelective(TimeZone record);

    int updateByPrimaryKey(TimeZone record);
}