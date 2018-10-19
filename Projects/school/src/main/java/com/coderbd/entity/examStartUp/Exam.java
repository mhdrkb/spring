package com.coderbd.entity.examStartUp;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.coderbd.entity.examSetting.StdExamExamConfig;


@Entity
@Table(name = "stdexam_exam", uniqueConstraints = @UniqueConstraint(columnNames = { "examName", "instituteID" }) )
public class Exam {

	@Id
	@Column(name = "examID")
	private String examID;

	@Column(name = "examName")
	private String examName;

	@Column(name = "preDefineID")
	private String preDefineID;

	@Column(name = "preDefineStatus")
	private int preDefineStatus;

	@Column(name = "examNote")
	private String examNote;

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

	@Transient
	private boolean check;
	@Transient
	private String exCnfID;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "examExamCnfObj", fetch = FetchType.EAGER)
	private List<StdExamExamConfig> StdExamExamConfigExamList;

	public Exam() {
		
	}

	
	public Exam(String examID, String examName, String exCnfID) {
		super();
		this.examID = examID;
		this.examName = examName;
		
		this.exCnfID = exCnfID;
	}
	
	public Exam(String examID, String examName) {
		super();
		this.examID = examID;
		this.examName = examName;
	
	}


	

	public Exam(String examID, String examName, String preDefineID, int preDefineStatus) {
		super();
		this.examID = examID;
		this.examName = examName;
		this.preDefineID = preDefineID;
		this.preDefineStatus = preDefineStatus;
	}


	public Exam(String examID, String examName, String preDefineID, int preDefineStatus, String examNote,
			String instituteID, String recordNote, String userExecuted, Date dateExecuted, String ipExecuted,
			int recordStatus) {
		super();
		this.examID = examID;
		this.examName = examName;
		this.preDefineID = preDefineID;
		this.preDefineStatus = preDefineStatus;
		this.examNote = examNote;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}

	public String getExamID() {
		return examID;
	}

	public void setExamID(String examID) {
		this.examID = examID;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
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

	public String getExamNote() {
		return examNote;
	}

	public void setExamNote(String examNote) {
		this.examNote = examNote;
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

	public List<StdExamExamConfig> getStdExamExamConfigExamList() {
		return StdExamExamConfigExamList;
	}

	public void setStdExamExamConfigExamList(List<StdExamExamConfig> stdExamExamConfigExamList) {
		StdExamExamConfigExamList = stdExamExamConfigExamList;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getExCnfID() {
		return exCnfID;
	}

	public void setExCnfID(String exCnfID) {
		this.exCnfID = exCnfID;
	}

}
