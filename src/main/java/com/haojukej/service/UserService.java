package com.haojukej.service;

import com.haojukej.pojo.WyUserRegister;

import java.util.List;

/**
 * @author huifengzhao
 * @InterfaceName UserService
 * @date 2018/9/3
 */
public interface UserService {

    /**
     * 获取所有的user对象
     * @return
     */
    List<WyUserRegister> getUserList();
}
