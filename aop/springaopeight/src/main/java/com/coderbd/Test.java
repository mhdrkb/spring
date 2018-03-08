package com.coderbd;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Rajaul Islam
 *
 */
public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee simpleService = (Employee) context.getBean("simpleServiceBean");
		simpleService.printNameId();
		System.out.println("--------------");
		try{
			simpleService.checkName();
		} catch(Exception e){
			System.out.println("SimpleService: Method checkName() exception thrown..");
		}
		System.out.println("--------------");
		simpleService.sayHello("wow........................");
		context.close();
	}
}
/**
 * AOP auto proxy creators
 * 
 * An interesting feature of Spring is that it provides two auto proxy creators,
 * so that we can create proxies for our beans automatically. 6.1
 * BeanNameAutoProxyCreator
 * 
 * The first auto proxy creator Spring provides is the BeanNameAutoProxyCreator
 * that automatically creates AOP proxies for beans with names matching literal
 * values or wildcards. In order to use it we must define it in
 * applicationContext.xml. This creator exposes two properties for us to
 * configure. The first property is beanNames and its value is a list of regular
 * expressions matching the Spring bean names (ids) to be proxied. The second
 * property is interceptorNames and its value is a list of the advisors (Spring
 * bean ids) that will be used.
 */