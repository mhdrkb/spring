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
@Table(name="staffregi_educationinfo")
public class StaffRegiEducationInfo {

	@Id
	@Column(name="degreeID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int degreeID;
	
	@Column(name="degreeTitle")
	private String degreeTitle;
	
	@Column(name="levelOfEducation")
	private String levelOfEducation;
	
	@Column(name="boardName")
	private String boardName;
	
	@Column(name="groupName")
	private String groupName;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="result")
	private String result;
	
	@Column(name="marks")
	private String marks;
	
	@Column(name="grade")
	private String grade;
	
	@Column(name="cgpa")
	private String cgpa;
	
	@Column(name="passingYear")
	private String passingYear;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="achievement")
	private String achievement;
	
	@Column(name="instituteName")
	private String instituteName;
	
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
	private StaffRegiBasicInfo basicInfoEdu;
	
	
	public int getDegreeID() {
		return degreeID;
	}
	public void setDegreeID(int degreeID) {
		this.degreeID = degreeID;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	public String getLevelOfEducation() {
		return levelOfEducation;
	}
	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
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
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
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
	public StaffRegiBasicInfo getBasicInfoEdu() {
		return basicInfoEdu;
	}
	public void setBasicInfoEdu(StaffRegiBasicInfo basicInfoEdu) {
		this.basicInfoEdu = basicInfoEdu;
	}
	
	
	
}
