package com.coderbd.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coderbd.entity.Role;
import com.coderbd.entity.User;
import com.coderbd.repository.RoleRepository;
import com.coderbd.repository.UserRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/regi", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		Iterable<Role> roles= roleRepository.findAll();
		modelAndView.addObject("user", user);
		modelAndView.addObject("roles", roles);
		modelAndView.setViewName("regi");
		return modelAndView;
	}
	Long roleID;
	
	@RequestMapping(value = "/regi", method = RequestMethod.POST)
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userRepository.findByEmail(user.getEmail());
		if (userExists != null) {
			bindingResult
					.rejectValue("email", "error.user",
							"You are already a registered with this email");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("regi");
		} else {
			Role r=new Role();
			r.setId(roleID);
			user.setRole(r);
			user.setActive(1);
			userRepository.save(user);
			modelAndView.addObject("successMessage", "User registration success!!!");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("regi");
			
		}
		return modelAndView;
	}

	public Long getRoleID() {
		return roleID;
	}

	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}
	
	

}
