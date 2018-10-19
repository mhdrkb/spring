package com.coderbd.entity.student;
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
@Table(name = "stdreg_prevexam", uniqueConstraints = @UniqueConstraint(columnNames = { "studentID","examName",
"instituteID" }) )
public class StdRegPrevExam {

	@Id
	@Column(name="prevExamID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long prevExamID;

	@Column(name = "examName")
	private String examName;

	@Column(name = "regID")
	private String regID;

	@Column(name = "examRoll")
	private String examRoll;

	@Column(name = "exgroup")
	private String exgroup;

	@Column(name = "board")
	private String board;

	@Column(name = "year")
	private String year;

	@Column(name = "exSession")
	private String exSession;

	@Column(name = "exPoint")
	private String exPoint;

	@Column(name = "exgrade")
	private String exgrade;

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
	@JoinColumn(name = "studentID")
	private StdRegBasicInfo basicInfoPrevExam;

	

	public long getPrevExamID() {
		return prevExamID;
	}

	public void setPrevExamID(long prevExamID) {
		this.prevExamID = prevExamID;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getRegID() {
		return regID;
	}

	public void setRegID(String regID) {
		this.regID = regID;
	}

	public String getExamRoll() {
		return examRoll;
	}

	public void setExamRoll(String examRoll) {
		this.examRoll = examRoll;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getExSession() {
		return exSession;
	}

	public void setExSession(String exSession) {
		this.exSession = exSession;
	}

	public String getExPoint() {
		return exPoint;
	}

	public void setExPoint(String exPoint) {
		this.exPoint = exPoint;
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

	public StdRegBasicInfo getBasicInfoPrevExam() {
		return basicInfoPrevExam;
	}

	public void setBasicInfoPrevExam(StdRegBasicInfo basicInfoPrevExam) {
		this.basicInfoPrevExam = basicInfoPrevExam;
	}

	public String getExgroup() {
		return exgroup;
	}

	public void setExgroup(String exgroup) {
		this.exgroup = exgroup;
	}

	public String getExgrade() {
		return exgrade;
	}

	public void setExgrade(String exgrade) {
		this.exgrade = exgrade;
	}

}
