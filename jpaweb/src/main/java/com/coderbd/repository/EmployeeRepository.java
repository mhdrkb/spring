package com.coderbd.repository;

import org.springframework.data.repository.CrudRepository;

import com.coderbd.entity.Employee;
/**
 * 
 * @author Mohmammad Rajaul Islam
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	/**
	 * @note for checking email address already exist!!!
	 * @param email
	 * @return
	 */
	 Employee findByEmail(String email);
}
