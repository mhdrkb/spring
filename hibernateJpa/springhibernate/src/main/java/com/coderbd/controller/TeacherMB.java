package com.coderbd.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coderbd.dao.TeacherDAO;
import com.coderbd.domain.Teacher;



@ManagedBean
@ViewScoped
@Component(value = "teacherMB")
public class TeacherMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private TeacherDAO teacherDAO;

	private Teacher bean;
	private Teacher beanSelected;
	private List<Teacher> list;
	private List<Teacher> listSelected;

	@PostConstruct
	public void init() {
		refreshList();
	}

	public void refreshList() {
		this.bean = new Teacher();
		this.beanSelected = new Teacher();
		this.list = new ArrayList<Teacher>();
		this.listSelected = new ArrayList<Teacher>();
		try {
			this.list.addAll(teacherDAO.findAll());
			this.listSelected.addAll(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void save() {
		try {
		    
			teacherDAO.persist(this.bean);
			refreshList();
			notificationSuccess("persist item");
		} catch (Exception e) {
			notificationError(e,"persist item");
			e.printStackTrace();
		}
	}

	public void update() {
		try {
			teacherDAO.merge(this.beanSelected);
			refreshList();
			notificationSuccess("update item");
		} catch (Exception e) {
			notificationError(e,"update item");
		}
	}

	public void delete() {
		try {
			teacherDAO.remove(this.beanSelected.getId());
			refreshList();
			notificationSuccess("delete item");
		} catch (Exception e) {
			notificationError(e,"delete item");
		}
	}

	public void onCancel(RowEditEvent event) {
		refreshList();
	}

	
	public void reset() {
		refreshList();
        RequestContext.getCurrentInstance().reset("form1:panel");  
	}

	
	public void notificationSuccess(String operation) {
		Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Operation "+operation+" success");
		FacesMessage msg = null;  
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Notification", "Success"); 
		FacesContext.getCurrentInstance().addMessage(null, msg);  
	}


	public void notificationError(Exception e, String operation) {
		Logger.getLogger(this.getClass().getName()).log(Level.ERROR, "Operation "+operation+" Error ",e);
		FacesMessage msg = null;  
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Notification", "Une erreur est survenue");  
		FacesContext.getCurrentInstance().addMessage(null, msg);  
	}

	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}

	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}

	public Teacher getBean() {
		return bean;
	}

	public void setBean(Teacher bean) {
		this.bean = bean;
	}

	public Teacher getBeanSelected() {
		return beanSelected;
	}

	public void setBeanSelected(Teacher beanSelected) {
		this.beanSelected = beanSelected;
	}

	public List<Teacher> getList() {
		return list;
	}

	public void setList(List<Teacher> list) {
		this.list = list;
	}

	public List<Teacher> getListSelected() {
		return listSelected;
	}

	public void setListSelected(List<Teacher> listSelected) {
		this.listSelected = listSelected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
