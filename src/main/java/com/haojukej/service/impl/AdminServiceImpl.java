package com.haojukej.service.impl;

import com.haojukej.mapper.AdminMapper;
import com.haojukej.pojo.Admin;
import com.haojukej.service.AdminService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * AdminServiceImpl class
 *
 * @author huifengzhao
 * @date 2018/08/17
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;


    @Override
    public Admin getAdminByAdminName(String adminName) {
        return adminMapper.getAdminByAdminName(adminName);
    }

    @Override
    @RequiresPermissions("abc")
    public void testShiro() {
        System.out.println("成功访问");
    }


}
