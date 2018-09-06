package com.haojukej.mapper;

import com.haojukej.pojo.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    /**
     * 根据adminName查询指定管理员
     *
     * @param adminName 用户名
     * @return 管理员对象/null
     */
    Admin getAdminByAdminName(String adminName);
}