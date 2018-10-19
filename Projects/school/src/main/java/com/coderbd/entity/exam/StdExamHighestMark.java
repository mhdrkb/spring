package com.coderbd.entity.exam;

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

import com.coderbd.entity.core.CoreSettingsClass;
import com.coderbd.entity.examSetting.StdExamExamConfig;
import com.coderbd.entity.subject.InstituteSubject;

@Entity
@Table(name = "stdexam_highest_mark",uniqueConstraints = @UniqueConstraint(columnNames = {"examConfigID","subjectID","academicYear","instituteID" }))
public class StdExamHighestMark {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "highestMark")
	private double highestMark;

	@Column(name = "academicYear")
	private String academicYear;

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
	@JoinColumn(name = "subjectID")
	private InstituteSubject instituteSubject;

	@ManyToOne
	@JoinColumn(name = "examConfigID")
	private StdExamExamConfig stdExamConfig;

	@ManyToOne
	@JoinColumn(name = "classID")
	private CoreSettingsClass coreSettingsClass;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getHighestMark() {
		return highestMark;
	}

	public void setHighestMark(double highestMark) {
		this.highestMark = highestMark;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
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

	public InstituteSubject getInstituteSubject() {
		return instituteSubject;
	}

	public void setInstituteSubject(InstituteSubject instituteSubject) {
		this.instituteSubject = instituteSubject;
	}

	public StdExamExamConfig getStdExamConfig() {
		return stdExamConfig;
	}

	public void setStdExamConfig(StdExamExamConfig stdExamConfig) {
		this.stdExamConfig = stdExamConfig;
	}

	public CoreSettingsClass getCoreSettingsClass() {
		return coreSettingsClass;
	}

	public void setCoreSettingsClass(CoreSettingsClass coreSettingsClass) {
		this.coreSettingsClass = coreSettingsClass;
	}

}
