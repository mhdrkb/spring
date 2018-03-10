package com.coderbd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	
	private DataSource datasource;
	
	
	
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public int insert(Customer c) {
		return jdbcTemplate
				.update("insert into customers(first_name, last_name) values('"+c.getFirst_name()+"','"+c.getLast_name()+"')");
	}

	@Override
	public int update(Customer c) {
		return jdbcTemplate
				.update("update customers set first_name='"+c.getFirst_name()+"', last_name='"+c.getLast_name()+"' where id="+c.getId()+"");
	}

	@Override
	public int delete(long id) {
		String sql="delete from customers where id="+id+"";
		return jdbcTemplate.update(sql);
	}

	@Override
	public Customer findCustomerById(long id) {
		String sql="select * from customers where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Customer>(Customer.class));
	}

	@Override
	public List<Customer> findAll() {
		return jdbcTemplate.query("select * from customers",new RowMapper<Customer>(){
			public Customer mapRow(ResultSet rs, int row) throws SQLException {
				Customer c=new Customer();
				c.setId(rs.getInt(1));
				c.setFirst_name(rs.getString(2));
				c.setLast_name(rs.getString(3));
			  return c;
			}
		});
	}

	

}
