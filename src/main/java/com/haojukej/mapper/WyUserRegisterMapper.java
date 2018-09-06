package com.haojukej.mapper;

import com.haojukej.pojo.WyUserRegister;

import java.util.List;

public interface WyUserRegisterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WyUserRegister record);

    int insertSelective(WyUserRegister record);

    WyUserRegister selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WyUserRegister record);

    int updateByPrimaryKey(WyUserRegister record);

    /**
     * 查询所有的用户对象
     *
     * @return 用户的集合
     */
    List<WyUserRegister> selectAll();
}