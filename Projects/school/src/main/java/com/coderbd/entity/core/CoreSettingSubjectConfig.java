package com.coderbd.entity.core;

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


@Entity
@Table(name = "core_setting_subject_config", uniqueConstraints = @UniqueConstraint(columnNames = { "subjectID", "classID",
		"groupID", "instituteID" }) )
public class CoreSettingSubjectConfig {

	@Id
	@Column(name = "subjectConfigID")
	private String subjectConfigID;

	@Column(name = "instituteID")
	private String instituteID;

	@Column(name = "subjectSerial")
	private int subjectSerial;

	@Column(name = "subjectStatus")
	private int subjectStatus;

	@Column(name = "subjectCode")
	private String subjectCode;

	@Column(name = "subjectPredefineID")
	private String subjectPredefineID;

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
	@JoinColumn(name = "subjectID")
	private InstituteSubject instituteSubjectObj;

	@ManyToOne
	@JoinColumn(name = "classID")
	private CoreSettingsClass coreSettingsClassObj;

	@ManyToOne
	@JoinColumn(name = "groupID")
	private CoreSettingGroup coreSettingGroupObj;

	public CoreSettingSubjectConfig() {

	}

	public CoreSettingSubjectConfig(String subjectConfigID, String instituteID, int subjectSerial, int subjectStatus,
			String subjectCode, String recordNote, String userExecuted, Date dateExecuted, String ipExecuted,
			int recordStatus, InstituteSubject instituteSubjectObj, CoreSettingsClass coreSettingsClassObj,
			CoreSettingGroup coreSettingGroupObj,String subjectPredefineID) {
		super();
		this.subjectConfigID = subjectConfigID;
		this.instituteID = instituteID;
		this.subjectSerial = subjectSerial;
		this.subjectStatus = subjectStatus;
		this.subjectCode = subjectCode;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.instituteSubjectObj = instituteSubjectObj;
		this.coreSettingsClassObj = coreSettingsClassObj;
		this.coreSettingGroupObj = coreSettingGroupObj;
		this.subjectPredefineID = subjectPredefineID;
	}

	public String getSubjectConfigID() {
		return subjectConfigID;
	}

	public void setSubjectConfigID(String subjectConfigID) {
		this.subjectConfigID = subjectConfigID;
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

	public InstituteSubject getInstituteSubjectObj() {
		return instituteSubjectObj;
	}

	public void setInstituteSubjectObj(InstituteSubject instituteSubjectObj) {
		this.instituteSubjectObj = instituteSubjectObj;
	}

	public int getSubjectSerial() {
		return subjectSerial;
	}

	public void setSubjectSerial(int subjectSerial) {
		this.subjectSerial = subjectSerial;
	}

	public CoreSettingsClass getCoreSettingsClassObj() {
		return coreSettingsClassObj;
	}

	public void setCoreSettingsClassObj(CoreSettingsClass coreSettingsClassObj) {
		this.coreSettingsClassObj = coreSettingsClassObj;
	}

	public CoreSettingGroup getCoreSettingGroupObj() {
		return coreSettingGroupObj;
	}

	public void setCoreSettingGroupObj(CoreSettingGroup coreSettingGroupObj) {
		this.coreSettingGroupObj = coreSettingGroupObj;
	}

	public int getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(int subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectPredefineID() {
		return subjectPredefineID;
	}

	public void setSubjectPredefineID(String subjectPredefineID) {
		this.subjectPredefineID = subjectPredefineID;
	}

}
