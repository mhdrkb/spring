package com.coderbd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/**
 * 
 * @author Rajaul Islam
 *
 */
@SpringBootApplication
public class JpaoneApplication {
	private static final Logger log = LoggerFactory.getLogger(JpaoneApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JpaoneApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Ruhul", "Amin"));
			repository.save(new Customer("Shabib", "Hasan"));
			repository.save(new Customer("Parvez", "Amin"));
			repository.save(new Customer("Urmi", "Akter"));
			repository.save(new Customer("fahmida", "Akter"));
			repository.save(new Customer("Atikur", "Rahman"));
			repository.save(new Customer("Shamim", "Sarkar"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer c=repository.findOne(1L);
			System.out.println(c);

			// fetch customers by last name
			log.info("Customer found with findByLastName('Amin'):");
			log.info("--------------------------------------------");
		
		for (Customer bauer : repository.findByLastName("Amin")) {
			log.info(bauer.toString());
			 }
			log.info("");
		};
	}
}
