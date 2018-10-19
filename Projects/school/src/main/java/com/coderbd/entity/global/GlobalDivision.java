package com.coderbd.entity.global;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="global_division")
public class GlobalDivision{


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="divisionID")
	private int divisionID;
	
	@Column(name="divisionName")
	private String divisionName;
	
	@Column(name="divisionNote")
	private String divisionNote;
	
	@ManyToOne
	@JoinColumn(name="countryID")
	private GlobalCountry country;
	
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL, mappedBy="division")
	private List<GlobalDistrict> globalDistricts;
	
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
	

	public int getDivisionID() {
		return divisionID;
	}

	public void setDivisionID(int divisionID) {
		this.divisionID = divisionID;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getDivisionNote() {
		return divisionNote;
	}

	public void setDivisionNote(String divisionNote) {
		this.divisionNote = divisionNote;
	}

	public GlobalCountry getCountry() {
		if(country==null){
			this.country=new GlobalCountry();
		}
		return country;
	}

	public void setCountry(GlobalCountry country) {
		this.country = country;
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


	public List<GlobalDistrict> getGlobalDistricts() {
		return globalDistricts;
	}

	public void setGlobalDistricts(List<GlobalDistrict> globalDistricts) {
		this.globalDistricts = globalDistricts;
	}
	
	
}
