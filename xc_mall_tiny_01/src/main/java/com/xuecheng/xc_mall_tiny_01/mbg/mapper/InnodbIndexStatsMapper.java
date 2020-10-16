package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.InnodbIndexStats;
import com.xuecheng.xc_mall_tiny_01.mbg.model.InnodbIndexStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexStatsMapper {
    int countByExample(InnodbIndexStatsExample example);

    int deleteByExample(InnodbIndexStatsExample example);

    int deleteByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName, @Param("indexName") String indexName, @Param("statName") String statName);

    int insert(InnodbIndexStats record);

    int insertSelective(InnodbIndexStats record);

    List<InnodbIndexStats> selectByExample(InnodbIndexStatsExample example);

    InnodbIndexStats selectByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName, @Param("indexName") String indexName, @Param("statName") String statName);

    int updateByExampleSelective(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    int updateByExample(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    int updateByPrimaryKeySelective(InnodbIndexStats record);

    int updateByPrimaryKey(InnodbIndexStats record);
}