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
@Table(name = "stdreg_previnstitute", uniqueConstraints = @UniqueConstraint(columnNames = { "studentID","instituteNo",
"instituteID" }) )
public class StdRegPrevInstitute {
	
	
	@Id
	@Column(name="prevInstituteID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long prevInstituteID;
	
	
	@Column(name = "instituteNo")
	private String instituteNo;
	
	
	@Column(name = "instituteName")
	private String instituteName;
	
	@Column(name = "instituteAddress")
	private String instituteAddress;
	
	@Column(name = "lastEducation")
	private String lastEducation;
	
	@Column(name = "timePeriod")
	private String timePeriod;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "institutePhone")
	private String institutePhone;
	
	@Column(name = "instituteMobile")
	private String instituteMobile;
	
	@Column(name = "instituteEmail")
	private String instituteEmail;
	
	
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
	@JoinColumn(name="studentID")
	private StdRegBasicInfo basicInfoPrevInstitute;


	


	public long getPrevInstituteID() {
		return prevInstituteID;
	}


	public void setPrevInstituteID(long prevInstituteID) {
		this.prevInstituteID = prevInstituteID;
	}


	public String getInstituteNo() {
		return instituteNo;
	}


	public void setInstituteNo(String instituteNo) {
		this.instituteNo = instituteNo;
	}


	public String getInstituteName() {
		return instituteName;
	}


	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}


	public String getInstituteAddress() {
		return instituteAddress;
	}


	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}


	public String getLastEducation() {
		return lastEducation;
	}


	public void setLastEducation(String lastEducation) {
		this.lastEducation = lastEducation;
	}


	public String getTimePeriod() {
		return timePeriod;
	}


	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getInstitutePhone() {
		return institutePhone;
	}


	public void setInstitutePhone(String institutePhone) {
		this.institutePhone = institutePhone;
	}


	public String getInstituteMobile() {
		return instituteMobile;
	}


	public void setInstituteMobile(String instituteMobile) {
		this.instituteMobile = instituteMobile;
	}


	public String getInstituteEmail() {
		return instituteEmail;
	}


	public void setInstituteEmail(String instituteEmail) {
		this.instituteEmail = instituteEmail;
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


	public StdRegBasicInfo getBasicInfoPrevInstitute() {
		return basicInfoPrevInstitute;
	}


	public void setBasicInfoPrevInstitute(StdRegBasicInfo basicInfoPrevInstitute) {
		this.basicInfoPrevInstitute = basicInfoPrevInstitute;
	}
	
	
}
