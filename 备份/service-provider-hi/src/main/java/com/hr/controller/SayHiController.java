package com.hr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("/sayHi")
    public String sayHi(String name){
        return "Hello "+name+",i am servie,port: "+port;
    }
}
