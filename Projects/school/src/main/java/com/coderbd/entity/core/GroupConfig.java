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
@Table(name = "core_setting_group_config",uniqueConstraints= @UniqueConstraint(columnNames={"classID","groupID","instituteID"}))
public class GroupConfig {

	@Id
	@Column(name = "groupConfigID")
	private String groupConfigID;

	@Column(name = "instituteID")
	private String instituteID;
	
	@Column(name = "groupConfigSerial")
	private int groupConfigSerial;

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
	
	/*@Transient
	private String groupID;
	@Transient
	private String groupName;*/

	
	@ManyToOne
	@JoinColumn(name="classID")
	private CoreSettingsClass coreSettingsClassobjgroupConfig;
	
	
	@ManyToOne
	@JoinColumn(name="groupID")
	private CoreSettingGroup coreSettingsGroupobjgroupConfig;
	
	
	
	/*
	public GroupConfig() {
		
	}

	public GroupConfig(String groupID, String groupName) {
		
		this.groupID = groupID;
		this.groupName = groupName;
	}*/

	public CoreSettingGroup getCoreSettingsGroupobjgroupConfig() {
		
		if (this.coreSettingsGroupobjgroupConfig==null) {
			this.coreSettingsGroupobjgroupConfig = new CoreSettingGroup();
		}
		return coreSettingsGroupobjgroupConfig;
	}

	public void setCoreSettingsGroupobjgroupConfig(CoreSettingGroup coreSettingsGroupobjgroupConfig) {
		this.coreSettingsGroupobjgroupConfig = coreSettingsGroupobjgroupConfig;
	}

	public CoreSettingsClass getCoreSettingsClassobjgroupConfig() {
		
		if (this.coreSettingsClassobjgroupConfig==null) {
			this.coreSettingsClassobjgroupConfig = new CoreSettingsClass();
		}
		return coreSettingsClassobjgroupConfig;
	}

	public void setCoreSettingsClassobjgroupConfig(CoreSettingsClass coreSettingsClassobjgroupConfig) {
		this.coreSettingsClassobjgroupConfig = coreSettingsClassobjgroupConfig;
	}

	public String getGroupConfigID() {
		return groupConfigID;
	}

	public void setGroupConfigID(String groupConfigID) {
		this.groupConfigID = groupConfigID;
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

	public int getGroupConfigSerial() {
		return groupConfigSerial;
	}

	public void setGroupConfigSerial(int groupConfigSerial) {
		this.groupConfigSerial = groupConfigSerial;
	}

	/*public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}*/

}
