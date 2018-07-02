package com.jrj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard  //服务监控需要打开的注解
public class DeptConsumer_DashBoard_App {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}
}
