package com.jrj.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jrj.springcloud.bean.Dept;

//@FeignClient(value="MICROSERVICECLOUD1-DEPT")
@FeignClient(value="MICROSERVICECLOUD1-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept);

	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id);

	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> list();
}
