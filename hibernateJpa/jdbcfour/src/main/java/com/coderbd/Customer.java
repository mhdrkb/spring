package com.coderbd;

public class Customer {
	private long id;
	private String first_name;
	private String last_name;

	

	public Customer() {
		super();
	}



	public Customer(long id, String first_name, String last_name) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}

	

}
