package com.jrj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.jrj.springcloud")
@ComponentScan(basePackages="com.jrj.springcloud")
public class DeptConsumerFegin_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerFegin_App.class, args);
	}

}
