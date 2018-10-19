package com.coderbd.entity.examSetting;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.coderbd.entity.core.CoreSettingsClass;
import com.coderbd.entity.examStartUp.Exam;
import com.coderbd.entity.examStartUp.ExamShortCode;
import com.coderbd.entity.subject.InstituteSubject;
@Entity
@Table(name = "stdexam_markconfig", uniqueConstraints=@UniqueConstraint(columnNames={"subjectID","classID","examConfigID","shortCodePredefineID","instituteID"}))
public class StdExamMarkConfig {
	
	@Id
	@Column(name = "markConfigID")
	private String markConfigID;

	@Column(name = "shortCodePredefineID")
	private int shortCodePredefineID;

	@Column(name = "totalMark")
	private double totalMark;

	@Column(name = "acceptance")
	private double acceptance;

	@Column(name = "passMark")
	private double passMark;

	@Column(name = "instituteID")
	private String instituteID;
	
	@Column(name = "subjectPredefineID")
	private String subjectPredefineID;

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
	@JoinColumn(name = "examSubID")
	private StdExamSubjectConfig StdExamSubjectConfigMarkConfigobj;

	@ManyToOne
	@JoinColumn(name = "subjectID")
	private InstituteSubject instituteSubjectMarkConfigobj;

	@ManyToOne
	@JoinColumn(name = "classID")
	private CoreSettingsClass coreSettingsClassMarkConfigObj;

	@ManyToOne
	@JoinColumn(name = "examConfigID")
	private StdExamExamConfig stdExamExamConfigMarkConfigObj;

	@ManyToOne
	@JoinColumn(name = "examID")
	private Exam examMarkConfigObj;
	
	@ManyToOne
	@JoinColumn(name = "shortCodeID")
	private ExamShortCode examShortCode;

	public StdExamMarkConfig() {

	}

	public StdExamMarkConfig(String markConfigID, int shortCodePredefineID, double totalMark, double acceptance,
			double passMark, String instituteID, String recordNote, String userExecuted, Date dateExecuted,
			String ipExecuted, int recordStatus, StdExamSubjectConfig stdExamSubjectConfigMarkConfigobj,
			InstituteSubject instituteSubjectMarkConfigobj, CoreSettingsClass coreSettingsClassMarkConfigObj,
			StdExamExamConfig stdExamExamConfigMarkConfigObj, Exam examMarkConfigObj,ExamShortCode examShortCode,String subjectPredefineID) {

		this.markConfigID = markConfigID;
		this.shortCodePredefineID = shortCodePredefineID;
		this.totalMark = totalMark;
		this.acceptance = acceptance;
		this.passMark = passMark;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		StdExamSubjectConfigMarkConfigobj = stdExamSubjectConfigMarkConfigobj;
		this.instituteSubjectMarkConfigobj = instituteSubjectMarkConfigobj;
		this.coreSettingsClassMarkConfigObj = coreSettingsClassMarkConfigObj;
		this.stdExamExamConfigMarkConfigObj = stdExamExamConfigMarkConfigObj;
		this.examMarkConfigObj = examMarkConfigObj;
		this.examShortCode =examShortCode;
		this.subjectPredefineID = subjectPredefineID;
	}

	public String getMarkConfigID() {
		return markConfigID;
	}

	public void setMarkConfigID(String markConfigID) {
		this.markConfigID = markConfigID;
	}

	

	public int getShortCodePredefineID() {
		return shortCodePredefineID;
	}

	public void setShortCodePredefineID(int shortCodePredefineID) {
		this.shortCodePredefineID = shortCodePredefineID;
	}

	public double getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(double totalMark) {
		this.totalMark = totalMark;
	}

	public double getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(double acceptance) {
		this.acceptance = acceptance;
	}

	public double getPassMark() {
		return passMark;
	}

	public void setPassMark(double passMark) {
		this.passMark = passMark;
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

	public StdExamSubjectConfig getStdExamSubjectConfigMarkConfigobj() {
		return StdExamSubjectConfigMarkConfigobj;
	}

	public void setStdExamSubjectConfigMarkConfigobj(StdExamSubjectConfig stdExamSubjectConfigMarkConfigobj) {
		StdExamSubjectConfigMarkConfigobj = stdExamSubjectConfigMarkConfigobj;
	}

	public InstituteSubject getInstituteSubjectMarkConfigobj() {
		return instituteSubjectMarkConfigobj;
	}

	public void setInstituteSubjectMarkConfigobj(InstituteSubject instituteSubjectMarkConfigobj) {
		this.instituteSubjectMarkConfigobj = instituteSubjectMarkConfigobj;
	}

	public CoreSettingsClass getCoreSettingsClassMarkConfigObj() {
		return coreSettingsClassMarkConfigObj;
	}

	public void setCoreSettingsClassMarkConfigObj(CoreSettingsClass coreSettingsClassMarkConfigObj) {
		this.coreSettingsClassMarkConfigObj = coreSettingsClassMarkConfigObj;
	}

	public StdExamExamConfig getStdExamExamConfigMarkConfigObj() {
		return stdExamExamConfigMarkConfigObj;
	}

	public void setStdExamExamConfigMarkConfigObj(StdExamExamConfig stdExamExamConfigMarkConfigObj) {
		this.stdExamExamConfigMarkConfigObj = stdExamExamConfigMarkConfigObj;
	}

	public Exam getExamMarkConfigObj() {
		return examMarkConfigObj;
	}

	public void setExamMarkConfigObj(Exam examMarkConfigObj) {
		this.examMarkConfigObj = examMarkConfigObj;
	}

	public ExamShortCode getExamShortCode() {
		return examShortCode;
	}

	public void setExamShortCode(ExamShortCode examShortCode) {
		this.examShortCode = examShortCode;
	}

	public String getSubjectPredefineID() {
		return subjectPredefineID;
	}

	public void setSubjectPredefineID(String subjectPredefineID) {
		this.subjectPredefineID = subjectPredefineID;
	}

}
