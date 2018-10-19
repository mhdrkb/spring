package com.coderbd.entity.core;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name ="core_setting_std_category",uniqueConstraints= @UniqueConstraint(columnNames={"studentCategoryName", "instituteID"}))
public class CoreSettingStudentCategory {

	@Id
	@Column (name="studentCategoryID")
	private String studentCategoryID;
	
	@Column (name="studentCategoryName")
	private String studentCategoryName;
	
	@Column (name="preDefineID")
	private String preDefineID;
	
	@Column (name="preDefineStatus")
	private int preDefineStatus;
	
	@Column (name="studentCategoryNote")
	private String studentCategoryNote;
	
	@Column (name="stdCategorySerial")
	private int stdCategorySerial;
	
	@Column(name = "instituteID")
	private String instituteID;
	
	@Column (name="recordNote")
	private String recordNote;
	
	@Column (name="userExecued")
	private String userExecued;
	
	@Column (name="dateExecuted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;
	
	@Column (name="ipExecuted")
	private String ipExecuted;
	
	@Column (name="recordStatus")
	private int recordStatus;

	/* Mapped CoreSettingStudent Category to Student Identification */

	
	public CoreSettingStudentCategory() {
		
	}

	public CoreSettingStudentCategory(String studentCategoryID, String studentCategoryName, String preDefineID,
			int preDefineStatus, String studentCategoryNote, String instituteID, String recordNote, String userExecued,
			Date dateExecuted, String ipExecuted, int recordStatus,int stdCategorySerial) {
		super();
		this.studentCategoryID = studentCategoryID;
		this.studentCategoryName = studentCategoryName;
		this.preDefineID = preDefineID;
		this.preDefineStatus = preDefineStatus;
		this.studentCategoryNote = studentCategoryNote;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecued = userExecued;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.stdCategorySerial =stdCategorySerial;
	}

	

	public String getStudentCategoryID() {
		return studentCategoryID;
	}

	public void setStudentCategoryID(String studentCategoryID) {
		this.studentCategoryID = studentCategoryID;
	}

	public String getStudentCategoryName() {
		return studentCategoryName;
	}

	public void setStudentCategoryName(String studentCategoryName) {
		this.studentCategoryName = studentCategoryName;
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

	public String getStudentCategoryNote() {
		return studentCategoryNote;
	}

	public void setStudentCategoryNote(String studentCategoryNote) {
		this.studentCategoryNote = studentCategoryNote;
	}

	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
	}

	public String getRecordNote() {
		return recordNote;
	}

	public void setRecordNote(String recordNote) {
		this.recordNote = recordNote;
	}

	public String getUserExecued() {
		return userExecued;
	}

	public void setUserExecued(String userExecued) {
		this.userExecued = userExecued;
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

	public int getStdCategorySerial() {
		return stdCategorySerial;
	}

	public void setStdCategorySerial(int stdCategorySerial) {
		this.stdCategorySerial = stdCategorySerial;
	}

	
	
	
}
