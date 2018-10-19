package com.coderbd.entity.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="stdreg_id_mapping")
public class StdRegIDMapping {

	@Id
	@Column(name="mappingID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long mappingID;
	
	@Column(name="studentManualID")
	private String studentManualID;
	
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
	
	@OneToOne
	@JoinColumn(name="studentID")
	private StdRegBasicInfo basicInfoIDMapping;

	
	
	/**
	 * Constructor
	 */
	public StdRegIDMapping() {
		
	}

	public long getMappingID() {
		return mappingID;
	}

	public void setMappingID(long mappingID) {
		this.mappingID = mappingID;
	}

	public String getStudentManualID() {
		return studentManualID;
	}

	public void setStudentManualID(String studentManualID) {
		this.studentManualID = studentManualID;
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

	public StdRegBasicInfo getBasicInfoIDMapping() {
		return basicInfoIDMapping;
	}

	public void setBasicInfoIDMapping(StdRegBasicInfo basicInfoIDMapping) {
		this.basicInfoIDMapping = basicInfoIDMapping;
	}
	
	
	
}
