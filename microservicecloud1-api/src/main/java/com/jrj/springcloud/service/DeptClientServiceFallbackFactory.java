package com.jrj.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jrj.springcloud.bean.Dept;

import feign.hystrix.FallbackFactory;

/**
 * 千万不要忘记在类上面新增@Component注解，大坑！！！
 * @author bin.wang
 *
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{
	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService(){
			@Override
			public boolean add(Dept dept) {
				return false;
			}
			@Override
			public Dept get(Long id) {
				return new Dept().setDeptno(id).setDname("服务正在降级处理").setDb_source("no this database mysql");
			}
			@Override
			public List<Dept> list() {
				return null;
			}
		};
	}
}
