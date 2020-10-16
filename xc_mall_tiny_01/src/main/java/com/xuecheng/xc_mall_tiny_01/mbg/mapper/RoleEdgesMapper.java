package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.RoleEdges;
import com.xuecheng.xc_mall_tiny_01.mbg.model.RoleEdgesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleEdgesMapper {
    int countByExample(RoleEdgesExample example);

    int deleteByExample(RoleEdgesExample example);

    int deleteByPrimaryKey(@Param("fromHost") String fromHost, @Param("fromUser") String fromUser, @Param("toHost") String toHost, @Param("toUser") String toUser);

    int insert(RoleEdges record);

    int insertSelective(RoleEdges record);

    List<RoleEdges> selectByExample(RoleEdgesExample example);

    RoleEdges selectByPrimaryKey(@Param("fromHost") String fromHost, @Param("fromUser") String fromUser, @Param("toHost") String toHost, @Param("toUser") String toUser);

    int updateByExampleSelective(@Param("record") RoleEdges record, @Param("example") RoleEdgesExample example);

    int updateByExample(@Param("record") RoleEdges record, @Param("example") RoleEdgesExample example);

    int updateByPrimaryKeySelective(RoleEdges record);

    int updateByPrimaryKey(RoleEdges record);
}