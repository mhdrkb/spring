package com.coderbd.entity.hr;

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
@Table(name="staffregi_bankinfo")
public class StaffRegiBankInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bankNo")
	private int bankNo;
	
	@Column(name="bankName")
	private String bankName;
	
	@Column(name="accountName")
	private String accountName;
	
	@Column(name="accountNumber")
	private String accountNumber;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="accountType")
	private String accountType;
	
	@Column(name="primaryStatus")
	private String primaryStatus;
	
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
	
	@ManyToOne
	@JoinColumn(name="staffID")
	private StaffRegiBasicInfo basicInfoBank;
	
	public int getBankNo() {
		return bankNo;
	}
	public void setBankNo(int bankNo) {
		this.bankNo = bankNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getPrimaryStatus() {
		return primaryStatus;
	}
	public void setPrimaryStatus(String primaryStatus) {
		this.primaryStatus = primaryStatus;
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
	public StaffRegiBasicInfo getBasicInfoBank() {
		return basicInfoBank;
	}
	public void setBasicInfoBank(StaffRegiBasicInfo basicInfoBank) {
		this.basicInfoBank = basicInfoBank;
	}
	
	
}
