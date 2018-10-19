package com.coderbd.entity.core;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name ="core_setting_class",uniqueConstraints= @UniqueConstraint(columnNames={"className", "instituteID"}))
public class CoreSettingsClass implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "classID")
	private String classID;

	@Column(name = "className")
	private String className;

	@Column(name = "instituteID")
	private String instituteID;

	@Column(name = "preDefineClassID")
	private String preDefineClassID;
	
	@Column(name = "preDefineStatus")
	private int preDefineStatus;
	
	@Column(name = "classSerial")
	private int classSerial;

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
	private double amount;
	
	
	
	

	/*@OneToMany(cascade=CascadeType.DETACH,mappedBy="classObj",fetch=FetchType.EAGER)	
	private List<ExamShortCode> examShortCodeList;*/
	
/*	@OneToMany(cascade=CascadeType.DETACH,mappedBy="coreSettingsClassobj",fetch=FetchType.EAGER)	
	private List<CoreSettingClassConfig> coreSettingClassConfigclass;*/
	
	/*@OneToMany(cascade=CascadeType.DETACH,mappedBy="coreSettingShiftobj",fetch=FetchType.EAGER)	
	private List<CoreSettingClassConfig> coreSettingClassConfigshift;*/
	
	/*@OneToMany(cascade=CascadeType.DETACH,mappedBy="coreSettingSectionobj",fetch=FetchType.EAGER)	
	private List<CoreSettingClassConfig> coreSettingClassConfigsection;*/
	
/*	@OneToMany(cascade=CascadeType.DETACH,mappedBy="coreSettingsClassobjgroupConfig",fetch=FetchType.EAGER)	
	private List<GroupConfig> groupConfigListClass;
	
	@OneToMany(cascade=CascadeType.DETACH,mappedBy="classObj",fetch=FetchType.EAGER)	
	private List<ExamGrade> examGradeList;
	
	@OneToMany(cascade=CascadeType.DETACH,mappedBy="coreSettingsClassExcnfobj",fetch=FetchType.EAGER)	
	private List<StdExamExamConfig> StdExamExamConfigList;*/
	
	
	
	
	
	public CoreSettingsClass() {
		
	}

	/**
	 * @param classID
	 */
	public CoreSettingsClass(String classID) {
		
	}
	
	
	


	public CoreSettingsClass(String classID, String className, String instituteID, String preDefineClassID,int preDefineStatus,
			int classSerial, String recordNote, String userExecuted, Date dateExecuted, String ipExecuted,
			int recordStatus) {
		super();
		this.classID = classID;
		this.className = className;
		this.instituteID = instituteID;
		this.preDefineClassID = preDefineClassID;
		this.preDefineStatus=preDefineStatus;
		this.classSerial = classSerial;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}

	
	
	
	


	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
	}
	

	public String getPreDefineClassID() {
		return preDefineClassID;
	}

	public void setPreDefineClassID(String preDefineClassID) {
		this.preDefineClassID = preDefineClassID;
	}
	
	
	



	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
	}

	public int getClassSerial() {
		return classSerial;
	}

	public void setClassSerial(int classSerial) {
		this.classSerial = classSerial;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
	
}
