package com.personal.pkg.action;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Map;

/**
 * 图像控制器
 *
 * @author liuyh
 */
@Controller
@Slf4j
public class ImgController {

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("img")
    public @ResponseBody String img(@RequestBody Map<String, Object> params) throws IOException {
        System.out.println(params);
        URL resource = ImgController.class.getResource("/static/img");
        System.out.println(resource.getPath());
        String imgPath = resource.getPath() + File.separator + "wechat_header.jpg";
        byte[] bytes = Files.readAllBytes(Paths.get(imgPath));
        byte[] base64Encode = Base64.getEncoder().encode(bytes);
        return "data:image/jpeg;base64," + new String(base64Encode);
    }

    @RequestMapping("conf")
    public @ResponseBody String conf() throws IOException {

        URL resource = ImgController.class.getResource("/conf");
        System.out.println(resource.getPath());
        String confPath = resource.getPath() + File.separator + "application.yml";
        byte[] bytes = Files.readAllBytes(Paths.get(confPath));
        return new String(bytes).replaceAll("\n", "<br/>");
    }

    @RequestMapping("classPath")
    public @ResponseBody String classPath() {
        log.info("---------------------------- class -------------------------------------");
        log.info("class -- \"/\" --- " + ImgController.class.getResource("/"));
        log.info("class -- \"\" --- " + ImgController.class.getResource(""));
        log.info("class -- \"/static\" --- " + ImgController.class.getResource("/static"));
        log.info("class -- \"/conf\" --- " + ImgController.class.getResource("/conf"));
        log.info("class -- \"/web-resources\" --- " + ImgController.class.getResource("/web-resources"));
        System.out.println();
        log.info(System.getProperty("user.dir"));
        System.out.println();
        log.info("---------------------------- getClassLoader -------------------------------------");
        log.info("getClassLoader -- \"/\" --- " + ImgController.class.getClassLoader().getResource("/"));
        log.info("getClassLoader -- \"\" --- " + ImgController.class.getClassLoader().getResource(""));
        log.info("getClassLoader -- \"/static\" --- " + ImgController.class.getResource("/static"));
        log.info("getClassLoader -- \"/conf\" --- " + ImgController.class.getClassLoader().getResource("/conf"));
        log.info("getClassLoader -- \"/web-resources\" --- " + ImgController.class.getClassLoader().getResource("/web-resources"));
        return "console";
    }
}
