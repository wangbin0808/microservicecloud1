package com.jrj.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jrj.springcloud.bean.Dept;

@RestController
public class DeptController_Consumer {
	
	//private final String url="http://localhost:9001/";
	//MICROSERVICECLOUD1-DEPT这个是微服务的名称,现在不需要知道服务的端口号和ip,就可以实现访问
	private final String url="http://MICROSERVICECLOUD1-DEPT";
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/comsumer/dept/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(url+"/dept/add", dept, boolean.class);
	}

	@RequestMapping("/comsumer/dept/get/{id}")
	public Dept get(@PathVariable Long id){
		return restTemplate.getForObject(url+"/dept/get/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/comsumer/dept/list")
	public List<Dept> list(){
		return restTemplate.getForObject(url+"/dept/list", List.class);
	}
}
