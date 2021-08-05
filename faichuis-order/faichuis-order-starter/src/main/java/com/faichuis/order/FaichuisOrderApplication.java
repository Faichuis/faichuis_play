package com.faichuis.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication/*(exclude = {GlobalTransactionAutoConfiguration.class})*/
@EnableFeignClients
@EnableTransactionManagement
@MapperScan("com.faichuis.faichuismall.mapper,com.faichuis.order.*.*")
//@ComponentScan(value = "com.faichuis.order.*")
public class FaichuisOrderApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(FaichuisOrderApplication.class, args);
	}

	public static <T> T getBean(String beanName) {
		Object bean = applicationContext.getBean("omsOrderItemMapper");
		return applicationContext != null ? (T) applicationContext.getBean(beanName) : null;
	}
}
