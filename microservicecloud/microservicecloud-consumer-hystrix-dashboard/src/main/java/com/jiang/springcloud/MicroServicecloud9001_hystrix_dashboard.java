package com.jiang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroServicecloud9001_hystrix_dashboard {
    public static void main(String[] args) {
        SpringApplication.run(MicroServicecloud9001_hystrix_dashboard.class, args);
    }
}
