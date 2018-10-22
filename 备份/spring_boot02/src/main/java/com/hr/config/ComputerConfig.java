package com.hr.config;

import com.hr.entity.Computer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {
    @ConfigurationProperties(prefix = "computer")
    @Bean("computer")
    public Computer getComputer(){
        System.out.println("向容器中添加computer对象.");
        //return new Computer(1,"张三");
        return new Computer();
    }
}
