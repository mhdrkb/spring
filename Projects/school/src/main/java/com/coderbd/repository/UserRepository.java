package com.coderbd.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderbd.entity.User;
/**
 * 
 * @author Rajaul Islam
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
    public User findByEmail(String email);
    public User findByUsername(String username);
}
