package com.coderbd.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderbd.entity.UserRole;
/**
 * 
 * @author Rajaul Islam
 *
 */

@Repository
public interface RoleRepository extends JpaRepository<UserRole, Long> {
	
    public UserRole findByRoleName(String roleName);
}
