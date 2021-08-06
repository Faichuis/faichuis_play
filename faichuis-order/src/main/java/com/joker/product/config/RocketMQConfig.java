package com.joker.product.config;


import org.apache.rocketmq.spring.core.RocketMQTemplate;

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


