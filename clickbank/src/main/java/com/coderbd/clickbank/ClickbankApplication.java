package com.coderbd.clickbank;

import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import java.util.List;

@SpringBootApplication
public class ClickbankApplication {
	private static final Logger log = LoggerFactory.getLogger(ClickbankApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ClickbankApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
            HttpHeaders httpHeaders=new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_XML);
            httpHeaders.add("Authorization","DEV-3CCV43C886S74U4Q38U2OQRCC3TJ8NI0");
         	List<Product> product =restTemplate.exchange("https://api.clickbank.com/rest/1.3/products/1.3/products/schema", HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
            }).getBody();
		  log.info(product.toString());
		};
	}
}
