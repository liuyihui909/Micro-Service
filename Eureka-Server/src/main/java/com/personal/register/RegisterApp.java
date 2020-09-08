package com.personal.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 注册中心服务端
 *
 * @author lyh
 * @date 2020/9/5 11:39
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RegisterApp.class, args);
    }
}
