package com.coderbd.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coderbd.service.UserService;


public class UserRegistration {
	@Autowired
	private UserService userService;
	
	
}
