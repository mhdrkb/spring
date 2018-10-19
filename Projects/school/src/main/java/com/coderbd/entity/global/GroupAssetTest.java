package com.coderbd.entity.global;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="group_asset_test")
public class GroupAssetTest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="groupID")
	private int groupID;
	
	@Column(name="groupName")
	private String groupName;
	
	@Column(name="rootID")
	private int rootID;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "parentID", referencedColumnName = "groupID")
	private GroupAssetTest parentGroup;
	
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getRootID() {
		return rootID;
	}
	public void setRootID(int rootID) {
		this.rootID = rootID;
	}
	public GroupAssetTest getParentGroup() {
		
		return parentGroup;
	}
	public void setParentGroup(GroupAssetTest parentGroup) {
		this.parentGroup = parentGroup;
	}

	

}
