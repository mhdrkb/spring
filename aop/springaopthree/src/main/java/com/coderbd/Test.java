package com.coderbd;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee simpleService = (Employee) context.getBean("simpleServiceProxy");
		simpleService.printNameId();
		System.out.println("--------------");
		try {
			simpleService.checkName();
		} catch (Exception e) {
			System.out.println("Employee: Method checkName() exception thrown..");
		}
		System.out.println("--------------");
		simpleService.sayHello("Wow....................");
		context.close();
	}
}
/**
 * Now, after running App.java class again we can see that the
 * afterReturning(Object returnValue, Method method, Object[] args, Object
 * target) method of DoAfterReturningMethod advice is executed after the
 * simpleService‘s methods’ execution. Note that since checkName() method throws
 * an exception and does not return normally, it is not being intercepted by
 * DoAfterReturningMethod.
 */