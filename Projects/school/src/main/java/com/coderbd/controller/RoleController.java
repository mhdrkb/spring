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

import com.coderbd.entity.UserRole;
import com.coderbd.service.RoleService;


@ManagedBean
@Component(value = "roleMB")
@ViewScoped
public class RoleController {

	@Autowired
	private RoleService roleService;
	private UserRole bean;
	private UserRole beanSelected;
	private Iterable<UserRole> list;
	private Iterable<UserRole> listSelected;

	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new UserRole();
		this.beanSelected = new UserRole();
		this.list = new ArrayList<UserRole>();
		this.listSelected = new ArrayList<UserRole>();
		try {
			list=roleService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String insert() {
		System.out.println("Sami............"+bean.getRoleName());
		try {
			if (bean != null) {
				roleService.create(bean);
				reset();
				refreshList();
			}
			notificationSuccess("Insert Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}

	public String update() {
		try {
			if (beanSelected != null) {
				roleService.update(beanSelected);
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
				roleService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	


	public UserRole getBean() {
		if(bean == null ) {
			bean=new UserRole();
		}
		return bean;
	}
	public void setBean(UserRole bean) {
		this.bean = bean;
	}
	public UserRole getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new UserRole();
		}
		return beanSelected;
	}

	public void setBeanSelected(UserRole beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<UserRole> getList() {
		list=roleService.findAll();
		return list;
	}

	public void setList(Iterable<UserRole> list) {
		this.list = list;
	}

	public Iterable<UserRole> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<UserRole> listSelected) {
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

}
