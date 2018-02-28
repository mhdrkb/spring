package com.coderbd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	public Student studentBean() {
		
		return new Student();
		
	}
}
