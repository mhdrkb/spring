package com.coderbd.entity.global;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="global_thana")
public class GlobalThana{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="thanaID")
	private int thanaID;
	
	@Column(name="thanaName")
	private String thanaName;
	
	@Column(name="thanaNote")
	private String thanaNote;
	
	@ManyToOne
	@JoinColumn(name="districtID")
	private GlobalDistrict district;
	
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



	public int getThanaID() {
		return thanaID;
	}

	public void setThanaID(int thanaID) {
		this.thanaID = thanaID;
	}

	public String getThanaName() {
		return thanaName;
	}

	public void setThanaName(String thanaName) {
		this.thanaName = thanaName;
	}

	public String getThanaNote() {
		return thanaNote;
	}

	public void setThanaNote(String thanaNote) {
		this.thanaNote = thanaNote;
	}

	public GlobalDistrict getDistrict() {
		if(this.district==null){
			this.district=new GlobalDistrict();
		}
		return district;
	}

	public void setDistrict(GlobalDistrict district) {
		this.district = district;
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
