package com.haojukej.service.impl;

import com.haojukej.mapper.WyUserRegisterMapper;
import com.haojukej.pojo.WyUserRegister;
import com.haojukej.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huifengzhao
 * @ClassName UserServiceImpl
 * @date 2018/9/4
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    WyUserRegisterMapper userMapper;

    @Override
    public List<WyUserRegister> getUserList() {
        return userMapper.selectAll();
    }
}
