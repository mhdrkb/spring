package com.coderbd.entity.hr;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="staffregi_traininginfo")
public class StaffRegiTrainingInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="trainingID")
	private int trainingID;
	
	@Column(name="trainingTitle")
	private String trainingTitle;
	
	@Column(name="topicCovered")
	private String topicCovered;
	
	@Column(name="instituteName")
	private String instituteName;
	
	@Column(name="country")
	private String country;
	
	@Column(name="location")
	private String location;
	
	@Column(name="trainingYear")
	private String trainingYear;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="achievement")
	private String achievement;
	
	@Column(name="trainingNote")
	private String trainingNote;
	
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
	
	@ManyToOne
	@JoinColumn(name="staffID")
	private StaffRegiBasicInfo basicInfoTraining;
	
	public int getTrainingID() {
		return trainingID;
	}
	public void setTrainingID(int trainingID) {
		this.trainingID = trainingID;
	}
	public String getTrainingTitle() {
		return trainingTitle;
	}
	public void setTrainingTitle(String trainingTitle) {
		this.trainingTitle = trainingTitle;
	}
	public String getTopicCovered() {
		return topicCovered;
	}
	public void setTopicCovered(String topicCovered) {
		this.topicCovered = topicCovered;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTrainingYear() {
		return trainingYear;
	}
	public void setTrainingYear(String trainingYear) {
		this.trainingYear = trainingYear;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getTrainingNote() {
		return trainingNote;
	}
	public void setTrainingNote(String trainingNote) {
		this.trainingNote = trainingNote;
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
	public StaffRegiBasicInfo getBasicInfoTraining() {
		return basicInfoTraining;
	}
	public void setBasicInfoTraining(StaffRegiBasicInfo basicInfoTraining) {
		this.basicInfoTraining = basicInfoTraining;
	}
	
	
	
}
