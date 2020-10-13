package com.personal.ec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

/**
 * 服务提供端
 *
 * @author lyh
 * @date 2020/9/8 20:52
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.personal.ec.dao")
public class EurekaClientApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EurekaClientApp.class, args);
    }
}
