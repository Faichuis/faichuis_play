package com.faichuis.faichuismall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created on 2019/4/8.
 */
@Configuration
@MapperScan({"com.macro.mall.mapper","com.macro.mall.search.dao"})
public class MyBatisConfig {
}
