package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello Spring Boot~";
    }
    /*
    * 按照之前的项目发布方式还需要两步才能访问Controller
    *   web.xml中需要对Spring MVC中央控制器进行配置
    *   applicationContext.xml的配置
    * */

}
