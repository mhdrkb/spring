package com.coderbd.controller;

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
public class RoleController {

		
	@Autowired
	private RoleRepository roleRepository;


	@RequestMapping(value = "/role", method = RequestMethod.GET)
	public ModelAndView role() {
		ModelAndView modelAndView = new ModelAndView();
		Role role = new Role();
		modelAndView.addObject("role", role);
		Iterable<Role> roles= roleRepository.findAll();
		modelAndView.addObject("roles", roles);
		modelAndView.setViewName("role");
		return modelAndView;
	}

	@RequestMapping(value = "/role", method = RequestMethod.POST)
	public ModelAndView createNewRole(@Valid Role role, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Role roleExists = roleRepository.findByRoleName(role.getRoleName());
		if (roleExists != null) {
			bindingResult.rejectValue("roleName", "error.role", "Role already exist!!!");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("role");
		} else {
			roleRepository.save(role);
			modelAndView.addObject("successMessage", "Role Entry success!!!");
			modelAndView.addObject("role", new Role());
			modelAndView.setViewName("role");

		}
		return modelAndView;
	}

}
