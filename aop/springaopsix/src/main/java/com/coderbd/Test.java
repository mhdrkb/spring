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
 * regex match pointcut
 * 
 * Now, in order to create a pointcut that matches the method to be intercepted
 * with a regular exression, we must define a new bean of
 * RegexpMethodPointcutAdvisor type. The specific type of advisor has two
 * properties. The patterns property holds a list of the patterns that are used
 * for selecting the methods by their names that will be intercepted and applied
 * the advice code. Here, in regexAdvisor we have used the *Hello* pattern, so
 * again the sayHello(String message) method will be intercepted. The advice
 * property holds a reference to the bean of the advice.
 */