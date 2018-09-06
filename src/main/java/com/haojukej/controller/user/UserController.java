package com.haojukej.controller.user;

import com.huifengzhao.common.base.AdminBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huifengzhao
 * @ClassName UserController
 * @date 2018/9/3
 */
@Controller
public class UserController extends AdminBaseController {

    @RequestMapping(value = "/userInfo.ftl", method = RequestMethod.GET)
    public String getUserInfo() {
        setAttribute("tableUrl", "/getPageUserInfo.ftl");
        return "manage/user/userInfo";
    }
}
