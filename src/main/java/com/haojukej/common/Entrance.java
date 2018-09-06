package com.haojukej.common;

import com.github.pagehelper.util.StringUtil;
import com.haojukej.pojo.Admin;
import com.haojukej.pojo.FunctionMenu;
import com.haojukej.service.AdminService;
import com.haojukej.service.FunctionMenuService;
import com.huifengzhao.common.base.AdminBaseController;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Entrance class
 *
 * @author huifengzhao
 * @date 2018/08/16
 */
@Controller
public class Entrance extends AdminBaseController {

    @Resource
    private AdminService adminService;

    @Resource
    private FunctionMenuService functionMenuService;

    /**
     * 请求跳转到登录页面
     *
     * @return 首页
     */
    @RequestMapping(value = "/getLogin", method = RequestMethod.GET)
    public String getLogin() {
        return "/login";
    }

    /**
     * 请求访问后台的首页,判断是否登录,若登录就跳转到首页,未登录跳转到登录页面
     *
     * @return 首页/登录页面
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        Subject adminSubject = SecurityUtils.getSubject();
        if (!adminSubject.isAuthenticated()) {
            return "/login";
        }
        List<FunctionMenu> functionMenus = functionMenuService.getFunctionMenu();
        setAttribute("functionMenus", functionMenus);
        Admin admin = adminService.getAdminByAdminName((String) adminSubject.getPrincipal());
        setAttribute("admin", admin);
        return "/index";
    }

    /**
     * 退出登录
     *
     * @return 跳转到登录页面
     */
    @RequestMapping(value = "/logout.ftl", method = RequestMethod.GET)
    public String logout() {
        Subject adminSubject = SecurityUtils.getSubject();
        log.info(adminSubject.getPrincipal() + "退出登录");
        adminSubject.logout();
        return "/login";
    }

    /**
     * 登录
     *
     * @return 登录返回index页面, 未登录跳转到登录页面
     */
    @RequestMapping(value = "/login.ftl", method = RequestMethod.POST)
    public String login(String userName, String passWord) {
        if (StringUtil.isEmpty(userName) || StringUtil.isEmpty(passWord)) {
            log.info("用户名或密码不能为空");
            return "/login";
        }

        List<FunctionMenu> functionMenus = functionMenuService.getFunctionMenu();
        setAttribute("functionMenus", functionMenus);
        Admin admin = adminService.getAdminByAdminName(userName);
        setAttribute("admin", admin);

        Subject adminSubject = SecurityUtils.getSubject();
        if (adminSubject.isAuthenticated()) {
            return "/index";
        }
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        token.setRememberMe(true);
        try {
            adminSubject.login(token);
        } catch (UnknownAccountException un) {
            log.error("登录失败,用户名或密码错误", un);
            return "/login";
        } catch (AuthenticationException au) {
            log.error("登录失败,用户不存在", au);
            return "/login";
        } catch (Exception e) {
            log.error("登录失败,请联系管理员", e);
            return "/login";
        }
        return "/index";
    }

}
