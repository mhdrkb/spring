package com.coderbd;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DoAroundMethod implements MethodInterceptor {
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out
				.println("****SPRING AOP**** DoAroundMethod: Method name : " + methodInvocation.getMethod().getName());
		System.out.println("****SPRING AOP**** DoAroundMethod: Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));
		// same with MethodBeforeAdvice
		System.out.println("****SPRING AOP**** DoAroundMethod: Before method executing!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();
			// same with AfterReturningAdvice
			System.out.println("****SPRING AOP**** DoAroundMethod: After method executing!");
			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("****SPRING AOP**** DoAroundMethod: When method throws Exception!");
			throw e;
		}
	}

}
/**
 * Around Advice
 * 
 * Around advice is the Advice that surrounds a join point such as a method
 * invocation. This is the most powerful kind of advice. Around advice can
 * perform custom behavior before and after the method invocation. It is also
 * responsible for choosing whether to proceed to the join point or to shortcut
 * the advised method execution by returning its own return value or throwing an
 * exception.
 */