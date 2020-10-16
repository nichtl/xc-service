package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.TimeZoneTransition;
import com.xuecheng.xc_mall_tiny_01.mbg.model.TimeZoneTransitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionMapper {
    int countByExample(TimeZoneTransitionExample example);

    int deleteByExample(TimeZoneTransitionExample example);

    int deleteByPrimaryKey(@Param("timeZoneId") Integer timeZoneId, @Param("transitionTime") Long transitionTime);

    int insert(TimeZoneTransition record);

    int insertSelective(TimeZoneTransition record);

    List<TimeZoneTransition> selectByExample(TimeZoneTransitionExample example);

    TimeZoneTransition selectByPrimaryKey(@Param("timeZoneId") Integer timeZoneId, @Param("transitionTime") Long transitionTime);

    int updateByExampleSelective(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);

    int updateByExample(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);

    int updateByPrimaryKeySelective(TimeZoneTransition record);

    int updateByPrimaryKey(TimeZoneTransition record);
}