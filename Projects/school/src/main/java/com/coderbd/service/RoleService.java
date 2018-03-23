package com.coderbd.service;
import com.coderbd.entity.UserRole;

public interface RoleService {

	public void create(UserRole userRole);

	public void update(UserRole userRole);

	public void delete(UserRole userRole);

	public Iterable<UserRole> findAll();

	
	public UserRole findByRoleName(String roleName);

}
