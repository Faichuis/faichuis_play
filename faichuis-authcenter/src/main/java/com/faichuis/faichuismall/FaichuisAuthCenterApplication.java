package com.faichuis.faichuismall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.faichuis.faichuismall.*")
public class FaichuisAuthCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaichuisAuthCenterApplication.class, args);
    }
}
