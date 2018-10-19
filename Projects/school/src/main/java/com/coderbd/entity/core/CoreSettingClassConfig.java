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
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "core_setting_class_config",uniqueConstraints= @UniqueConstraint(columnNames={"classID","shiftID","sectionID", "instituteID"}))

public class CoreSettingClassConfig {
   
	@Id
	@Column(name = "classConfigID")
	private String classConfigID;
	
	@Column(name = "instituteID")
	private String instituteID;

	@Column(name = "classConfigSerial")
	private String classConfigSerial;

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
	@JoinColumn(name="classID")
	private CoreSettingsClass coreSettingsClassobj;
	
	@ManyToOne
	@JoinColumn(name="shiftID")
	private CoreSettingShift coreSettingShiftobj;
	
	@ManyToOne
	@JoinColumn(name="sectionID")
	private CoreSettingSection coreSettingSectionobj;
	
	@Transient
	private int totalStdnInSection;
	
	

	public CoreSettingsClass getCoreSettingsClassobj() {
		
		if (this.coreSettingsClassobj==null) {
			this.coreSettingsClassobj = new CoreSettingsClass();
		}
		return coreSettingsClassobj;
	}

	public void setCoreSettingsClassobj(CoreSettingsClass coreSettingsClassobj) {
		this.coreSettingsClassobj = coreSettingsClassobj;
	}
	


	public CoreSettingShift getCoreSettingShiftobj() {
		
		if (this.coreSettingShiftobj==null) {
			this.coreSettingShiftobj = new CoreSettingShift();
		}
		return coreSettingShiftobj;
	}

	public void setCoreSettingShiftobj(CoreSettingShift coreSettingShiftobj) {
		this.coreSettingShiftobj = coreSettingShiftobj;
	}

	public CoreSettingSection getCoreSettingSectionobj() {
		
		if (this.coreSettingSectionobj==null) {
			this.coreSettingSectionobj = new CoreSettingSection();
		}
		return coreSettingSectionobj;
	}

	public void setCoreSettingSectionobj(CoreSettingSection coreSettingSectionobj) {
		this.coreSettingSectionobj = coreSettingSectionobj;
	}

	public String getClassConfigID() {
		return classConfigID;
	}

	public void setClassConfigID(String classConfigID) {
		this.classConfigID = classConfigID;
	}

	public String getInstituteID() {
		return instituteID;
	}

	public void setInstituteID(String instituteID) {
		this.instituteID = instituteID;
	}

	public String getClassConfigSerial() {
		return classConfigSerial;
	}

	public void setClassConfigSerial(String classConfigSerial) {
		this.classConfigSerial = classConfigSerial;
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

	public int getTotalStdnInSection() {
		return totalStdnInSection;
	}

	public void setTotalStdnInSection(int totalStdnInSection) {
		this.totalStdnInSection = totalStdnInSection;
	}
	
	

}
