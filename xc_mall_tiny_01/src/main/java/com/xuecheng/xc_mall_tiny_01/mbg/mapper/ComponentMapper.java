package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.Component;
import com.xuecheng.xc_mall_tiny_01.mbg.model.ComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComponentMapper {
    int countByExample(ComponentExample example);

    int deleteByExample(ComponentExample example);

    int deleteByPrimaryKey(Integer componentId);

    int insert(Component record);

    int insertSelective(Component record);

    List<Component> selectByExampleWithBLOBs(ComponentExample example);

    List<Component> selectByExample(ComponentExample example);

    Component selectByPrimaryKey(Integer componentId);

    int updateByExampleSelective(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExampleWithBLOBs(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExample(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByPrimaryKeySelective(Component record);

    int updateByPrimaryKeyWithBLOBs(Component record);

    int updateByPrimaryKey(Component record);
}