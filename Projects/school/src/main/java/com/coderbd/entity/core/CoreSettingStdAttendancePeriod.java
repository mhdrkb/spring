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
@Table (name="stdattendance_period",uniqueConstraints= @UniqueConstraint(columnNames={"periodName","instituteID"}))
public class CoreSettingStdAttendancePeriod {

	@Id
	@Column(name = "periodID")
	private String periodID;

	@Column(name = "predefineID")
	private String predefineID;

	@Column(name = "periodName")
	private String periodName;

	@Column(name = "periodNote")
	private String periodNote;

	@Column(name = "predefineStatus")
	private String predefineStatus;
	
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

	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "coreSettingStdAttendancePeriodobj")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StudentAbsentInfo> corePeriodStudentAbsentInfoList;*/
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "absentSummaryInfoperiodobj")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StudentAttendanceSummaryInfo> corePeriodStudentAttendanceSummaryInfoList;*/
	
	public CoreSettingStdAttendancePeriod() {
		
	}

	public CoreSettingStdAttendancePeriod(String periodID, String predefineID, String periodName, String periodNote,
			String predefineStatus, String instituteID, String recordNote, String userExecuted, Date dateExecuted,
			String ipExecuted, int recordStatus) {
		
		this.periodID = periodID;
		this.predefineID = predefineID;
		this.periodName = periodName;
		this.periodNote = periodNote;
		this.predefineStatus = predefineStatus;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}

	public String getPeriodID() {
		return periodID;
	}

	public void setPeriodID(String periodID) {
		this.periodID = periodID;
	}

	public String getPredefineID() {
		return predefineID;
	}

	public void setPredefineID(String predefineID) {
		this.predefineID = predefineID;
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

	public String getPredefineStatus() {
		return predefineStatus;
	}

	public void setPredefineStatus(String predefineStatus) {
		this.predefineStatus = predefineStatus;
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

/*	public Set<StudentAbsentInfo> getCorePeriodStudentAbsentInfoList() {
		return corePeriodStudentAbsentInfoList;
	}

	public void setCorePeriodStudentAbsentInfoList(Set<StudentAbsentInfo> corePeriodStudentAbsentInfoList) {
		this.corePeriodStudentAbsentInfoList = corePeriodStudentAbsentInfoList;
	}

	public Set<StudentAttendanceSummaryInfo> getCorePeriodStudentAttendanceSummaryInfoList() {
		return corePeriodStudentAttendanceSummaryInfoList;
	}

	public void setCorePeriodStudentAttendanceSummaryInfoList(
			Set<StudentAttendanceSummaryInfo> corePeriodStudentAttendanceSummaryInfoList) {
		this.corePeriodStudentAttendanceSummaryInfoList = corePeriodStudentAttendanceSummaryInfoList;
	}*/

}
