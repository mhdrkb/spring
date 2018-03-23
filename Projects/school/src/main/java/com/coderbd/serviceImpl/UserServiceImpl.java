package com.coderbd.serviceImpl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import com.coderbd.entity.User;
import com.coderbd.repository.UserRepository;
import com.coderbd.service.UserService;

@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService {
	final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void create(@Valid User user) {
		User userExists = userRepository.findByUsername(user.getEmail());
		if (userExists != null) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "User Already Exist!", null));
		}
		if (user != null) {
			userRepository.saveAndFlush(user);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Successfully Saved!", null));
		}
	}

	@Override
	public void update(User user) {
		userRepository.saveAndFlush(user);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
