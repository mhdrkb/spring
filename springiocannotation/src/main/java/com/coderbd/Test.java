package com.coderbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String [] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student std = ctx.getBean(Student.class);
		std.setName("Shamim..........");
		//std.getName();
		System.out.println(std);
	}
}