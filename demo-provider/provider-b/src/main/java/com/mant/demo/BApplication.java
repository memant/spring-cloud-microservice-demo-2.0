package com.mant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author meiming_mm@163.com
 * @version v1.0.0
 * @since 2019/2/13
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients
public class BApplication {
    public static void main(String[] args) {
        SpringApplication.run(BApplication.class, args);
    }
}
