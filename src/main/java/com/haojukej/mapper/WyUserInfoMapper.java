package com.haojukej.mapper;

import com.haojukej.pojo.WyUserInfo;

public interface WyUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyUserInfo record);

    int insertSelective(WyUserInfo record);

    WyUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyUserInfo record);

    int updateByPrimaryKey(WyUserInfo record);
}