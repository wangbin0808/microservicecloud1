package com.jrj.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced //ribbon的负载均衡，默认是轮询的机制，
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
//	@Bean
//	public IRule getIRule(){
//		//这个是随机，
//		return new RandomRule();
//	}

}
