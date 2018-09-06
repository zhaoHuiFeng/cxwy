package com.haojukej.fiter;


import com.huifengzhao.utils.CodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.IOException;

/**
 * LoginFilter 过滤器,判断用户是否登录
 *
 * @author huifengzhao
 * @ClassName LoginFilter
 * @date 2018/8/25
 */
@Configuration
public class LoginFilter implements Filter {


    private final transient Logger log = LoggerFactory.getLogger(this.getClass());

    private String[] includeUrls = new String[]{"/login.ftl", "/getVerificationCode.ftl"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String url = request.getRequestURI().substring(request.getContextPath().length());
        String getVerificationCodeUrl = "/getVerificationCode.ftl";
        if (!isInclude(url)) {
            filterChain.doFilter(request, response);
        } else {
            Image validateCodeImage = CodeUtil.getValidateCodeImage();
            String validateCode = CodeUtil.getValidateCode();
            System.out.println(validateCode);
            if (getVerificationCodeUrl.equals(url)) {
                response.setContentType("image/jpeg");
                response.setDateHeader("expries", -1);
                response.setHeader("Cache-Control", "no-cache");
                response.setHeader("Pragma", "no-cache");
                ImageIO.write((RenderedImage) validateCodeImage, "jpg", response.getOutputStream());
            } else {
//                String code = request.getParameter("code");
//                if (StringUtil.isEmpty(code) && !validateCode.equalsIgnoreCase(code)) {
//                    PrintWriter writer = response.getWriter();
//                    writer.write("验证码输入有误!!!");
//                }
//                String showState = request.getParameter("showState");
//                String rememberPassword = request.getParameter("rememberPassword");
//                System.out.println("code:" + code + "   showState:" + showState + "   rememberPasswordL:" + rememberPassword);
                filterChain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {
        log.info("filter正常销毁");
    }

    /**
     * 判断是否需要过滤
     *
     * @param url 请求的url
     * @return true/false
     */
    private boolean isInclude(String url) {
        for (String includeUrl : includeUrls) {
            if (includeUrl.equals(url)) {
                return true;
            }
        }
        return false;
    }
}
