package com.joker.product.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication/*(exclude = GlobalTransactionAutoConfiguration.class)*/
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.joker.product.api.service"})
public class TulingmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TulingmallProductApplication.class, args);
	}

}
