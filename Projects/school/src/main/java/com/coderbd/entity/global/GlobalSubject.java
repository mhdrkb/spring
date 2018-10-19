package com.coderbd.entity.global;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="global_subject")
public class GlobalSubject {

	
	@Id
	@Column(name="subjectID")
	private String subjectID;
	
	@Column(name="subjectName", unique=true)
	private String subjectName;
	
	@Column (name="preDefineID")
	private String preDefineID;
	
	@Column (name="preDefineStatus")
	private int preDefineStatus;
	
	@Column(name="subjectNote")
	private String subjectNote;
	
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


	public GlobalSubject() {
		super();
	}
	

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	

	public String getPreDefineID() {
		return preDefineID;
	}


	public void setPreDefineID(String preDefineID) {
		this.preDefineID = preDefineID;
	}


	public int getPreDefineStatus() {
		return preDefineStatus;
	}


	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
	}


	public String getSubjectNote() {
		return subjectNote;
	}

	public void setSubjectNote(String subjectNote) {
		this.subjectNote = subjectNote;
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
