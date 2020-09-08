package com.personal.ec.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 环境请求控制器
 *
 * @author lyh
 * @date 2020/9/8 21:33
 */
@RestController
public class EnvAction {

    @Value("${cur.env}")
    private String env;

    @Value("${log.env}")
    private String logEnv;

    @RequestMapping("/env")
    public String env() {
        return this.env;
    }

    @RequestMapping("/logEnv")
    public String logEnv() {
        return this.logEnv;
    }
}
