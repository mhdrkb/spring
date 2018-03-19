package com.coderbd.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderbd.entity.User;

/** 
 * This is the Data Access layer. Simple huh?
 * PLease note that no need for any dao implementation. This is an interface!
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
    
}
