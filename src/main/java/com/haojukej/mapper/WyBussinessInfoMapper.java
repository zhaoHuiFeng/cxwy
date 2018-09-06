package com.haojukej.mapper;

import com.haojukej.pojo.WyBussinessInfo;

public interface WyBussinessInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyBussinessInfo record);

    int insertSelective(WyBussinessInfo record);

    WyBussinessInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyBussinessInfo record);

    int updateByPrimaryKey(WyBussinessInfo record);
}