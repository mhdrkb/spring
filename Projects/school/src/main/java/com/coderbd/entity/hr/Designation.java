package com.coderbd.entity.hr;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.coderbd.entity.assaign.DesignationAssign;


@Entity
@Table(name="staffconf_designation",uniqueConstraints= @UniqueConstraint(columnNames={"designationName", "instituteID"}))
public class Designation {
	
	@Id
	@Column(name="designationID")
	private String designationID;
	
	@Column(name="designationName")
	private String designationName;
	
	@Column (name="preDefineID")
	private String preDefineID;
	
	@Column (name="preDefineStatus")
	private int preDefineStatus;
	
	@Column (name="designationSerial")
	private int designationSerial;
	
	@Column(name="instituteID")
	private String instituteID;
	
	@Column(name="designationNote")
	private String designationNote;
	
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
	
	@OneToMany(cascade=CascadeType.DETACH,mappedBy="designationObj",fetch=FetchType.LAZY)	
	private List<DesignationAssign> assignList;


	public Designation() {
		super();
	}

	





	public Designation(String designationID, String designationName, String preDefineID, int preDefineStatus,
			String instituteID, String designationNote, String recordNote, String userExecuted, Date dateExecuted,
			String ipExecuted, int recordStatus) {
		super();
		this.designationID = designationID;
		this.designationName = designationName;
		this.preDefineID = preDefineID;
		this.preDefineStatus = preDefineStatus;
		this.instituteID = instituteID;
		this.designationNote = designationNote;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
	}







	public String getDesignationID() {
		return designationID;
	}

	public void setDesignationID(String designationID) {
		this.designationID = designationID;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	
	

	public String getPreDefineID() {
		return preDefineID;
	}



	public void setPreDefineID(String preDefineID) {
		this.preDefineID = preDefineID;
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



	public String getDesignationNote() {
		return designationNote;
	}

	public void setDesignationNote(String designationNote) {
		this.designationNote = designationNote;
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

	public int getDesignationSerial() {
		return designationSerial;
	}


	public void setDesignationSerial(int designationSerial) {
		this.designationSerial = designationSerial;
	}

	
}
