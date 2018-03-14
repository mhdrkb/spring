package com.coderbd.repository;



import org.springframework.data.repository.CrudRepository;

import com.coderbd.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	 User findByEmail(String email);
}
