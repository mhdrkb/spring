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
@Table(name="staffregi_othersinfo")
public class StaffRegiOthersInfo {

	@Id
	@Column(name="othersInfoID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int othersInfoID;
	
	@Column(name="specialization")
	private String specialization;
	
	@Column(name="description")
	private String description;
	
	@Column(name="extraCurriculam")
	private String extraCurriculam;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="language")
	private String language;
	
	@Column(name="specialNote")
	private String specialNote;
	
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
	private StaffRegiBasicInfo basicInfoOther;
	
	public int getOthersInfoID() {
		return othersInfoID;
	}
	public void setOthersInfoID(int othersInfoID) {
		this.othersInfoID = othersInfoID;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExtraCurriculam() {
		return extraCurriculam;
	}
	public void setExtraCurriculam(String extraCurriculam) {
		this.extraCurriculam = extraCurriculam;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSpecialNote() {
		return specialNote;
	}
	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
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
	public StaffRegiBasicInfo getBasicInfoOther() {
		return basicInfoOther;
	}
	public void setBasicInfoOther(StaffRegiBasicInfo basicInfoOther) {
		this.basicInfoOther = basicInfoOther;
	}
	
	
}
