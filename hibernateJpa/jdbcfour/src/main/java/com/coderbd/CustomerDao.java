package com.coderbd;

import java.util.List;


public interface CustomerDao {
public int insert(Customer c);
public int update(Customer c);
public int delete(long id);
public Customer findCustomerById(long id);
public List<Customer> findAll();

}
