package com.jrj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient //发现服务
@EnableCircuitBreaker //这个是熔断器的注解
public class DeptProvider9001_Hystrix_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider9001_Hystrix_App.class, args);
	}

}
