package com.haojukej.service;

import com.haojukej.pojo.FunctionMenu;

import java.util.List;

/**
 * @author huifengzhao
 * @InterfaceName FunctionMenuService
 * @date 2018/8/21
 */
public interface FunctionMenuService {

    /**
     * 查询所有的功能菜单
     *
     * @return 菜单的集合
     */
    List<FunctionMenu> getFunctionMenu();
}
