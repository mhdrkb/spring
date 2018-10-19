package com.coderbd.entity.examSetting;

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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "stdexam_publishdate", uniqueConstraints = @UniqueConstraint(columnNames = { "academicYear",
		"examConfigID", "instituteID" }) )
public class ResultPublishDate {

	@Id
	@Column(name = "resultPublishDateID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resultPublishDateID;

	@Column(name = "academicYear")
	private String academicYear;

	@Column(name = "resultPublishDate")
	@Temporal(TemporalType.DATE)
	private Date resultPublishDate;

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

	@ManyToOne
	@JoinColumn(name = "examConfigID")
	private StdExamExamConfig stdExamExamConfigobj;

	public ResultPublishDate() {

	}

	public long getResultPublishDateID() {
		return resultPublishDateID;
	}

	public void setResultPublishDateID(long resultPublishDateID) {
		this.resultPublishDateID = resultPublishDateID;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public Date getResultPublishDate() {
		return resultPublishDate;
	}

	public void setResultPublishDate(Date resultPublishDate) {
		this.resultPublishDate = resultPublishDate;
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

	public StdExamExamConfig getStdExamExamConfigobj() {
		return stdExamExamConfigobj;
	}

	public void setStdExamExamConfigobj(StdExamExamConfig stdExamExamConfigobj) {
		this.stdExamExamConfigobj = stdExamExamConfigobj;
	}

}
