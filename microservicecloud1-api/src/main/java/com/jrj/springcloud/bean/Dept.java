package com.jrj.springcloud.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long deptno;
	private String dname;
	private String db_source;
	public Dept(String dname) {
		super();
		this.dname = dname;
	}

	
}
