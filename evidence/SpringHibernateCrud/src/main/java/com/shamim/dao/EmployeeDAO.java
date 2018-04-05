package com.shamim.dao;

import java.util.List;

import com.shamim.model.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(int employeeid);
	
	public Employee updateEmployee(Employee employee);
}