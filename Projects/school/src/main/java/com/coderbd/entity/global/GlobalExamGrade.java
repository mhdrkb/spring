package com.coderbd.entity.global;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="global_exam_grade")
public class GlobalExamGrade {
	
	@Id
	@Column(name="examGradeID")
	private String examGradeID;
	
	@Column(name="examGradeName", unique=true)
	private String examGradeName;
	
	@Column (name="preDefineID")
	private String preDefineID;
	
	@Column (name="preDefineStatus")
	private int preDefineStatus;
	
	@Column(name="gradeRange")
	private String gradeRange;
	
	@Column(name="gradeNumber")
	private double gradeNumber;
	
	@Column(name="numberLow")
	private double numberLow;
	
	@Column(name="numberHigh")
	private double numberHigh;
	
	@Column(name="gradePoint")
	private double gradePoint;
	
	@Column(name="pointLow")
	private double pointLow;
	
	@Column(name="pointHigh")
	private double pointHigh;
	
	
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

	
	
	
	
	
	public GlobalExamGrade() {
		super();
	}

	public String getExamGradeID() {
		return examGradeID;
	}

	public void setExamGradeID(String examGradeID) {
		this.examGradeID = examGradeID;
	}

	public String getExamGradeName() {
		return examGradeName;
	}

	public void setExamGradeName(String examGradeName) {
		this.examGradeName = examGradeName;
	}
	
		

	public String getPreDefineID() {
		return preDefineID;
	}

	public void setPreDefineID(String preDefineID) {
		this.preDefineID = preDefineID;
	}

	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
	}

	public String getGradeRange() {
		return gradeRange;
	}

	public void setGradeRange(String gradeRange) {
		this.gradeRange = gradeRange;
	}

	public double getGradeNumber() {
		return gradeNumber;
	}

	public void setGradeNumber(double gradeNumber) {
		this.gradeNumber = gradeNumber;
	}

	public double getNumberLow() {
		return numberLow;
	}

	public void setNumberLow(double numberLow) {
		this.numberLow = numberLow;
	}

	public double getNumberHigh() {
		return numberHigh;
	}

	public void setNumberHigh(double numberHigh) {
		this.numberHigh = numberHigh;
	}

	public double getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(double gradePoint) {
		this.gradePoint = gradePoint;
	}

	public double getPointLow() {
		return pointLow;
	}

	public void setPointLow(double pointLow) {
		this.pointLow = pointLow;
	}

	public double getPointHigh() {
		return pointHigh;
	}

	public void setPointHigh(double pointHigh) {
		this.pointHigh = pointHigh;
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
	

	
	
}
