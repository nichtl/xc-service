package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.Db;
import com.xuecheng.xc_mall_tiny_01.mbg.model.DbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMapper {
    int countByExample(DbExample example);

    int deleteByExample(DbExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user);

    int insert(Db record);

    int insertSelective(Db record);

    List<Db> selectByExample(DbExample example);

    Db selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user);

    int updateByExampleSelective(@Param("record") Db record, @Param("example") DbExample example);

    int updateByExample(@Param("record") Db record, @Param("example") DbExample example);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}