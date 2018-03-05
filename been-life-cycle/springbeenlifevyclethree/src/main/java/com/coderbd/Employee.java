package com.coderbd;

/**
 * 
 * @author Rajail Islam
 *
 */

public class Employee {

	private Long id;

	private String position;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "id " + id + " and position " + position;
	}

	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + id + " " + position);
	}

	public void cleanUp() throws Exception {
		System.out.println("Spring Clean Up! Employee is cleaned up now.");
	}
}
/**
 * Another easy way for initialization and destroy method callbacks without the
 * use of Spring-specific InitializingBean and DisposableBean callback
 * interfaces, is to write methods with names such as init(), initialize(),
 * dispose(), and so on inside the bean. Then the Spring container can be
 * configured to look for these initialization and destroy callback method names
 * on the bean. In order to do so, it needs to find the init-method and
 * destroy-method elements inside the bean definition. Thus, the named callback
 * methods will be invoked.
 * 
 * The Employee bean now has two methods, initIt() and cleanUp() that print a
 * message.
 */