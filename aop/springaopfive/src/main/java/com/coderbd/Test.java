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
 * Create a Pointcut and an Advisor
 * 
 * The Pointcut indicates which method should be intercepted whereas the Advisor
 * groups the Advice and the Pointcut into a single unit, and passes it to a
 * proxy factory object.
 * 
 * There are two types of Pointcuts, the ones that match a method by its name
 * and the ones that match a method using a regular expression pattern. Let’s
 * see how both types of Pointcuts can be used.
 * 
 * 
 * 
 * name match pointcut
 * 
 * In order to create a new Pointcut that will match a method by its name, we
 * have to define it as a bean of NameMatchMethodPointcut type in
 * applicationContext.xml. In its property mappedName, the value to be set is
 * the name of the method that will be intercepted. Here, we will intercept
 * sayHello(String message) method.
 * 
 * We must also define the advisor as a bean of DefaultPointcutAdvisor type,
 * here simpleAdvisor bean. Its properties are pointcut and advice and their
 * values are references to the beans of the advice and the pointcut that will
 * be used.
 * 
 * Finally, in simpleServiceProxy bean we must replace the doAroundMethodBean
 * value of interceptorNames property with the simpleAdvisor.
 */