package com.coderbd.entity.global;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="global_class")
public class GlobalClass implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name="classID")
	private String classID;

	@Column(name="predefineClassID")
	private String predefineClassID;
	
	
	@Column(name="className",unique=true)
	private String className;
	
	@Column(name="classNote")
	private String classNote;
	
	@Column(name="predefineStatus")
	private int predefineStatus;
	
	@Column(name="recordNote")
	private String recordNote;
	
	@Column(name="userExecuted")
	private String userExecuted;
	
	@Column(name="dateExecuted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;
	
	@Column(name="ipExecuted")
	private String ipExecuted;
	
	@Column(name="recordStatus")
	private int recordStatus;
	

	public GlobalClass() {
		super();
	}
	
	

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}







	public String getPredefineClassID() {
		return predefineClassID;
	}


	public void setPredefineClassID(String predefineClassID) {
		this.predefineClassID = predefineClassID;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getClassNote() {
		return classNote;
	}


	public void setClassNote(String classNote) {
		this.classNote = classNote;
	}


	public int getPredefineStatus() {
		return predefineStatus;
	}


	public void setPredefineStatus(int predefineStatus) {
		this.predefineStatus = predefineStatus;
	}


	public String getRecordNote() {
		return recordNote;
	}


	public void setRecordNote(String recordNote) {
		this.recordNote = recordNote;
	}


	public String getUserExecuted() {
		return userExecuted;
	}


	public void setUserExecuted(String userExecuted) {
		this.userExecuted = userExecuted;
	}


	public Date getDateExecuted() {
		return dateExecuted;
	}


	public void setDateExecuted(Date dateExecuted) {
		this.dateExecuted = dateExecuted;
	}


	public String getIpExecuted() {
		return ipExecuted;
	}


	public void setIpExecuted(String ipExecuted) {
		this.ipExecuted = ipExecuted;
	}


	public int getRecordStatus() {
		return recordStatus;
	}


	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}
	

	
}
