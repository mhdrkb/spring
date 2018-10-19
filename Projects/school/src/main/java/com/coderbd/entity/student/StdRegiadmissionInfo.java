package com.coderbd.entity.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "stdreg_admissioninfo")
public class StdRegiadmissionInfo {

	
	@Id
	@Column(name="admissionInfoID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long admissionInfoID;
	
	
	
	@Column(name = "admissionDate")
	@Temporal(TemporalType.DATE)
	private Date admissionDate;

	@Column(name = "admissionYear")
	private String admissionYear;

	@Column(name = "admissionCategory")
	private String admissionCategory;

	@Column(name = "leaveDate")
	@Temporal(TemporalType.DATE)
	private Date leaveDate;

	@Column(name = "leaveYear")
	private String leaveYear;

	@Column(name = "leaveReason")
	private String leaveReason;

	@Column(name = "birthCertificate")
	private String birthCertificate;

	@Column(name = "passportNo")
	private String passportNo;

	@Column(name = "testimonialNo")
	private String testimonialNo;

	@Column(name = "tcNo")
	private String tcNo;

	@Column(name = "nationality")
	private String nationality;

	
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

	
	@OneToOne
	@JoinColumn(name = "studentID")
	private StdRegBasicInfo basicInfoAdmission;



	public long getAdmissionInfoID() {
		return admissionInfoID;
	}


	public void setAdmissionInfoID(long admissionInfoID) {
		this.admissionInfoID = admissionInfoID;
	}


	public Date getAdmissionDate() {
		return admissionDate;
	}


	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}


	public String getAdmissionYear() {
		return admissionYear;
	}


	public void setAdmissionYear(String admissionYear) {
		this.admissionYear = admissionYear;
	}


	public String getAdmissionCategory() {
		return admissionCategory;
	}


	public void setAdmissionCategory(String admissionCategory) {
		this.admissionCategory = admissionCategory;
	}


	public Date getLeaveDate() {
		return leaveDate;
	}


	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}


	public String getLeaveYear() {
		return leaveYear;
	}


	public void setLeaveYear(String leaveYear) {
		this.leaveYear = leaveYear;
	}


	public String getLeaveReason() {
		return leaveReason;
	}


	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}


	public String getBirthCertificate() {
		return birthCertificate;
	}


	public void setBirthCertificate(String birthCertificate) {
		this.birthCertificate = birthCertificate;
	}


	public String getPassportNo() {
		return passportNo;
	}


	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}


	public String getTestimonialNo() {
		return testimonialNo;
	}


	public void setTestimonialNo(String testimonialNo) {
		this.testimonialNo = testimonialNo;
	}


	public String getTcNo() {
		return tcNo;
	}


	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
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


	public StdRegBasicInfo getBasicInfoAdmission() {
		return basicInfoAdmission;
	}


	public void setBasicInfoAdmission(StdRegBasicInfo basicInfoAdmission) {
		this.basicInfoAdmission = basicInfoAdmission;
	}

	
	
}
