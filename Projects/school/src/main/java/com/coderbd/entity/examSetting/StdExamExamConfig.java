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
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.coderbd.entity.core.CoreSettingsClass;
import com.coderbd.entity.examStartUp.Exam;


@Entity
@Table(name = "stdexam_examconfig", uniqueConstraints = @UniqueConstraint(columnNames = { "classID", "examID",
		"instituteID" }) )
public class StdExamExamConfig {

	@Id
	@Column(name = "examConfigID")
	private String examConfigID;

	@Column(name = "examSerial")
	private int examSerial;

	@Column(name = "percentage")
	private double percentage;

	@Column(name = "instituteID")
	private String instituteID;
	

	@Column(name = "examPredefineID")
	private String examPredefineID;

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
	@Transient
	private double TotalPercent;
	
	@Transient
	private boolean check;

	@ManyToOne
	@JoinColumn(name = "classID")
	private CoreSettingsClass coreSettingsClassExcnfobj;

	@ManyToOne
	@JoinColumn(name = "examID")
	private Exam examExamCnfObj;

	public StdExamExamConfig() {

	}

	public StdExamExamConfig(String examConfigID, int examSerial, double percentage, String instituteID,
			String recordNote, String userExecuted, Date dateExecuted, String ipExecuted, int recordStatus,
			CoreSettingsClass coreSettingsClassExcnfobj, Exam examExamCnfObj,String examPredefineID) {
		super();
		this.examConfigID = examConfigID;
		this.examSerial = examSerial;
		this.percentage = percentage;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.coreSettingsClassExcnfobj = coreSettingsClassExcnfobj;
		this.examExamCnfObj = examExamCnfObj;
		this.examPredefineID = examPredefineID;
	}

	public StdExamExamConfig(int examSerial, double percentage) {
		super();
		this.examSerial = examSerial;
		this.percentage = percentage;
	}

	public String getExamConfigID() {
		return examConfigID;
	}

	public void setExamConfigID(String examConfigID) {
		this.examConfigID = examConfigID;
	}

	public int getExamSerial() {
		return examSerial;
	}

	public void setExamSerial(int examSerial) {
		this.examSerial = examSerial;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
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

	public CoreSettingsClass getCoreSettingsClassExcnfobj() {
		return coreSettingsClassExcnfobj;
	}

	public void setCoreSettingsClassExcnfobj(CoreSettingsClass coreSettingsClassExcnfobj) {
		this.coreSettingsClassExcnfobj = coreSettingsClassExcnfobj;
	}

	public Exam getExamExamCnfObj() {
		return examExamCnfObj;
	}

	public void setExamExamCnfObj(Exam examExamCnfObj) {
		this.examExamCnfObj = examExamCnfObj;
	}

	public double getTotalPercent() {
		return TotalPercent;
	}

	public void setTotalPercent(double totalPercent) {
		TotalPercent = totalPercent;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getExamPredefineID() {
		return examPredefineID;
	}

	public void setExamPredefineID(String examPredefineID) {
		this.examPredefineID = examPredefineID;
	}

}
