package com.jrj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
/**
 * 自定义的负载均衡规则
 * @author Administrator
 *
 */
@Configuration
public class MyRule {

	@Bean
	public IRule getIRule(){
	//	return new RandomRule();//随机
		return new MyRuleRa1();
	}

}
