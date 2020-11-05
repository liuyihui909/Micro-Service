package com.personal.pkg.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author liuyh
 */
@Controller
public class EnvController {

    @Value("${datasource.url}")
    private String datasourceUrl;

    @RequestMapping("env")
    public @ResponseBody String env() {
        return datasourceUrl;
    }
}
