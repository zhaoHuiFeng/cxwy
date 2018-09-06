package com.haojukej.mapper;

import com.haojukej.pojo.WyOrder;

public interface WyOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyOrder record);

    int insertSelective(WyOrder record);

    WyOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyOrder record);

    int updateByPrimaryKey(WyOrder record);
}