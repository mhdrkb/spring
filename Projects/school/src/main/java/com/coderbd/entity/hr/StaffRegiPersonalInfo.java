package com.coderbd.entity.hr;

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
@Table(name="staffregi_personalinfo")
public class StaffRegiPersonalInfo {

	@Id
	@Column(name="personalInfoID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personalInfoID;
	
	@Column(name="fatherName")
	private String fatherName;
	
	@Column(name="motherName")
	private String motherName;
	
	@Column(name="meritalStatus")
	private String meritalStatus;
	
	@Column(name="marriageDate")
	@Temporal(TemporalType.DATE)
	private Date marriageDate;
	
	@Column(name="spouseName")
	private String spouseName;
	
	@Column(name="child")
	private String child;
	
	@Column(name="bloodGroup")
	private String bloodGroup;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="nationalID")
	private String nationalID;
	
	@Column(name="passportNo")
	private String passportNo;
	
	@Column(name="tinNo")
	private String tinNo;
	
	@Column(name="mpoID")
	private String mpoID;
	
	@Column(name="indexNo")
	private String indexNo;
	
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
	
	@OneToOne
	@JoinColumn(name="staffID")
	private StaffRegiBasicInfo basicInfoPerson;
	
	
	public int getPersonalInfoID() {
		return personalInfoID;
	}
	public void setPersonalInfoID(int personalInfoID) {
		this.personalInfoID = personalInfoID;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMeritalStatus() {
		return meritalStatus;
	}
	public void setMeritalStatus(String meritalStatus) {
		this.meritalStatus = meritalStatus;
	}
	public Date getMarriageDate() {
		return marriageDate;
	}
	public void setMarriageDate(Date marriageDate) {
		this.marriageDate = marriageDate;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getChild() {
		return child;
	}
	public void setChild(String child) {
		this.child = child;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getTinNo() {
		return tinNo;
	}
	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}
	public String getMpoID() {
		return mpoID;
	}
	public void setMpoID(String mpoID) {
		this.mpoID = mpoID;
	}
	public String getIndexNo() {
		return indexNo;
	}
	public void setIndexNo(String indexNo) {
		this.indexNo = indexNo;
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
	public StaffRegiBasicInfo getBasicInfoPerson() {
		return basicInfoPerson;
	}
	public void setBasicInfoPerson(StaffRegiBasicInfo basicInfoPerson) {
		this.basicInfoPerson = basicInfoPerson;
	}
	
	
}
