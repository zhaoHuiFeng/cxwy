package com.haojukej.controller.user;

import com.haojukej.pojo.WyUserRegister;
import com.haojukej.service.UserService;
import com.huifengzhao.common.base.AdminBaseController;
import com.huifengzhao.common.base.JsonMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huifengzhao
 * @ClassName UserController
 * @date 2018/9/3
 */
@RestController
public class UserRestController extends AdminBaseController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/getPageUserInfo.ftl", method = RequestMethod.POST)
    public String getPageUserInfo() {
        List<WyUserRegister> userList = userService.getUserList();
        return JsonMessage.getString(0,"",userList);
    }
}
