package com.mall.order.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(value = { "com.mall.order.service" })
public class MainConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
