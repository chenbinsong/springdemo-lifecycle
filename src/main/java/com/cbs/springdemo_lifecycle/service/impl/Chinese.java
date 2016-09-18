package com.cbs.springdemo_lifecycle.service.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.cbs.springdemo_lifecycle.service.Person;

public class Chinese implements Person,InitializingBean,DisposableBean{

	/**
	 * 初始化方法
	 */
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行初始化方法");
	}

	public String sayHi() {
		return "你好";
	}

	/**
	 * 销毁方法
	 */
	public void destroy() throws Exception {
		System.out.println("执行销毁方法");
	}
	
	

}
