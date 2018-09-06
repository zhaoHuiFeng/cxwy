package com.haojukej.controller.admin;

import com.haojukej.pojo.Admin;
import com.haojukej.service.AdminService;
import com.huifengzhao.common.base.AdminBaseController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author huifengzhao
 * @ClassName AdminListController
 * @date 2018/8/24
 */
@Controller
public class AdminController extends AdminBaseController {

    @Resource
    private AdminService adminService;

    @RequestMapping(value = "/adminManagement.ftl", method = RequestMethod.GET)
    public String getAdminInfo() {
        Subject adminSubject = SecurityUtils.getSubject();
        Admin admin = adminService.getAdminByAdminName((String) adminSubject.getPrincipal());
        setAttribute("admin", admin);
        return "admin/adminManagement";
    }
}
