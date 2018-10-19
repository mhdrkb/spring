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
@Table(name="staffregi_courseinfo")
public class StaffRegiCourseInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="courseID")
	private int courseID;
	
	@Column(name="courseTitle")
	private String courseTitle;
	
	@Column(name="instituteName")
	private String instituteName;
	
	@Column(name="location")
	private String location;
	
	@Column(name="fromDate")
	@Temporal(TemporalType.DATE)
	private Date fromDate;
	
	@Column(name="toDate")
	@Temporal(TemporalType.DATE)
	private Date toDate;
	
	@Column(name="courseDuration")
	private String courseDuration;
	
	@Column(name="achievement")
	private String achievement;
	
	@Column(name="topicCovered")
	private String topicCovered;
	
	@Column(name="courseNote")
	private String courseNote;
	
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
	private StaffRegiBasicInfo basicInfoCourse;
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getAchievement() {
		return achievement;
	}
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	public String getTopicCovered() {
		return topicCovered;
	}
	public void setTopicCovered(String topicCovered) {
		this.topicCovered = topicCovered;
	}
	public String getCourseNote() {
		return courseNote;
	}
	public void setCourseNote(String courseNote) {
		this.courseNote = courseNote;
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
	public StaffRegiBasicInfo getBasicInfoCourse() {
		return basicInfoCourse;
	}
	public void setBasicInfoCourse(StaffRegiBasicInfo basicInfoCourse) {
		this.basicInfoCourse = basicInfoCourse;
	}
	
	
}
