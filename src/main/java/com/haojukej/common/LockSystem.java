package com.haojukej.common;

import com.huifengzhao.common.base.AdminBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * LockSystem class
 *
 * @author huifengzhao
 * @date 2018/08/18
 */
@RestController
public class LockSystem extends AdminBaseController {

    /**
     * 锁屏
     *
     * @return 返回1锁屏成功
     */
    @RequestMapping(value = "/lockSystem", method = RequestMethod.POST)
    public String lockSystem() {

        log.info("admin:乂夜秋风-锁屏");
        return "1";
    }

    /**
     * 解除锁屏
     *
     * @param lockPassword 解锁密码
     * @return 返回0解锁成功
     */
    @RequestMapping(value = "/unlockSystem", method = RequestMethod.POST)
    public String unlockSystem(String lockPassword) {
        String lockPasswordSys = "888888";
        if (!lockPasswordSys.equals(lockPassword)) {
            log.info("admin:乂夜秋风-解锁失败" + lockPassword);
            return "1";
        }
        log.info("admin:乂夜秋风-解锁成功");
        return "0";
    }
}
