package com.coderbd;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 
 * @author Rajaul Islam
 *
 */
/**
 * Before Advice executes before a method execution, but does not have the
 * ability to prevent execution flow proceeding to the method execution (unless
 * it throws an exception). The class that implements it is the one below:
 *
 */
public class DoBeforeMethod implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("****SPRING AOP**** DoBeforeMethod : Executing before method!");
	}
}
/**
 * The advice bean must be defined in Spring configuration file. In addition, a
 * proxy object must be created, of ProxyFactoryBean type. The proxy bean has a
 * target property. Its value is a reference to the bean whose methods will be
 * intercepted. It also has an interceptorNames property. The property value is
 * a list of bean names that represent the advices that will be applied on this
 * proxy /target object.
 */