package com.coderbd.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coderbd.entity.User;
import com.coderbd.service.UserService;

@ManagedBean
@Component(value = "studentMB")
@ViewScoped
public class UserController {

	@Autowired
	private UserService userService;
	private User bean;
	private User beanSelected;
	private Iterable<User> list;
	private Iterable<User> listSelected;

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
		try {
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
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Notification", "Success");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void notificationError(Exception e, String operation) {
		FacesMessage msg = null;
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Notification", "Error");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
