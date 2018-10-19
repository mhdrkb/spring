package com.coderbd.entity.student;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.primefaces.model.UploadedFile;

import com.coderbd.entity.core.CoreSettingClassConfig;
import com.coderbd.entity.core.CoreSettingGroup;
import com.coderbd.entity.core.CoreSettingStudentCategory;


@Entity
@Table(name = "stdreg_identification",uniqueConstraints= @UniqueConstraint(columnNames={"studentID","academicYear","instituteID"}))
public class StdRegIdentification {

	@Id
	@Column(name = "IdentificationID")
	private String IdentificationID;

	@Column(name = "migrationStatus")
	private boolean migrationStatus;

	@Column(name = "studentRoll")
	private int studentRoll;

	@Column(name = "academicYear")
	private String academicYear;
	
	@Column(name = "studentStatus")
	private boolean studentStatus;
	
	@Column(name = "disableDate")
	@Temporal(TemporalType.DATE)
	private Date disableDate;
	
	@Column(name = "disableType")
	private String disableType;
	
	@Column(name = "disableReason")
	private String disableReason;
	
	@Column(name = "disableMonth")
	private String disableMonth;
	
	@Column(name = "disableYear")
	private String disableYear;

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
	
	
	/*@Transient
	private int newroll;*/
	
	@Transient
	private int position;
	
	@Transient
	private boolean check;
	@Transient
	private double totalMark;
	@Transient
	private String letterGrade;
	@Transient
	private String shortCode1="0";
	@Transient
	private String shortCode2="0";
	@Transient
	private String shortCode3="0";
	@Transient
	private String shortCode4="0";
	@Transient
	private UploadedFile uploadedFile;
	@Transient
	private String machineNo;	
	@Transient
	private String machineID;
	@Transient
	private double totalDue;
	
	// @Transient End //
	
	
	

	@ManyToOne
	@JoinColumn(name = "studentID")
	StdRegBasicInfo stdRegBasicInfoIdentification;

	
	

	@ManyToOne
	@JoinColumn(name = "classConfigID")
	private CoreSettingClassConfig coreSettingClassConfig;

	/*
	 * Mapped Group to Student Identification
	 */

	@ManyToOne
	@JoinColumn(name = "groupID")
	private CoreSettingGroup coreSettingCoreSettingGroup;

	/*
	 * Mapped Student Category to Student Identification
	 */

	@ManyToOne
	@JoinColumn(name = "studentCategoryID")
	private CoreSettingStudentCategory coreSettingstdCategory;

	/**
	 * Getter and Setter Methods
	 * 
	 * @return
	 */
	
	
	public CoreSettingClassConfig getCoreSettingClassConfig() {

		if (this.coreSettingClassConfig == null) {
			this.coreSettingClassConfig = new CoreSettingClassConfig();
		}
		return coreSettingClassConfig;
	}

	public String getIdentificationID() {
		return IdentificationID;
	}

	public void setIdentificationID(String identificationID) {
		IdentificationID = identificationID;
	}

	public void setCoreSettingClassConfig(CoreSettingClassConfig coreSettingClassConfig) {
		this.coreSettingClassConfig = coreSettingClassConfig;
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

	public StdRegBasicInfo getStdRegBasicInfoIdentification() {
		return stdRegBasicInfoIdentification;
	}

	public void setStdRegBasicInfoIdentification(StdRegBasicInfo stdRegBasicInfoIdentification) {
		this.stdRegBasicInfoIdentification = stdRegBasicInfoIdentification;
	}

	public CoreSettingGroup getCoreSettingCoreSettingGroup() {
		if (this.coreSettingCoreSettingGroup == null) {
			this.coreSettingCoreSettingGroup = new CoreSettingGroup();
		}
		return coreSettingCoreSettingGroup;
	}

	public void setCoreSettingCoreSettingGroup(CoreSettingGroup coreSettingCoreSettingGroup) {
		this.coreSettingCoreSettingGroup = coreSettingCoreSettingGroup;
	}

	public CoreSettingStudentCategory getCoreSettingstdCategory() {
		if (coreSettingstdCategory == null) {
			coreSettingstdCategory = new CoreSettingStudentCategory();
		}
		return coreSettingstdCategory;
	}

	public void setCoreSettingstdCategory(CoreSettingStudentCategory coreSettingstdCategory) {
		this.coreSettingstdCategory = coreSettingstdCategory;
	}

	public boolean isMigrationStatus() {
		return migrationStatus;
	}

	public void setMigrationStatus(boolean migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	/*public int getNewroll() {
		return newroll;
	}

	public void setNewroll(int newroll) {
		this.newroll = newroll;
	}*/

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public boolean getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(boolean studentStatus) {
		this.studentStatus = studentStatus;
	}

	public double getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(double totalMark) {
		this.totalMark = totalMark;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public String getShortCode1() {
		return shortCode1;
	}

	public void setShortCode1(String shortCode1) {
		this.shortCode1 = shortCode1;
	}

	public String getShortCode2() {
		return shortCode2;
	}

	public void setShortCode2(String shortCode2) {
		this.shortCode2 = shortCode2;
	}

	public String getShortCode3() {
		return shortCode3;
	}

	public void setShortCode3(String shortCode3) {
		this.shortCode3 = shortCode3;
	}

	public String getShortCode4() {
		return shortCode4;
	}

	public void setShortCode4(String shortCode4) {
		this.shortCode4 = shortCode4;
	}

	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	public Date getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(Date disableDate) {
		this.disableDate = disableDate;
	}

	public String getDisableType() {
		return disableType;
	}

	public void setDisableType(String disableType) {
		this.disableType = disableType;
	}

	public String getDisableReason() {
		return disableReason;
	}

	public void setDisableReason(String disableReason) {
		this.disableReason = disableReason;
	}

	public String getDisableMonth() {
		return disableMonth;
	}

	public void setDisableMonth(String disableMonth) {
		this.disableMonth = disableMonth;
	}

	public String getDisableYear() {
		return disableYear;
	}

	public void setDisableYear(String disableYear) {
		this.disableYear = disableYear;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public String getMachineID() {
		return machineID;
	}

	public void setMachineID(String machineID) {
		this.machineID = machineID;
	}

	
	public double getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(double totalDue) {
		this.totalDue = totalDue;
	}
}
