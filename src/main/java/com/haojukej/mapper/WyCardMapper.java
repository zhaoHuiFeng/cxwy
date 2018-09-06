package com.haojukej.mapper;

import com.haojukej.pojo.WyCard;

public interface WyCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyCard record);

    int insertSelective(WyCard record);

    WyCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyCard record);

    int updateByPrimaryKey(WyCard record);
}