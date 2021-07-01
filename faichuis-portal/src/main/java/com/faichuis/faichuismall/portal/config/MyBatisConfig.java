package com.faichuis.faichuismall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by tuling on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.faichuis.faichuismall.mapper","com.faichuis.faichuismall.portal.dao"})
public class MyBatisConfig {
}
