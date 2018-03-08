package com.coderbd;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Rajaul Islam
 *
 *
 * 
 */
public class Test {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee simpleService = (Employee) context.getBean("simpleServiceBean");
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
 * DefaultAdvisorAutoProxyCreator
 * 
 * The second auto proxy creator Spring provides is the
 * DefaultAdvisorAutoProxyCreator that automatically applies advisors in the
 * current applicationContext.xml, without the need to include specific bean
 * names in the auto-proxy advisor’s bean definition. In order to use it we must
 * specify a DefaultAdvisorAutoProxyCreator bean definition in
 * applicationContext.xml. Then we must specify any number of advisors in the
 * same or related configuration files. The DefaultAdvisorAutoProxyCreator will
 * automatically evaluate the pointcut contained in each advisor, to see what
 * (if any) advice it should apply to each object.
 */