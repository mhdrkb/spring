package com.coderbd.repository;

import org.springframework.data.repository.CrudRepository;

import com.coderbd.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
	Role findByRoleName(String roleName);

}
