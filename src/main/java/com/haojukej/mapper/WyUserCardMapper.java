package com.haojukej.mapper;

import com.haojukej.pojo.WyUserCard;

public interface WyUserCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyUserCard record);

    int insertSelective(WyUserCard record);

    WyUserCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyUserCard record);

    int updateByPrimaryKey(WyUserCard record);
}