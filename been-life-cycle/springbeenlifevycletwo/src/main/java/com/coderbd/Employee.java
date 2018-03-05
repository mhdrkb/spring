package com.coderbd;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * 
 * @author Rajaul Islam
 *
 */
public class Employee implements InitializingBean, DisposableBean{
	
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
	public String toString(){
		return "id "+ id + " and position " + position;
	}

	public void destroy() throws Exception {
		System.out.println("I am in destroy... ");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("I am in afterPropertiesSet... ");
		
	}
}
/**
When a bean implements the InitializingBean interface it is allowed to perform initialization work after 
all necessary properties on the bean have been set by the container. Respectively, when a bean implements
 the DisposableBean interface it can get a callback when the container containing it is destroyed. 
 The InitializingBean interface specifies a single method, afterPropertiesSet(), whereas the DisposableBean
  interface specifies a single method, destroy().
*/