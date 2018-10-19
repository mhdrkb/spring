package com.coderbd.entity.student;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.primefaces.model.UploadedFile;

@Entity
@Table(name = "stdreg_basicinfo", uniqueConstraints = @UniqueConstraint(columnNames = { "customStudentID","instituteID" }) )
public class StdRegBasicInfo {

	@Id
	@Column(name = "studentID")
	private String studentID;
	
	
	@Column(name = "customStudentID")
	private String customStudentID;
	
	
	@Column(name = "studentName",nullable=false)
	private String studentName;

	
	@Column(name = "studentGender",nullable=false)
	private String studentGender;

	@Column(name = "studentDOB")
	@Temporal(TemporalType.DATE)
	private Date studentDOB;

	@Column(name = "studentReligion",nullable=false)
	private String studentReligion;

	@Column(name = "studentMobile")
	private String studentMobile;

	@Column(name = "studentEmail")
	private String studentEmail;

	
	@Column(name = "fatherName",nullable=false)
	private String fatherName;
	
	@Column(name = "fathersNID")
	private String fathersNID;

	
	@Column(name = "motherName",nullable=false)
	private String motherName;
	
	@Column(name = "mothersNID")
	private String mothersNID;

	@Column(name = "guardianMobile",nullable=false)
	private String guardianMobile;
	
	@Column(name = "studentImgPath")
	private String studentImgPath;

	@Column(name="studentImgSize")
	private long studentImgSize;
	
	@Column(name = "studentStatus")
	private boolean studentStatus;
	
	@Column(name = "regDate")
	@Temporal(TemporalType.DATE)
	private Date regDate;
	
	@Column(name = "regMonth")
	private String regMonth;
	
	@Column(name = "regYear")
	private String regYear;
	
	
	@Column(name = "guardianEmail")
	private String guardianEmail;
	
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
	private int stdRoll;
	
	@Transient
	private String studentRoll;
	
	@Transient
	private String className;
	
	@Transient
	private String shiftName;
	
	@Transient
	private String sectionName;
	
	@Transient
	private UploadedFile uploadedFileImg;

	/**
	 * All Object Join in Student Basic info table
	 */

	@OneToOne(mappedBy = "basicInfoGuardian", cascade = CascadeType.ALL)
	private StdRegGuardianInfo stdRegGuardianInfo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "basicInfoAddress")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<StdRegAddressInfo> stdRegAddressInfoList;

	@OneToOne(mappedBy = "basicInfoMedical", cascade = CascadeType.ALL)
	private StdRegMedicalInfo stdRegMedicalInfo;
	
	@OneToOne(mappedBy="basicInfoAdmission", cascade=CascadeType.ALL)
	private StdRegiadmissionInfo stdRegiadmissionInfo;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "basicInfoPrevExam")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StdRegPrevExam> stdRegPrevExamList;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "basicInfoPrevInstitute")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StdRegPrevInstitute> stdRegPrevInstituteList;
	
	@OneToOne(mappedBy="basicInfoIDMapping", cascade=CascadeType.ALL)
	private StdRegIDMapping stdRegIDMapping;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "stdRegBasicInfoIdentification")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StdRegIdentification> stdRegIdentificationList;
	
	
	
	public Set<StdRegIdentification> getStdRegIdentificationList() {
		return stdRegIdentificationList;
	}

	public void setStdRegIdentificationList(Set<StdRegIdentification> stdRegIdentificationList) {
		this.stdRegIdentificationList = stdRegIdentificationList;
	}


	public StdRegiadmissionInfo getStdRegiadmissionInfo() {
		return stdRegiadmissionInfo;
	}

	public void setStdRegiadmissionInfo(StdRegiadmissionInfo stdRegiadmissionInfo) {
		this.stdRegiadmissionInfo = stdRegiadmissionInfo;
	}

	public Set<StdRegPrevExam> getStdRegPrevExamList() {
		return stdRegPrevExamList;
	}

	public void setStdRegPrevExamList(Set<StdRegPrevExam> stdRegPrevExamList) {
		this.stdRegPrevExamList = stdRegPrevExamList;
	}

	public Set<StdRegPrevInstitute> getStdRegPrevInstituteList() {
		return stdRegPrevInstituteList;
	}

	public void setStdRegPrevInstituteList(Set<StdRegPrevInstitute> stdRegPrevInstituteList) {
		this.stdRegPrevInstituteList = stdRegPrevInstituteList;
	}

	
	public List<StdRegAddressInfo> getStdRegAddressInfoList() {
		return stdRegAddressInfoList;
	}

	public void setStdRegAddressInfoList(List<StdRegAddressInfo> stdRegAddressInfoList) {
		this.stdRegAddressInfoList = stdRegAddressInfoList;
	}

	public StdRegIDMapping getStdRegIDMapping() {
		return stdRegIDMapping;
	}

	public void setStdRegIDMapping(StdRegIDMapping stdRegIDMapping) {
		this.stdRegIDMapping = stdRegIDMapping;
	}


	public StdRegGuardianInfo getStdRegGuardianInfo() {
		return stdRegGuardianInfo;
	}

	public void setStdRegGuardianInfo(StdRegGuardianInfo stdRegGuardianInfo) {
		this.stdRegGuardianInfo = stdRegGuardianInfo;
	}

	public StdRegMedicalInfo getStdRegMedicalInfo() {
		return stdRegMedicalInfo;
	}

	public void setStdRegMedicalInfo(StdRegMedicalInfo stdRegMedicalInfo) {
		this.stdRegMedicalInfo = stdRegMedicalInfo;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentReligion() {
		return studentReligion;
	}

	public void setStudentReligion(String studentReligion) {
		this.studentReligion = studentReligion;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGuardianMobile() {
		return guardianMobile;
	}

	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}

	public String getStudentImgPath() {
		return studentImgPath;
	}

	public void setStudentImgPath(String studentImgPath) {
		this.studentImgPath = studentImgPath;
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

	

	public int getStdRoll() {
		return stdRoll;
	}

	public void setStdRoll(int stdRoll) {
		this.stdRoll = stdRoll;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	
	public long getStudentImgSize() {
		return studentImgSize;
	}

	public void setStudentImgSize(long studentImgSize) {
		this.studentImgSize = studentImgSize;
	}

	public UploadedFile getUploadedFileImg() {
		return uploadedFileImg;
	}

	public void setUploadedFileImg(UploadedFile uploadedFileImg) {
		this.uploadedFileImg = uploadedFileImg;
	}

	public String getCustomStudentID() {
		return customStudentID;
	}

	public void setCustomStudentID(String customStudentID) {
		this.customStudentID = customStudentID;
	}

	public boolean isStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(boolean studentStatus) {
		this.studentStatus = studentStatus;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRegMonth() {
		return regMonth;
	}

	public void setRegMonth(String regMonth) {
		this.regMonth = regMonth;
	}

	public String getRegYear() {
		return regYear;
	}

	public void setRegYear(String regYear) {
		this.regYear = regYear;
	}

	
	public String getGuardianEmail() {
		return guardianEmail;
	}

	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}

	public String getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(String studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getShiftName() {
		return shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	
	public String getFathersNID() {
		return fathersNID;
	}
	public void setFathersNID(String fathersNID) {
		this.fathersNID = fathersNID;
	}
	
	public String getMothersNID() {
		return mothersNID;
	}
	public void setMothersNID(String mothersNID) {
		this.mothersNID = mothersNID;
	}

	
	
}
