package com.joker.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication/*(exclude = GlobalTransactionAutoConfiguration.class)*/
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.joker.product.*"})
@MapperScan({"com.joker.product.dto.mapper","com.faichuis.faichuismall.mapper.*"})
public class TulingmallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(TulingmallProductApplication.class, args);
	}

}
