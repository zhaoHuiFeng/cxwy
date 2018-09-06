package com.haojukej.common;

import com.huifengzhao.common.base.AdminBaseController;
import com.huifengzhao.utils.StringUtil;
import io.goeasy.GoEasy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huifengzhao
 * @ClassName GoEasyRestController
 * @date 2018/8/22
 */
@RestController
public class GoEasyRestController extends AdminBaseController {

    @RequestMapping(value = "/goEasy.ftl", method = RequestMethod.GET)
    public String goEasy(String token, String msg) {
        String defaultToken = "defaultToken";
        if (!defaultToken.equals(token)) {
            return "请求失败,token输入错误";
        }
        if (StringUtil.isEmpty(msg)) {
            return "请求失败,要发送的消息不能为空";
        }
        log.info("收到一条消息:" + msg);
        String regionHost = "http://rest-hangzhou.goeasy.io";
        String appkey = "BC-ed901793835047a59e85fa9b677c8a10";
        GoEasy goEasy = new GoEasy(regionHost, appkey);
        goEasy.publish("myChannel", msg);
        return "发送成功";
    }
}
