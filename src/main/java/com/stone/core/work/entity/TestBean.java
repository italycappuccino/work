package com.stone.core.work.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

public class TestBean {
	
	private String desc;
	
	public void init(){
		System.out.println("init========");
	}
	
	public void destroy(){
		System.out.println("destroy=============");
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}

}
