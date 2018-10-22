package com.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.hr.mapper")
//@EnableEurekaClient
public class RedisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisProjectApplication.class, args);
	}
}
