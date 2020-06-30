package com.jiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Microservicecloud9527_zuul {
    public static void main(String[] args) {
        SpringApplication.run(Microservicecloud9527_zuul.class,args);
    }
}
