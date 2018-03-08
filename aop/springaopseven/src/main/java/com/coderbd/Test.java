package com.coderbd;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Rajaul Islam
 *
 *
 *         When running the application we can see that the around method advice
 *         whose bean is defined first in simpleServiceProxy is the one that
 *         intercepts the methods first.
 */
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
 * Now, let’s see how the sequence of the values in interceptorNames property of
 * the proxy object can affect the sequence in which the advices intercept the
 * methods. We create a new Around method advice, DoAroundMethod2.java class
 */