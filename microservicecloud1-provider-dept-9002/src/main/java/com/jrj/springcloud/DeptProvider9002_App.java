package com.jrj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient //发现服务
public class DeptProvider9002_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider9002_App.class, args);
	}

}
