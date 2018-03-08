package com.coderbd;

import org.springframework.aop.ThrowsAdvice;

public class DoAfterThrowingExceptionMethod implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out
				.println("****SPRING AOP**** DoAfterThrowingExceptionMethod : Executing when method throws exception!");
	}
}
/**
 * After throwing Advice is the Advice to be executed if a method exits by
 * throwing an exception. 
 */
