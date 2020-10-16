package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.Servers;
import com.xuecheng.xc_mall_tiny_01.mbg.model.ServersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServersMapper {
    int countByExample(ServersExample example);

    int deleteByExample(ServersExample example);

    int deleteByPrimaryKey(String serverName);

    int insert(Servers record);

    int insertSelective(Servers record);

    List<Servers> selectByExample(ServersExample example);

    Servers selectByPrimaryKey(String serverName);

    int updateByExampleSelective(@Param("record") Servers record, @Param("example") ServersExample example);

    int updateByExample(@Param("record") Servers record, @Param("example") ServersExample example);

    int updateByPrimaryKeySelective(Servers record);

    int updateByPrimaryKey(Servers record);
}