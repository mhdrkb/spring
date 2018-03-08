package com.coderbd;

/**
 * 
 * @author Rajaul Islam
 *
 */
public class Employee {

	private String name;

	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printNameId() {
		System.out.println("SimpleService : Method printNameId() : My name is " + name + " and my id is " + id);
	}

	public void checkName() {
		if (name.length() < 20) {
			throw new IllegalArgumentException();
		}
	}

	public void sayHello(String message) {
		System.out.println("SimpleService : Method sayHello() : Hello! " + message);
	}
}
/**
 * Create an Advice
 * 
 * In AOP the Advice is an action taken before or after a method execution.
 * There are different types of advice, such as “around,” “before” and “after”
 * advice. Below we introduce all types of advice and create an example for each
 * one of them.
 * 
 * Employee.java class is the class whose methods will be intercepted by
 * the advices we will create.
 */