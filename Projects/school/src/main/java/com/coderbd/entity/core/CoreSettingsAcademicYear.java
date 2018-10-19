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
@Table(name = "core_setting_academic_year", uniqueConstraints = @UniqueConstraint(columnNames = { "academicYear",
		"instituteID" }) )

public class CoreSettingsAcademicYear {

	@Id
	@Column(name = "academicYearID")
	private String academicYearID;

	@Column(name = "predefineYearID")
	private String predefineYearID;

	@Column(name = "academicYear")
	private String academicYear;

	@Column(name = "startTime")
	@Temporal(TemporalType.DATE)
	private Date startTime;

	@Column(name = "endTime")
	@Temporal(TemporalType.DATE)
	private Date endTime;

	@Column(name = "predefineStatus")
	private int predefineStatus;
	
	@Column(name = "academicYearSerial")
	private int academicYearSerial;

	@Column(name = "academicYearNote")
	private String academicYearNote;

	@Column(name = "instituteID")
	private String instituteID;

	@Column(name = "recordNote")
	private String recordNote;

	@Column(name = "userExecuted")
	private String userExecuted;

	@Column(name = "dateExecuted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;

	@Column(name = "ipExecuted")
	private String ipExecuted;

	@Column(name = "recordStatus")
	private int recordStatus;

	
	/* Mapped CoreSettingAcademic Year to Student Identification 

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "coreSettingsAcademicYear")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StdRegIdentification> stdRegIdentificationList;
	*/
	
 
	
	public CoreSettingsAcademicYear() {

	}

	public CoreSettingsAcademicYear(String academicYearID, String predefineYearID, String academicYear, Date startTime,
			Date endTime, String instituteID, int predefineStatus, int academicYearSerial, String academicYearNote, String recordNote,
			String userExecuted, Date dateExecuted, String ipExecuted, int recordStatus) {

		this.academicYearID = academicYearID;
		this.predefineYearID = predefineYearID;
		this.academicYear = academicYear;
		this.startTime = startTime;
		this.endTime = endTime;
		this.instituteID = instituteID;
		this.predefineStatus = predefineStatus;
		this.academicYearSerial=academicYearSerial;
		this.academicYearNote = academicYearNote;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}



	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
	}

	public String getAcademicYearID() {
		return academicYearID;
	}

	public void setAcademicYearID(String academicYearID) {
		this.academicYearID = academicYearID;
	}

	public String getPredefineYearID() {
		return predefineYearID;
	}

	public void setPredefineYearID(String predefineYearID) {
		this.predefineYearID = predefineYearID;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getPredefineStatus() {
		return predefineStatus;
	}

	public void setPredefineStatus(int predefineStatus) {
		this.predefineStatus = predefineStatus;
	}

	public String getAcademicYearNote() {
		return academicYearNote;
	}

	public void setAcademicYearNote(String academicYearNote) {
		this.academicYearNote = academicYearNote;
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

	public int getAcademicYearSerial() {
		return academicYearSerial;
	}

	public void setAcademicYearSerial(int academicYearSerial) {
		this.academicYearSerial = academicYearSerial;
	}

	

}
