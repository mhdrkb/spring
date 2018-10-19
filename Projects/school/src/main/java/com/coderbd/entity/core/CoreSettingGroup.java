package com.coderbd.entity.core;

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
@Table(name = "core_setting_group",uniqueConstraints= @UniqueConstraint(columnNames={"groupName", "instituteID"}))

public class CoreSettingGroup {
	
	@Id
	@Column(name = "groupID")
	private String groupID;
	
	@Column(name="preDefineGroupID")
	private String preDefineGroupID;

	@Column(name = "groupName")
	private String groupName;
	
	@Column(name="preDefineStatus")
	private int preDefineStatus;
	
	@Column(name = "groupSerial")
	private int groupSerial;
	
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

	/*
	@OneToMany(cascade=CascadeType.DETACH,mappedBy="coreSettingsGroupobjgroupConfig",fetch=FetchType.EAGER)	
	private List<GroupConfig> groupConfigListgroup;*/
	
	
	/* Mapped CoreSetting group to Student Identification */
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "coreSettingCoreSettingGroup")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<StdRegIdentification> groupStdRegIdentificationList;*/
	
	
	public CoreSettingGroup() {
		
	}
	
	

	/**
	 * @param groupID
	 * @param preDefineGroupID
	 * @param groupName
	 * @param preDefineStatus
	 * @param instituteID
	 * @param recordNote
	 * @param userExecuted
	 * @param dateExecuted
	 * @param ipExecuted
	 * @param recordStatus
	 */
	public CoreSettingGroup(String groupID, String preDefineGroupID, String groupName, int preDefineStatus,
			String instituteID, String recordNote, String userExecuted, Date dateExecuted, String ipExecuted,
			int recordStatus, int groupSerial) {
		
		this.groupID = groupID;
		this.preDefineGroupID = preDefineGroupID;
		this.groupName = groupName;
		this.preDefineStatus = preDefineStatus;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.groupSerial =groupSerial;
	}


	

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getPreDefineGroupID() {
		return preDefineGroupID;
	}

	public void setPreDefineGroupID(String preDefineGroupID) {
		this.preDefineGroupID = preDefineGroupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getPreDefineStatus() {
		return preDefineStatus;
	}

	public void setPreDefineStatus(int preDefineStatus) {
		this.preDefineStatus = preDefineStatus;
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




	public int getGroupSerial() {
		return groupSerial;
	}



	public void setGroupSerial(int groupSerial) {
		this.groupSerial = groupSerial;
	}



	public boolean isCheck() {
		return check;
	}



	public void setCheck(boolean check) {
		this.check = check;
	}
	
	
}
