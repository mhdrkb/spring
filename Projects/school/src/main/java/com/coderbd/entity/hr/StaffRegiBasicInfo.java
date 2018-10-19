package com.coderbd.entity.hr;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

import com.coderbd.entity.assaign.DesignationAssign;


@Entity
@Table(name="staffregi_basicinfo", uniqueConstraints={@UniqueConstraint(columnNames={"staffManualID", "instituteID"})})
public class StaffRegiBasicInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="staffID")
	private String staffID;
	
	@Column(name="staffName")
	private String staffName;
	
	@Column(name="staffGender")
	private String staffGender;
	
	@Column(name="staffDOB")
	@Temporal(TemporalType.DATE)
	private Date staffDOB;
	
	@Column(name="staffReligion")
	private String staffReligion;
	
	@Column(name="staffMobile1")
	private String staffMobile1;
	
	@Column(name="staffMobile2")
	private String staffMobile2;
	
	@Column(name="staffEmail1")
	private String staffEmail1;
	
	@Column(name="staffEmail2")
	private String staffEmail2;
	
	@Column(name="joinigDate")
	@Temporal(TemporalType.DATE)
	private Date joinigDate;
	
	@Column(name="resignDate")
	@Temporal(TemporalType.DATE)
	private Date resignDate;
	
	@Column(name="resignNote")
	private String resignNote;
	
	@Column(name="staffImgName")
	private String staffImgName;
	
	@Column(name="staffImgSize")
	private long staffImgSize;
	
	@Column(name="staffImg")
	private byte[] staffImg;
	
	
	@Column(name="staffManualID")
	private String staffManualID;
	
	@Column(name="staffStatus")
	private boolean staffStatus;
	
	
	@Column(name="instituteID")
	private String instituteID;
	
	@Column(name="recordNote")
	private String recordNote;
	
	@Column(name="userExecuted")
	private String userExecuted;
	
	@Column(name="dateExecuted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;
	
	@Column(name="ipExecuted")
	private String ipExecuted;
	
	@Column(name="recordStatus")
	private int recordStatus;

	
	@Transient
	private boolean check;
	
	@Transient
	private String machineID;
	
	
	@Transient
	private UploadedFile quickFileUploader;
	
	@OneToOne(mappedBy="basicInfoPerson", cascade=CascadeType.ALL)
	private StaffRegiPersonalInfo personalInfo;
	
	@OneToOne(mappedBy="staffBasicInfo", cascade=CascadeType.ALL)
	private DesignationAssign designationAssign;
	
		
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoEdu", fetch=FetchType.EAGER)
	private Set<StaffRegiEducationInfo> educationInfo;

	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoAddress",orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StaffRegiAddressInfo> addressInfoList;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoEmployee")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StaffRegiEmploymentInfo> employeeInfoList;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoCourse")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StaffRegiCourseInfo> courseInfoList;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoTraining")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StaffRegiTrainingInfo> trainingInfoList;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoBank")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StaffRegiBankInfo> bankInfoList;
	
	@OneToOne(mappedBy="basicInfoOther", cascade=CascadeType.ALL)
	private StaffRegiOthersInfo otherInfo;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoReferance")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StaffRegiReferanceInfo> referanceInfoList;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="basicInfoAttachement")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StaffRegiAttachment> attachementInfoList;
	
	
	
	
	@OneToOne(mappedBy="basicInfoIDMapping", cascade=CascadeType.ALL)
	private StaffRegiIDMapping idMappingInfo;
	
	

	
	public String getStaffID() {
		return staffID;
	}
	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffGender() {
		return staffGender;
	}
	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}
	public Date getStaffDOB() {
		return staffDOB;
	}
	public void setStaffDOB(Date staffDOB) {
		this.staffDOB = staffDOB;
	}
	public String getStaffReligion() {
		return staffReligion;
	}
	public void setStaffReligion(String staffReligion) {
		this.staffReligion = staffReligion;
	}
	public String getStaffMobile1() {
		return staffMobile1;
	}
	public void setStaffMobile1(String staffMobile1) {
		this.staffMobile1 = staffMobile1;
	}
	public String getStaffMobile2() {
		return staffMobile2;
	}
	public void setStaffMobile2(String staffMobile2) {
		this.staffMobile2 = staffMobile2;
	}
	public String getStaffEmail1() {
		return staffEmail1;
	}
	public void setStaffEmail1(String staffEmail1) {
		this.staffEmail1 = staffEmail1;
	}
	public String getStaffEmail2() {
		return staffEmail2;
	}
	public void setStaffEmail2(String staffEmail2) {
		this.staffEmail2 = staffEmail2;
	}
	public Date getJoinigDate() {
		return joinigDate;
	}
	public void setJoinigDate(Date joinigDate) {
		this.joinigDate = joinigDate;
	}
	public Date getResignDate() {
		return resignDate;
	}
	public void setResignDate(Date resignDate) {
		this.resignDate = resignDate;
	}
	public String getResignNote() {
		return resignNote;
	}
	public void setResignNote(String resignNote) {
		this.resignNote = resignNote;
	}
	public String getStaffImgName() {
		return staffImgName;
	}
	public void setStaffImgName(String staffImgName) {
		this.staffImgName = staffImgName;
	}
	public long getStaffImgSize() {
		return staffImgSize;
	}
	public void setStaffImgSize(long staffImgSize) {
		this.staffImgSize = staffImgSize;
	}
	public byte[] getStaffImg() {
		return staffImg;
	}
	public void setStaffImg(byte[] staffImg) {
		this.staffImg = staffImg;
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

	

	
	public DesignationAssign getDesignationAssign() {
		return designationAssign;
	}
	public void setDesignationAssign(DesignationAssign designationAssign) {
		this.designationAssign = designationAssign;
	}
	public StaffRegiPersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(StaffRegiPersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public Set<StaffRegiEducationInfo> getEducationInfo() {
		return educationInfo;
	}
	public void setEducationInfo(Set<StaffRegiEducationInfo> educationInfo) {
		this.educationInfo = educationInfo;
	}
	


	public Set<StaffRegiAddressInfo> getAddressInfoList() {
		return addressInfoList;
	}
	public void setAddressInfoList(Set<StaffRegiAddressInfo> addressInfoList) {
		this.addressInfoList = addressInfoList;
	}
	public Set<StaffRegiEmploymentInfo> getEmployeeInfoList() {
		return employeeInfoList;
	}
	public void setEmployeeInfoList(Set<StaffRegiEmploymentInfo> employeeInfoList) {
		this.employeeInfoList = employeeInfoList;
	}
	public Set<StaffRegiCourseInfo> getCourseInfoList() {
		return courseInfoList;
	}
	public void setCourseInfoList(Set<StaffRegiCourseInfo> courseInfoList) {
		this.courseInfoList = courseInfoList;
	}
	public Set<StaffRegiTrainingInfo> getTrainingInfoList() {
		return trainingInfoList;
	}
	public void setTrainingInfoList(Set<StaffRegiTrainingInfo> trainingInfoList) {
		this.trainingInfoList = trainingInfoList;
	}
	public Set<StaffRegiBankInfo> getBankInfoList() {
		return bankInfoList;
	}
	public void setBankInfoList(Set<StaffRegiBankInfo> bankInfoList) {
		this.bankInfoList = bankInfoList;
	}
	public StaffRegiOthersInfo getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(StaffRegiOthersInfo otherInfo) {
		this.otherInfo = otherInfo;
	}
	public Set<StaffRegiReferanceInfo> getReferanceInfoList() {
		return referanceInfoList;
	}
	public void setReferanceInfoList(Set<StaffRegiReferanceInfo> referanceInfoList) {
		this.referanceInfoList = referanceInfoList;
	}
	public Set<StaffRegiAttachment> getAttachementInfoList() {
		return attachementInfoList;
	}
	public void setAttachementInfoList(Set<StaffRegiAttachment> attachementInfoList) {
		this.attachementInfoList = attachementInfoList;
	}
	public StaffRegiIDMapping getIdMappingInfo() {
		return idMappingInfo;
	}
	public void setIdMappingInfo(StaffRegiIDMapping idMappingInfo) {
		this.idMappingInfo = idMappingInfo;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	
	
	
	public String getStaffManualID() {
		return staffManualID;
	}
	public void setStaffManualID(String staffManualID) {
		this.staffManualID = staffManualID;
	}
	public boolean isStaffStatus() {
		return staffStatus;
	}
	public void setStaffStatus(boolean staffStatus) {
		this.staffStatus = staffStatus;
	}

	
	public UploadedFile getQuickFileUploader() {
		return quickFileUploader;
	}
	public void setQuickFileUploader(UploadedFile quickFileUploader) {
		this.quickFileUploader = quickFileUploader;
	}
	
	public String getMachineID() {
		return machineID;
	}
	public void setMachineID(String machineID) {
		this.machineID = machineID;
	}
	
	
	
}
