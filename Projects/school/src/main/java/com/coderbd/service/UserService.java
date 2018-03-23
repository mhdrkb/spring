package com.coderbd.service;
import javax.validation.Valid;

import com.coderbd.entity.User;

public interface UserService {

	public void create(@Valid User user);

	public void update(User user);

	public void delete(User user);

	public Iterable<User> findAll();

	public User findByUsername(String username);

	public User findByEmail(String email);

}
