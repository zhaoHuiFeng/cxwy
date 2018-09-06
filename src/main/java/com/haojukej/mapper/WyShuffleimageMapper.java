package com.haojukej.mapper;

import com.haojukej.pojo.WyShuffleimage;

public interface WyShuffleimageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyShuffleimage record);

    int insertSelective(WyShuffleimage record);

    WyShuffleimage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyShuffleimage record);

    int updateByPrimaryKey(WyShuffleimage record);
}