package com.coderbd.service;


import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.coderbd.entity.User;
import com.coderbd.repository.UserRepository;




@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public void add(User user) {
		userRepository.saveAndFlush(user);
	}
	

	public void updateUser(User user) {
		userRepository.saveAndFlush(user);
	}
	
	@Transactional
	public void del(Long id) {
		userRepository.deleteById(id);
	}
	@Transactional(readOnly=true)
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@Transactional
	public void addAll(Collection<User> users) {
		for (User user : users) {
			userRepository.save(user);
		}
	}

}
