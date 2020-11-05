package com.personal.pkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * 打包测试启动类
 *
 * @author liuyh
 */
@SpringBootApplication
@ImportResource(locations = {
        "classpath:env/env_settings.xml"
})
public class PkgApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PkgApp.class, args);
    }
}
