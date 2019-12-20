package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;

public class lifeCycleClass {
public static void main(String[] args) {
//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Hello hello = context.getBean(Hello.class);
	System.out.println(hello.getMsg());
	context.close();
	
	
}
}
