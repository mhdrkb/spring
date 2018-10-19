package com.coderbd.entity.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="login_student_code")
public class LoginStudentCode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	@Column(name ="generateDate")
	@Temporal(TemporalType.DATE)
	private Date generateDate;
	
	@Column(name ="generatedMonth")
	private String generatedMonth;
	
	@Column(name ="generatedYear")
	private String generatedYear;
	
	@OneToOne 
	@JoinColumn(name="studentID")
	private StdRegBasicInfo stdRegBasicInfo;
	
	@Column(name ="generatedCode")
	private String generatedCode;	
	
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
	private int roll;

	public LoginStudentCode() {
		super();
	}
	
	
	
	

	public LoginStudentCode(Date generateDate, String generatedMonth, String generatedYear,
			StdRegBasicInfo stdRegBasicInfo, String generatedCode, String instituteID, String recordNote,
			String userExecuted, Date dateExecuted, String ipExecuted, int recordStatus) {
		super();
		this.generateDate = generateDate;
		this.generatedMonth = generatedMonth;
		this.generatedYear = generatedYear;
		this.stdRegBasicInfo = stdRegBasicInfo;
		this.generatedCode = generatedCode;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}





	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getGenerateDate() {
		return generateDate;
	}

	public void setGenerateDate(Date generateDate) {
		this.generateDate = generateDate;
	}

	public String getGeneratedMonth() {
		return generatedMonth;
	}

	public void setGeneratedMonth(String generatedMonth) {
		this.generatedMonth = generatedMonth;
	}

	public String getGeneratedYear() {
		return generatedYear;
	}

	public void setGeneratedYear(String generatedYear) {
		this.generatedYear = generatedYear;
	}

	public StdRegBasicInfo getStdRegBasicInfo() {
		return stdRegBasicInfo;
	}

	public void setStdRegBasicInfo(StdRegBasicInfo stdRegBasicInfo) {
		this.stdRegBasicInfo = stdRegBasicInfo;
	}

	public String getGeneratedCode() {
		return generatedCode;
	}

	public void setGeneratedCode(String generatedCode) {
		this.generatedCode = generatedCode;
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


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	

}
