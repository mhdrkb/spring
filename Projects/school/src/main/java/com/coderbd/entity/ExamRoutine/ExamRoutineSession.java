package com.coderbd.entity.ExamRoutine;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name="exam_routine_session", uniqueConstraints = @UniqueConstraint(columnNames = { "fixedID","instituteID" }))
public class ExamRoutineSession {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sessionID")
	private int sessionID;

	@Column(name = "fixedID")
	private String fixedID;

	@Column(name = "sessionName")
	private String sessionName;
	

	@Column(name = "startTime")
	@Temporal(TemporalType.TIME)
	private Date startTime;

	@Column(name = "endTime")
	@Temporal(TemporalType.TIME)
	private Date endTime;
	
	@Column(name = "routineHeaderName")
	private String routineHeaderName;
	
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

	public int getSessionID() {
		return sessionID;
	}

	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}

	public String getFixedID() {
		return fixedID;
	}

	public void setFixedID(String fixedID) {
		this.fixedID = fixedID;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getRoutineHeaderName() {
		return routineHeaderName;
	}

	public void setRoutineHeaderName(String routineHeaderName) {
		this.routineHeaderName = routineHeaderName;
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

	

}
