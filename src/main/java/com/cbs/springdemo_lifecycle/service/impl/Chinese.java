package com.cbs.springdemo_lifecycle.service.impl;

import org.springframework.beans.factory.InitializingBean;

import com.cbs.springdemo_lifecycle.service.Person;

public class Chinese implements Person,InitializingBean{

	public void afterPropertiesSet() throws Exception {
		System.out.println("执行初始化方法");
	}

	public String sayHi() {
		return "你好";
	}
	
	

}
