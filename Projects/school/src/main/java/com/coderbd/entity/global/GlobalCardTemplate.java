package com.coderbd.entity.global;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "global_card_template",uniqueConstraints= @UniqueConstraint(columnNames={"templateForID","templateID"}))
public class GlobalCardTemplate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "globaltemplateID")
	private int globaltemplateID;

	@Column(name = "templateFor")
	private String templateFor;
	
	@Column(name = "templateForID")
	private String templateForID;

	@Column(name = "templateID")
	private String templateID;

	@Column(name = "templateName")
	private String templateName;
	
	@Column(name = "templateImage")
	private String templateImage;
	
	@Column(name = "templateNote")
	private String templateNote;

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

	public GlobalCardTemplate() {

	}

	public int getGlobaltemplateID() {
		return globaltemplateID;
	}

	public void setGlobaltemplateID(int globaltemplateID) {
		this.globaltemplateID = globaltemplateID;
	}

	public String getTemplateFor() {
		return templateFor;
	}

	public void setTemplateFor(String templateFor) {
		this.templateFor = templateFor;
	}

	public String getTemplateID() {
		return templateID;
	}

	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
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

	public String getTemplateForID() {
		return templateForID;
	}

	public void setTemplateForID(String templateForID) {
		this.templateForID = templateForID;
	}

	public String getTemplateImage() {
		return templateImage;
	}

	public void setTemplateImage(String templateImage) {
		this.templateImage = templateImage;
	}

	public String getTemplateNote() {
		return templateNote;
	}

	public void setTemplateNote(String templateNote) {
		this.templateNote = templateNote;
	}

}
