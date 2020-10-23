package com.xuecheng.xc_mall_tiny_01.dao;

/**
 * @Author admin
 * @description
 * @ 2020/10/23
 */
import com.xuecheng.xc_mall_tiny_01.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}