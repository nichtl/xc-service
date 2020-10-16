package com.xuecheng.xc_mall_tiny_01.mbg.mapper;

import com.xuecheng.xc_mall_tiny_01.mbg.model.ScenicUser;
import com.xuecheng.xc_mall_tiny_01.mbg.model.ScenicUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicUserMapper {
    int countByExample(ScenicUserExample example);

    int deleteByExample(ScenicUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScenicUser record);

    int insertSelective(ScenicUser record);

    List<ScenicUser> selectByExample(ScenicUserExample example);

    ScenicUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScenicUser record, @Param("example") ScenicUserExample example);

    int updateByExample(@Param("record") ScenicUser record, @Param("example") ScenicUserExample example);

    int updateByPrimaryKeySelective(ScenicUser record);

    int updateByPrimaryKey(ScenicUser record);
}