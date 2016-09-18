package com.cbs.springdemo_lifecycle.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbs.springdemo_lifecycle.service.Person;

public class SpringTest {
	
	@Test
	public void test(){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean("chinese",Person.class);
		System.out.println(person.sayHi());
		context.registerShutdownHook();
	}

}
