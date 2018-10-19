package com.coderbd.entity.global;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "global_group")
public class GlobalGroup {

	@Id
	@Column(name = "groupID")
	private String groupID;

	@Column(name = "predefineGroupID")
	private String predefineGroupID;

	@Column(name = "groupName",unique=true)
	private String groupName;

	@Column(name = "predefineStatus")
	private int predefineStatus;

	@Column(name = "groupNote")
	private String groupNote;

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

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getPredefineGroupID() {
		return predefineGroupID;
	}

	public void setPredefineGroupID(String predefineGroupID) {
		this.predefineGroupID = predefineGroupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getPredefineStatus() {
		return predefineStatus;
	}

	public void setPredefineStatus(int predefineStatus) {
		this.predefineStatus = predefineStatus;
	}

	public String getGroupNote() {
		return groupNote;
	}

	public void setGroupNote(String groupNote) {
		this.groupNote = groupNote;
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

}
