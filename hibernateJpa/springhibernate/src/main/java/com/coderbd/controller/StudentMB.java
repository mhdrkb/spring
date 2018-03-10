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

import com.coderbd.dao.StudentDAO;
import com.coderbd.domain.Student;


@ManagedBean
@Component(value="studentMB")
@ViewScoped
public class StudentMB implements Serializable {


	private static final long serialVersionUID = 1L;

	@Autowired
	private StudentDAO studentDao;

	private Student bean;
	private Student beanSelected;
	private List<Student> list;
	private List<Student> listSelected;
	
	@PostConstruct
    public void init() {
		refreshList();
    }

	public void refreshList() {
		this.bean = new Student();
		this.beanSelected = new Student();
		this.list = new ArrayList<Student>();
		this.listSelected = new ArrayList<Student>();
		try {
			this.list.addAll(studentDao.findAll());
			this.listSelected.addAll(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void save() {
		try {
		    
			studentDao.persist(this.bean);
			refreshList();
			notificationSuccess("persist item");
		} catch (Exception e) {
			notificationError(e,"persist item");
			e.printStackTrace();
		}
	}

	public void update() {
		try {
			studentDao.merge(this.beanSelected);
			refreshList();
			notificationSuccess("update item");
		} catch (Exception e) {
			notificationError(e,"update item");
		}
	}

	public void delete() {
		try {
			studentDao.remove(this.beanSelected.getId());
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
	
	

	public List<Student> getList() {
		if(list == null){
			list = new ArrayList<Student>();
		}
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public List<Student> getListSelected() {
		return listSelected;
	}

	public void setListSelected(List<Student> listSelected) {
		this.listSelected = listSelected;
	}

	public StudentDAO getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}

	public Student getBean() {
		return bean;
	}

	public void setBean(Student bean) {
		this.bean = bean;
	}

	public Student getBeanSelected() {
		return beanSelected;
	}

	public void setBeanSelected(Student beanSelected) {
		this.beanSelected = beanSelected;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
