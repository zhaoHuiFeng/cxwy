package com.haojukej.mapper;

import com.haojukej.pojo.WyUsersay;

public interface WyUsersayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyUsersay record);

    int insertSelective(WyUsersay record);

    WyUsersay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyUsersay record);

    int updateByPrimaryKey(WyUsersay record);
}