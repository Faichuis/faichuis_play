package com.faichuis.faichuismall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 应用启动入口
 * Created on 2018/4/26.
 */
@SpringBootApplication
@RefreshScope
public class MallAdminApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        applicationContext.getBean(OmsOrder.class);
        SpringApplication.run(MallAdminApplication.class, args);
    }
}
