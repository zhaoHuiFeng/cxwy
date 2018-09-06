//package com.haojukej.common;
//
//import com.huifengzhao.common.log.LogType;
//import com.huifengzhao.common.spring.DefaultSystemLog;
//import com.huifengzhao.common.spring.SpringApplicationBuilder;
//import org.springframework.beans.BeansException;
//import org.springframework.boot.context.event.ApplicationFailedEvent;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextClosedEvent;
//import org.springframework.core.env.Environment;
//import org.springframework.util.Assert;
//import org.springframework.web.context.support.ServletRequestHandledEvent;
//
//import java.util.Iterator;
//import java.util.List;
//
///**
// * @author huifengzhao
// * @ClassName SpringUtil
// * @date 2018/8/24
// */
//public class SpringUtil implements ApplicationListener, ApplicationContextAware {
//
//    public SpringUtil() {
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//
//        applicationContext = applicationContext;
//        System.out.println("记录日志");
//        List<ApplicationEventLoad> applicationEventLoads = SpringApplicationBuilder.getInstance().getApplicationEventLoads();
//        if (applicationEventLoads != null) {
//            Iterator var3 = applicationEventLoads.iterator();
//
//            while(var3.hasNext()) {
//                ApplicationEventLoad applicationEventLoad = (ApplicationEventLoad)var3.next();
//                applicationEventLoad.applicationLoad();
//            }
//        }
//    }
//
//    @Override
//    public void onApplicationEvent(ApplicationEvent applicationEvent) {
//        if (event instanceof ApplicationFailedEvent) {
//            System.err.println("启动失败");
//            ApplicationFailedEvent applicationFailedEvent = (ApplicationFailedEvent)event;
//            applicationFailedEvent.getException().printStackTrace();
//        } else {
//            List<ApplicationEventClient> applicationEventClients = SpringApplicationBuilder.getInstance().getApplicationEventClients();
//            if (applicationEventClients != null) {
//                Iterator var3 = applicationEventClients.iterator();
//
//                while(var3.hasNext()) {
//                    ApplicationEventClient applicationEventClient = (ApplicationEventClient)var3.next();
//                    applicationEventClient.onApplicationEvent(event);
//                }
//            }
//
//            if (event instanceof ApplicationReadyEvent) {
//                CommonInitPackage.init();
//                DefaultSystemLog.LOG().info("common-boot 启动完成");
//            } else if (event instanceof ContextClosedEvent) {
//                DefaultSystemLog.LOG().info("common-boot 关闭程序");
//                ThreadPoolService.shutdown();
//            } else {
//                if (event instanceof ServletRequestHandledEvent) {
//                    ServletRequestHandledEvent servletRequestHandledEvent = (ServletRequestHandledEvent)event;
//                    if (!servletRequestHandledEvent.wasFailure()) {
//                        DefaultSystemLog.LOG(LogType.REQUEST).info(servletRequestHandledEvent.toString());
//                    } else {
//                        DefaultSystemLog.LOG(LogType.REQUEST).info("error:" + servletRequestHandledEvent.toString());
//                    }
//                }
//
//            }
//        }
//    }
//
//    public static ApplicationContext getApplicationContext() {
//        Assert.notNull(applicationContext, "application is null");
//        return applicationContext;
//    }
//
//    public static Object getBean(String name) {
//        return getApplicationContext().getBean(name);
//    }
//
//    public static <T> T getBean(Class<T> clazz) {
//        return getApplicationContext().getBean(clazz);
//    }
//
//    public static <T> T getBean(String name, Class<T> clazz) {
//        return getApplicationContext().getBean(name, clazz);
//    }
//
//    public static Environment getEnvironment() {
//        return SpringApplicationBuilder.getInstance().getEnvironment();
//    }
//
//    public static String getApplicationId() {
//        return getEnvironment().getProperty("spring.application.name");
//    }
//}
