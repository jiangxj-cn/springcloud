package com.jiang.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule{
    @Bean
    public IRule myRule(){
        return  new RandomRule_x();
    }
}
