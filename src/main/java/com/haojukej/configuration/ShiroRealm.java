package com.haojukej.configuration;

import com.haojukej.pojo.Admin;
import com.haojukej.service.AdminService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * ShiroRealm class
 *
 * @author huifengzhao
 * @date 2018/08/17
 */
public class ShiroRealm extends AuthorizingRealm {

    public final transient Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private AdminService adminService;

    /**
     * 授权
     *
     * @param principalCollection shiro用户对象
     * @return 授权对象
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String name = (String) principalCollection.getPrimaryPrincipal();
//        UserRole userRole = adminService.selectRole(name);
//        User admin = userRole.getUser();
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//
//
//        return simpleAuthorizationInfo;
        return null;
    }

    /**
     * 认证
     *
     * @param authenticationToken 用户的token
     * @return 验证信息
     * @throws AuthenticationException 身份认证异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername();
        String passWord = new String(token.getPassword());

        log.info("账户:" + userName + "=" + passWord + "认证权限  " + authenticationToken.toString());

        Admin admin = adminService.getAdminByAdminName(userName);


        if (admin == null) {
            throw new AuthenticationException("用户不存在");
        }

        if (!admin.getPassWord().equals(passWord)) {
            throw new UnknownAccountException("用户名或密码错误");
        }

        log.info("账户:" + admin.getNickName() + "  权限认证成功");
        return new SimpleAuthenticationInfo(userName, admin.getPassWord(), this.getName());
    }
}
