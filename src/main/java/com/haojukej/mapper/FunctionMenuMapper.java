package com.haojukej.mapper;

import com.haojukej.pojo.FunctionMenu;

import java.util.List;

public interface FunctionMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FunctionMenu record);

    int insertSelective(FunctionMenu record);

    FunctionMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FunctionMenu record);

    int updateByPrimaryKey(FunctionMenu record);

    /**
     * 获取首页的菜单
     *
     * @return 菜单的集合
     */
    List<FunctionMenu> selectAll();
}