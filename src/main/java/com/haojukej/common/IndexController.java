package com.haojukej.common;

import com.haojukej.service.AdminService;
import com.huifengzhao.common.base.AdminBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * IndexController class
 *
 * @author huifengzhao
 * @date 2018/08/16
 */
@Controller
public class IndexController extends AdminBaseController {

    @Resource
    private AdminService adminService;

    /**
     * 跳转到首页
     *
     * @return 首页所需要的数据
     */
    @RequestMapping(value = "/main.ftl", method = RequestMethod.GET)
    public String home() {
        adminService.testShiro();
        log.info("mian.ftl访问成功");
        return "admin/main";
    }


}
