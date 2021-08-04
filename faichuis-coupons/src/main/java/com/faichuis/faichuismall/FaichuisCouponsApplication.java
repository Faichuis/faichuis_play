package com.faichuis.faichuismall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FaichuisCouponsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaichuisCouponsApplication.class, args);
	}

}
