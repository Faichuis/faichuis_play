package com.faichuis.faichuismall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@RefreshScope
public class FaichuisAuthCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaichuisAuthCenterApplication.class, args);
    }
}
