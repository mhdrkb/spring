package com.coderbd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coderbd.MyAwareService;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		ctx.getBean("myAwareService", MyAwareService.class);

		ctx.close();
	}

}