package com.coderbd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean
	public Employee emplyeeBeen() {
		Employee employee = new Employee(1000, "Ruhul Amin",
				new Address("Mirpur", "Dhaka", "Bangladesh"));
		return employee;
	}

	@Bean
	public Address addressBeen() {
		Address address = new Address("Mirpur", "Dhaka", "Bangladesh");
		return address;
	}
}
