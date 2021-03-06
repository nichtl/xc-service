package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.SlaveRelayLogInfo;
import com.xuecheng.xc_mall_tiny_01.mbg.model.SlaveRelayLogInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlaveRelayLogInfoMapper {
    int countByExample(SlaveRelayLogInfoExample example);

    int deleteByExample(SlaveRelayLogInfoExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(SlaveRelayLogInfo record);

    int insertSelective(SlaveRelayLogInfo record);

    List<SlaveRelayLogInfo> selectByExampleWithBLOBs(SlaveRelayLogInfoExample example);

    List<SlaveRelayLogInfo> selectByExample(SlaveRelayLogInfoExample example);

    SlaveRelayLogInfo selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByExample(@Param("record") SlaveRelayLogInfo record, @Param("example") SlaveRelayLogInfoExample example);

    int updateByPrimaryKeySelective(SlaveRelayLogInfo record);

    int updateByPrimaryKeyWithBLOBs(SlaveRelayLogInfo record);

    int updateByPrimaryKey(SlaveRelayLogInfo record);
}