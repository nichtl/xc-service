package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.ProcsPriv;
import com.xuecheng.xc_mall_tiny_01.mbg.model.ProcsPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {
    int countByExample(ProcsPrivExample example);

    int deleteByExample(ProcsPrivExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routineName") String routineName, @Param("routineType") String routineType);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    List<ProcsPriv> selectByExample(ProcsPrivExample example);

    ProcsPriv selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routineName") String routineName, @Param("routineType") String routineType);

    int updateByExampleSelective(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByExample(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}