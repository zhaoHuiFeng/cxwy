package com.haojukej.service;

import com.haojukej.pojo.Admin;

/**
 * AdminService interface
 *
 * @author huifengzhao
 * @date 2018/08/17
 */
public interface AdminService {

    /**
     * 根据管理员的用户名查询指定用户
     *
     * @param adminName 用户名
     * @return 指定用户/null
     */
    Admin getAdminByAdminName(String adminName);

    void testShiro();

}
