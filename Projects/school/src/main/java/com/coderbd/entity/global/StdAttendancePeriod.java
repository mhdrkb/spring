package com.coderbd.entity.global;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="global_std_attendance_period")
public class StdAttendancePeriod {

	@Id
	@Column(name="periodID")
	private String periodID;
	
	@Column(name="predefineID")
	private String predefineID;
	
	@Column(name="periodName", unique=true)
	private String periodName;
	
	
	@Column(name="periodNote")
	private String periodNote;
	
	@Column(name="predefineStatus")
	private String predefineStatus;
	
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

	
	
	public StdAttendancePeriod() {
	
	}

	public String getPeriodID() {
		return periodID;
	}

	public void setPeriodID(String periodID) {
		this.periodID = periodID;
	}

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	public String getPeriodNote() {
		return periodNote;
	}

	public void setPeriodNote(String periodNote) {
		this.periodNote = periodNote;
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

	public String getPredefineID() {
		return predefineID;
	}

	public void setPredefineID(String predefineID) {
		this.predefineID = predefineID;
	}

	public String getPredefineStatus() {
		return predefineStatus;
	}

	public void setPredefineStatus(String predefineStatus) {
		this.predefineStatus = predefineStatus;
	}
	
	
}
