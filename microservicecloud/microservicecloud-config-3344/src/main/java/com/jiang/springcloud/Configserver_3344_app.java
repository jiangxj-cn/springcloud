package com.jiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Configserver_3344_app {
    public static void main(String[] args) {
        SpringApplication.run(Configserver_3344_app.class,args);
    }

}
