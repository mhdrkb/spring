package com.coderbd.entity.examStartUp;

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


@Entity
@Table(name = "stdexam_shortcode", uniqueConstraints = @UniqueConstraint(columnNames = { "shortCodeTitle", "classID",
		"instituteID" }) )
public class ExamShortCode {

	@Id
	@Column(name = "shortCodeID")
	private String shortCodeID;

	@Column(name = "shortCodeTitle")
	private String shortCodeTitle;

	@Column(name = "preDefineID")
	private int preDefineID;

	@Column(name = "preDefineStatus")
	private int preDefineStatus;

	@Column(name = "totalMark")
	private double totalMark;

	@Column(name = "passMark")
	private double passMark;

	@Column(name = "acceptPercent")
	private double acceptPercent;

	@Column(name = "shortCodeNote")
	private String shortCodeNote;

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
	@JoinColumn(name = "classID")
	private CoreSettingsClass classObj;

	public ExamShortCode() {
		super();
	}

	public ExamShortCode(String shortCodeID, String shortCodeTitle, int preDefineID, int preDefineStatus,
			double totalMark, double passMark, double acceptPercent, String shortCodeNote, String instituteID,
			String recordNote, String userExecuted, Date dateExecuted, String ipExecuted, int recordStatus,
			CoreSettingsClass classObj) {
		super();
		this.shortCodeID = shortCodeID;
		this.shortCodeTitle = shortCodeTitle;
		this.preDefineID = preDefineID;
		this.preDefineStatus = preDefineStatus;
		this.totalMark = totalMark;
		this.passMark = passMark;
		this.acceptPercent = acceptPercent;
		this.shortCodeNote = shortCodeNote;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.classObj = classObj;
	}

	public String getShortCodeID() {
		return shortCodeID;
	}

	public void setShortCodeID(String shortCodeID) {
		this.shortCodeID = shortCodeID;
	}

	public String getShortCodeTitle() {
		return shortCodeTitle;
	}

	public void setShortCodeTitle(String shortCodeTitle) {
		this.shortCodeTitle = shortCodeTitle;
	}

	public int getPreDefineID() {
		return preDefineID;
	}

	public void setPreDefineID(int preDefineID) {
		this.preDefineID = preDefineID;
	}

	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
	}

	public double getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(double totalMark) {
		this.totalMark = totalMark;
	}

	public double getPassMark() {
		return passMark;
	}

	public void setPassMark(double passMark) {
		this.passMark = passMark;
	}

	public double getAcceptPercent() {
		return acceptPercent;
	}

	public void setAcceptPercent(double acceptPercent) {
		this.acceptPercent = acceptPercent;
	}

	public String getShortCodeNote() {
		return shortCodeNote;
	}

	public void setShortCodeNote(String shortCodeNote) {
		this.shortCodeNote = shortCodeNote;
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

	public CoreSettingsClass getClassObj() {
		return classObj;
	}

	public void setClassObj(CoreSettingsClass classObj) {
		this.classObj = classObj;
	}

}
