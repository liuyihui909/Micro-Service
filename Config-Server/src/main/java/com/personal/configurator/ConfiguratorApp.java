package com.personal.configurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

/**
 * 配置中心服务端
 *
 * @author lyh
 * @date 2020/9/5 11:41
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfiguratorApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConfiguratorApp.class, args);
    }
}
