package com.coderbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class JdbcfourApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(JdbcfourApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JdbcfourApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	private CustomerDaoImpl customerDao;

	@Override
	public void run(String... strings) throws Exception {


		// Insert data into customers table
		Customer cus = new Customer();
		cus.setFirst_name("Atik");
		cus.setLast_name("Hasan");
		log.info("data insert");
		customerDao.insert(cus);
		log.info("data update");
		Customer cus2 = new Customer();
		cus2.setFirst_name("KKK");
		cus2.setLast_name("GK");
		cus2.setId(26);
		customerDao.update(cus2);

		log.info("data delete id 31");
		customerDao.delete(38);
		log.info("Customer by id 26");
		Customer customer = customerDao.findCustomerById(26);
		System.out.println(customer);

		log.info("Customers List");
		List<Customer> list = customerDao.findAll();
		for (Customer cuss : list) {
			System.out.println(cuss);
		}
	
	}
}
