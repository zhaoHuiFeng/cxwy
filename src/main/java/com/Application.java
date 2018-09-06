package com;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application class
 *
 * @author HUIFENG
 * @date 2018/08/14
 */

@SpringBootApplication
@MapperScan({"com.haojukej.mapper", "com.huifengzhao.*"})
public class Application implements CommandLineRunner {

    private static final transient Logger log = LoggerFactory.getLogger(Application.class);

    @Override
    public void run(String... args) {
        log.info("启动成功");

    }

    /**
     * 启动类
     *
     * @param args ...
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
