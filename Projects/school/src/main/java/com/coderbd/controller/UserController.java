package com.coderbd.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Component;

import com.coderbd.entity.User;
import com.coderbd.entity.UserRole;
import com.coderbd.service.UserService;

@ManagedBean
@Component(value = "userMB")
@ViewScoped
public class UserController {

	@Autowired
	private UserService userService;
	private User bean;
	private User beanSelected;
	private Iterable<User> list;
	private Iterable<User> listSelected;
	
	private List<String> roles;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new User();
		this.beanSelected = new User();
		this.list = new ArrayList<User>();
		this.listSelected = new ArrayList<User>();
		try {
			list=userService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String insert() {
		List<UserRole> userroles=new ArrayList();


		
		for(String role : roles ) {
			userroles.add(new UserRole(Long.parseLong(role)));
		}
		
		bean.setUserRoles(userroles);
		bean.setPassword(passwordEncoder.encode(bean.getPassword()));
		
		try {
			bean.setEnabled(true);
			
			if (bean != null) {
				userService.create(bean);
				reset();
				refreshList();
			}
			//notificationSuccess("Insert Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}

	public String update() {
		try {
			if (beanSelected != null) {
				userService.update(beanSelected);
				refreshList();
			}
			notificationSuccess("Update Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}

	public String delete() {
		try {
			if (beanSelected != null) {
				userService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	

	public User getBean() {
		if(bean == null ) {
			bean =new User();
		}
		return bean;
	}

	public void setBean(User bean) {
		this.bean = bean;
	}

	public User getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new User();
		}
		return beanSelected;
	}

	public void setBeanSelected(User beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<User> getList() {
		list=userService.findAll();
		return list;
	}

	public void setList(Iterable<User> list) {
		this.list = list;
	}

	public Iterable<User> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<User> listSelected) {
		this.listSelected = listSelected;
	}

	public void reset() {

		RequestContext.getCurrentInstance().reset("form1:panel");
	}

	public void notificationSuccess(String operation) {
		FacesMessage msg = null;
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, operation, "Success");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void notificationError(Exception e, String operation) {
		FacesMessage msg = null;
		msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, operation, "Error");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
