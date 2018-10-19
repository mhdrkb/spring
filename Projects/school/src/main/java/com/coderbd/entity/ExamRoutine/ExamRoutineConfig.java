package com.coderbd.entity.ExamRoutine;

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

import com.coderbd.entity.core.CoreSettingGroup;
import com.coderbd.entity.core.CoreSettingsClass;
import com.coderbd.entity.examStartUp.Exam;
import com.coderbd.entity.subject.InstituteSubject;


@Entity
@Table (name="exam_routine_config", uniqueConstraints = @UniqueConstraint(columnNames = { "academicYear","classID","examID","groupID","subjectID","instituteID" }))
public class ExamRoutineConfig {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "examRoutineID")
	private int examRoutineID;

	@Column(name = "instituteID")
	private String instituteID;
	
	@Column(name = "academicYear")
	private String academicYear;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

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
	@JoinColumn(name = "groupID")
	private CoreSettingGroup coreSettingGroup;

	@ManyToOne
	@JoinColumn(name = "subjectID")
	private InstituteSubject instituteSubject;
	
	@ManyToOne
	@JoinColumn(name = "classID")
	private CoreSettingsClass coreSettingsClass;
	
	@ManyToOne
	@JoinColumn(name = "examID")
	private Exam examObj;
	
	@ManyToOne
	@JoinColumn(name = "sessionID")
	private ExamRoutineSession examRoutineSession;

	public int getExamRoutineID() {
		return examRoutineID;
	}

	public void setExamRoutineID(int examRoutineID) {
		this.examRoutineID = examRoutineID;
	}

	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public CoreSettingGroup getCoreSettingGroup() {
		return coreSettingGroup;
	}

	public void setCoreSettingGroup(CoreSettingGroup coreSettingGroup) {
		this.coreSettingGroup = coreSettingGroup;
	}

	public InstituteSubject getInstituteSubject() {
		return instituteSubject;
	}

	public void setInstituteSubject(InstituteSubject instituteSubject) {
		this.instituteSubject = instituteSubject;
	}

	public CoreSettingsClass getCoreSettingsClass() {
		return coreSettingsClass;
	}

	public void setCoreSettingsClass(CoreSettingsClass coreSettingsClass) {
		this.coreSettingsClass = coreSettingsClass;
	}

	public Exam getExamObj() {
		return examObj;
	}

	public void setExamObj(Exam examObj) {
		this.examObj = examObj;
	}

	public ExamRoutineSession getExamRoutineSession() {
		return examRoutineSession;
	}

	public void setExamRoutineSession(ExamRoutineSession examRoutineSession) {
		this.examRoutineSession = examRoutineSession;
	}
	
	
}
