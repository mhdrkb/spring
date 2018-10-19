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
@Table(name="global_designation")
public class GlobalDesignation implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="designationID")
	private String designationID;
	
	@Column(name="designationName",unique=true)
	private String designationName;
	
	@Column (name="preDefineID")
	private String preDefineID;
	
	@Column (name="preDefineStatus")
	private int preDefineStatus;
	
	@Column(name="designationNote")
	private String designationNote;
	
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


	public GlobalDesignation() {
		super();
	}



	public String getDesignationID() {
		return designationID;
	}

	public void setDesignationID(String designationID) {
		this.designationID = designationID;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
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



	public String getDesignationNote() {
		return designationNote;
	}

	public void setDesignationNote(String designationNote) {
		this.designationNote = designationNote;
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
