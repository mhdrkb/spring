package com.coderbd.entity.examSetting;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.coderbd.entity.core.CoreSettingsClass;
import com.coderbd.entity.subject.InstituteSubject;


@Entity
@Table(name = "stdexam_subjectconfig", uniqueConstraints=@UniqueConstraint(columnNames={"subjectID","classID","examConfigID","instituteID"}))
public class StdExamSubjectConfig {

	@Id
	@Column(name = "examSubID")
	private String examSubID;


	@Column(name = "instituteID")
	private String instituteID;

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

	@ManyToOne
	@JoinColumn(name = "subjectID")
	private InstituteSubject instituteSubjectobj;

	@ManyToOne
	@JoinColumn(name = "classID")
	private CoreSettingsClass coreSettingsClassObj;

	@ManyToOne
	@JoinColumn(name = "examConfigID")
	private StdExamExamConfig stdExamExamConfigObj;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="StdExamSubjectConfigMarkConfigobj",fetch=FetchType.EAGER)	
	private List<StdExamMarkConfig> stdExamMarkConfigList;

	public StdExamSubjectConfig() {

	}

	public StdExamSubjectConfig(String examSubID, String instituteID, String recordNote, String userExecuted,
			Date dateExecuted, String ipExecuted, int recordStatus, InstituteSubject instituteSubjectobj,
			CoreSettingsClass coreSettingsClassObj, StdExamExamConfig stdExamExamConfigObj,List<StdExamMarkConfig> stdExamMarkConfigList) {

		this.examSubID = examSubID;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.instituteSubjectobj = instituteSubjectobj;
		this.coreSettingsClassObj = coreSettingsClassObj;
		this.stdExamExamConfigObj = stdExamExamConfigObj;
		///this.stdExamMarkConfigList = stdExamMarkConfigList;
		
		
	}
	
	public String getExamSubID() {
		return examSubID;
	}

	public void setExamSubID(String examSubID) {
		this.examSubID = examSubID;
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

	public InstituteSubject getInstituteSubjectobj() {
		if(instituteSubjectobj==null){
			instituteSubjectobj=new InstituteSubject();
		}
		return instituteSubjectobj;
	}

	public void setInstituteSubjectobj(InstituteSubject instituteSubjectobj) {
		this.instituteSubjectobj = instituteSubjectobj;
	}

	public CoreSettingsClass getCoreSettingsClassObj() {
		return coreSettingsClassObj;
	}

	public void setCoreSettingsClassObj(CoreSettingsClass coreSettingsClassObj) {
		this.coreSettingsClassObj = coreSettingsClassObj;
	}

	public StdExamExamConfig getStdExamExamConfigObj() {
		return stdExamExamConfigObj;
	}

	public void setStdExamExamConfigObj(StdExamExamConfig stdExamExamConfigObj) {
		this.stdExamExamConfigObj = stdExamExamConfigObj;
	}

	public List<StdExamMarkConfig> getStdExamMarkConfigList() {
		return stdExamMarkConfigList;
	}

	public void setStdExamMarkConfigList(List<StdExamMarkConfig> stdExamMarkConfigList) {
		this.stdExamMarkConfigList = stdExamMarkConfigList;
	}

	
}
