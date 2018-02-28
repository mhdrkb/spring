package com.coderbd;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	@Bean
	public SpellChecker spellCheckerbeen() {
		return new SpellChecker();
	}
	
	@Bean
	public TextEditor textEditorbeen() {
		return new TextEditor();
	}
}
