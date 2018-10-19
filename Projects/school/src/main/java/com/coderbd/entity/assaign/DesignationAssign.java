package com.coderbd.entity.assaign;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.coderbd.entity.hr.Designation;
import com.coderbd.entity.hr.StaffRegiBasicInfo;



@Entity
@Table(name="staffconf_designationassign")
public class DesignationAssign {
	
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column (name="staffSerial")
	private int staffSerial;
	
	@OneToOne
	@JoinColumn(name="staffID",unique=true)
	private  StaffRegiBasicInfo staffBasicInfo;
	
	
	@ManyToOne
	@JoinColumn(name="designationID")
	private Designation designationObj;
	
	
	@Column (name="instituteID")
	private String instituteID;
	
	@Column (name="recordNote")
	private String recordNote;
	
	@Column (name="userExecued")
	private String userExecued;
	
	@Column (name="dateExecuted")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecuted;
	
	@Column (name="ipExecuted")
	private String ipExecuted;
	
	@Column (name="recordStatus")
	private int recordStatus;
	
	
	@Transient
	private boolean check;
	

	public DesignationAssign() {
		super();
	}
	


	public DesignationAssign(StaffRegiBasicInfo staffBasicInfo, Designation designationObj,
			String instituteID, String recordNote, String userExecued, Date dateExecuted, String ipExecuted,
			int recordStatus) {
		this.staffBasicInfo = staffBasicInfo;
		this.designationObj = designationObj;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecued = userExecued;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}
	
	public DesignationAssign(long id,StaffRegiBasicInfo staffBasicInfo, Designation designationObj,
			String instituteID, String recordNote, String userExecued, Date dateExecuted, String ipExecuted,
			int recordStatus) {
		this.id=id;
		this.staffBasicInfo = staffBasicInfo;
		this.designationObj = designationObj;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecued = userExecued;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}






	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getStaffSerial() {
		return staffSerial;
	}

	public void setStaffSerial(int staffSerial) {
		this.staffSerial = staffSerial;
	}

	public StaffRegiBasicInfo getStaffBasicInfo() {
		return staffBasicInfo;
	}

	public void setStaffBasicInfo(StaffRegiBasicInfo staffBasicInfo) {
		this.staffBasicInfo = staffBasicInfo;
	}

	public Designation getDesignationObj() {
		return designationObj;
	}

	public void setDesignationObj(Designation designationObj) {
		this.designationObj = designationObj;
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

	public String getUserExecued() {
		return userExecued;
	}

	public void setUserExecued(String userExecued) {
		this.userExecued = userExecued;
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



	public boolean isCheck() {
		return check;
	}



	public void setCheck(boolean check) {
		this.check = check;
	}
	
	
	

}
