package com.jrj.springcloud.service;

import java.util.List;

import com.jrj.springcloud.bean.Dept;

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
