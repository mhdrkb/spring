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

@Entity

@Table(name = "stdreg_medicalinfo")
public class StdRegMedicalInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="medicalInfoID")
	private long medicalInfoID;
	

	@Column(name = "bloodGroup")
	private String bloodGroup;

	@Column(name = "height")
	private String height;

	@Column(name = "weight")
	private String weight;

	@Column(name = "eyeColor")
	private String eyeColor;

	@Column(name = "lastTreatementDate")
	@Temporal(TemporalType.DATE)
	private Date lastTreatementDate;

	@Column(name = "specialDisease")
	private String specialDisease;

	@Column(name = "specialNote")
	private String specialNote;

	
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
	
	
	/**
	 * Student Medical Info Join in Student Basic info table
	 */
	@OneToOne
	@JoinColumn(name="studentID")
	private StdRegBasicInfo basicInfoMedical;

	
	
	/**
	 * Getter and Setter
	 * @return
	 */
	public long getMedicalInfoID() {
		return medicalInfoID;
	}

	public void setMedicalInfoID(long medicalInfoID) {
		this.medicalInfoID = medicalInfoID;
	}

	

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public Date getLastTreatementDate() {
		return lastTreatementDate;
	}

	public void setLastTreatementDate(Date lastTreatementDate) {
		this.lastTreatementDate = lastTreatementDate;
	}

	public String getSpecialDisease() {
		return specialDisease;
	}

	public void setSpecialDisease(String specialDisease) {
		this.specialDisease = specialDisease;
	}

	public String getSpecialNote() {
		return specialNote;
	}

	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
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

	public StdRegBasicInfo getBasicInfoMedical() {
		return basicInfoMedical;
	}

	public void setBasicInfoMedical(StdRegBasicInfo basicInfoMedical) {
		this.basicInfoMedical = basicInfoMedical;
	}

	
}
