package com.coderbd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean
	public Employee obj() {
		Employee employee = new Employee();
		employee.setId(1000);
		employee.setName("Shabib");
		employee.setCity("Dhaka");
		return employee;
	}
}
