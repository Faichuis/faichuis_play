package com.faichuis.faichuismall.config;


import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

//@EnableConfigurationProperties
public class RocketMQConfig {

    private String nameServer;




//    @Bean
    public RocketMQTemplate getRocketMq(){
        RocketMQTemplate rocketMQTemplate = new RocketMQTemplate();
//        rocketMQTemplate.setProducer();

        return rocketMQTemplate;

    }
}


