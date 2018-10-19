package com.coderbd.entity.hr;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="stffatt_temp_importdata")
public class StaffAttentTempImportData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tempID")
	private int tempID;
	
	@Column(name="staffID")
	private String staffID;
	
	@Column(name="punchDate")
	@Temporal(TemporalType.DATE)
	private Date punchDate;
	
	@Column(name="punchTime")
	@Temporal(TemporalType.TIME)
	private Date punchTime;
	
	@Column(name="attDayName")
	private String attDayName;
	
	@Column(name="attMonth")
	private String attMonth;
	
	@Column(name="attYear")
	private String attYear;
	
	@Column(name="punchMode")
	private String punchMode;
	
	@Column(name="machineID")
	private String machineID;
	
	@Column(name="instituteID")
	private String instituteID;
	
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

	@Transient
	private String punchInStatus;
	
	@Transient
	private String staffName;
	
	@Transient
	private String staffdesignation;
	
	public int getTempID() {
		return tempID;
	}

	public void setTempID(int tempID) {
		this.tempID = tempID;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public Date getPunchDate() {
		return punchDate;
	}

	public void setPunchDate(Date punchDate) {
		this.punchDate = punchDate;
	}

	public Date getPunchTime() {
		return punchTime;
	}

	public void setPunchTime(Date punchTime) {
		this.punchTime = punchTime;
	}

	public String getPunchMode() {
		return punchMode;
	}

	public void setPunchMode(String punchMode) {
		this.punchMode = punchMode;
	}

	public String getMachineID() {
		return machineID;
	}

	public void setMachineID(String machineID) {
		this.machineID = machineID;
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

	public String getAttDayName() {
		return attDayName;
	}

	public void setAttDayName(String attDayName) {
		this.attDayName = attDayName;
	}

	public String getAttMonth() {
		return attMonth;
	}

	public void setAttMonth(String attMonth) {
		this.attMonth = attMonth;
	}

	public String getAttYear() {
		return attYear;
	}

	public void setAttYear(String attYear) {
		this.attYear = attYear;
	}

	public String getPunchInStatus() {
		return punchInStatus;
	}

	public void setPunchInStatus(String punchInStatus) {
		this.punchInStatus = punchInStatus;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffdesignation() {
		return staffdesignation;
	}

	public void setStaffdesignation(String staffdesignation) {
		this.staffdesignation = staffdesignation;
	}
	
	
}
