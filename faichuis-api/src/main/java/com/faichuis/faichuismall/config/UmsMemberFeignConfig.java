package com.faichuis.faichuismall.config;

import feign.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
* @vlog: 高于生活，源于生活
* @desc: 类的描述:会员中心 Feign 配置类
* @author: smlz
* @createDate: 2020/1/14 21:48
* @version: 1.0
*/

public class UmsMemberFeignConfig {

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }

}
