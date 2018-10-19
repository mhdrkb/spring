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
@Table(name="staffregi_attachment")
public class StaffRegiAttachment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="attachmentID")
	private int attachmentID;
	
	@Column(name="title")
	private String title;
	
	@Column(name="attachmentNote")
	private String attachmentNote;
	
	@Column(name="imgPath")
	private String imgPath;
	
	@Column(name="attachmentPhoto")
	private byte[] attachmentPhoto;
	
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
	private StaffRegiBasicInfo basicInfoAttachement;
	
	public int getAttachmentID() {
		return attachmentID;
	}
	public void setAttachmentID(int attachmentID) {
		this.attachmentID = attachmentID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAttachmentNote() {
		return attachmentNote;
	}
	public void setAttachmentNote(String attachmentNote) {
		this.attachmentNote = attachmentNote;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public byte[] getAttachmentPhoto() {
		return attachmentPhoto;
	}
	public void setAttachmentPhoto(byte[] attachmentPhoto) {
		this.attachmentPhoto = attachmentPhoto;
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
	public StaffRegiBasicInfo getBasicInfoAttachement() {
		return basicInfoAttachement;
	}
	public void setBasicInfoAttachement(StaffRegiBasicInfo basicInfoAttachement) {
		this.basicInfoAttachement = basicInfoAttachement;
	}
	
	
}
