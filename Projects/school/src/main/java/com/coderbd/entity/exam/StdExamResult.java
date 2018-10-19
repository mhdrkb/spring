package com.coderbd.entity.exam;

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
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.coderbd.entity.core.CoreSettingClassConfig;
import com.coderbd.entity.examSetting.StdExamExamConfig;
import com.coderbd.entity.student.StdRegBasicInfo;



@Entity
@Table(name = "stdexam_result",uniqueConstraints = @UniqueConstraint(columnNames = { "studentID",
"examConfigID","academicYear","instituteID" }))
public class StdExamResult {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "resultID")
	private long resultID;

	@Column(name = "academicYear")
	private String academicYear;

	@Column(name = "totalMark")
	private double totalMark;

	@Column(name = "totalSubject")
	private int totalSubject;

	@Column(name = "totalGpa")
	private double totalGpa;

	@Column(name = "without4th")
	private double without4th;
	
	@Column(name = "totalSubjectFullMark")
	private double totalSubjectFullMark;

	@Column(name = "resultStatus")
	private String resultStatus;

	@Column(name = "failedSubject")
	private int failedSubject;

	@Column(name = "optionalGpa")
	private double optionalGpa;

	@Column(name = "sumGpa")
	private double sumGpa;

	@Column(name = "sumCgpa")
	private double sumCgpa;

	@Column(name = "addOptionalGpa")
	private double addOptionalGpa;

	@Column(name = "finalGrade")
	private String finalGrade;

	@Column(name = "pos_class")
	private int pos_class;
	
	@Column(name = "pos_shift")
	private int pos_shift;
	
	@Column(name = "pos_section")
	private int pos_section;
	
	@Column(name = "pos_dep_class")
	private int pos_dep_class=0;
	
	@Column(name = "pos_dep_shift")
	private int pos_dep_shift=0;
	
	@Column(name = "pos_dep_section")
	private int pos_dep_section=0;
	
	
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
	@JoinColumn(name = "studentID")
	private StdRegBasicInfo basicInfo;

	@ManyToOne
	@JoinColumn(name = "examConfigID")
	private StdExamExamConfig stdExamConfig;
	
	@ManyToOne
	@JoinColumn(name = "classConfigID")
	private CoreSettingClassConfig coreSettingClassConfig;
	
	@Transient
	private boolean check;

	public StdExamResult() {

	}

	public StdExamResult(String academicYear, double totalMark, int totalSubject, double totalGpa,
			String resultStatus, int failedSubject, double optionalGpa, double sumGpa, double sumCgpa,
			double addOptionalGpa, String instituteID, String recordNote, String userExecuted, Date dateExecuted,
			String ipExecuted, int recordStatus, StdRegBasicInfo basicInfo, StdExamExamConfig stdExamConfig,CoreSettingClassConfig coreSettingClassConfig) {
		super();
		this.academicYear = academicYear;
		this.totalMark = totalMark;
		this.totalSubject = totalSubject;
		this.totalGpa = totalGpa;
		
		this.resultStatus = resultStatus;
		this.failedSubject = failedSubject;
		this.optionalGpa = optionalGpa;
		this.sumGpa = sumGpa;
		this.sumCgpa = sumCgpa;
		this.addOptionalGpa = addOptionalGpa;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.basicInfo = basicInfo;
		this.stdExamConfig = stdExamConfig;
		this.coreSettingClassConfig = coreSettingClassConfig;
	}

	public long getResultID() {
		return resultID;
	}

	public void setResultID(long resultID) {
		this.resultID = resultID;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public double getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(double totalMark) {
		this.totalMark = totalMark;
	}

	public int getTotalSubject() {
		return totalSubject;
	}

	public void setTotalSubject(int totalSubject) {
		this.totalSubject = totalSubject;
	}

	public double getTotalGpa() {
		return totalGpa;
	}

	public void setTotalGpa(double totalGpa) {
		this.totalGpa = totalGpa;
	}

	

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public int getFailedSubject() {
		return failedSubject;
	}

	public void setFailedSubject(int failedSubject) {
		this.failedSubject = failedSubject;
	}

	public double getOptionalGpa() {
		return optionalGpa;
	}

	public void setOptionalGpa(double optionalGpa) {
		this.optionalGpa = optionalGpa;
	}

	public double getSumGpa() {
		return sumGpa;
	}

	public void setSumGpa(double sumGpa) {
		this.sumGpa = sumGpa;
	}

	public double getSumCgpa() {
		return sumCgpa;
	}

	public void setSumCgpa(double sumCgpa) {
		this.sumCgpa = sumCgpa;
	}

	public double getAddOptionalGpa() {
		return addOptionalGpa;
	}

	public void setAddOptionalGpa(double addOptionalGpa) {
		this.addOptionalGpa = addOptionalGpa;
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

	public StdRegBasicInfo getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(StdRegBasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

	public StdExamExamConfig getStdExamConfig() {
		return stdExamConfig;
	}

	public void setStdExamConfig(StdExamExamConfig stdExamConfig) {
		this.stdExamConfig = stdExamConfig;
	}

	public String getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(String finalGrade) {
		this.finalGrade = finalGrade;
	}

	public CoreSettingClassConfig getCoreSettingClassConfig() {
		return coreSettingClassConfig;
	}

	public void setCoreSettingClassConfig(CoreSettingClassConfig coreSettingClassConfig) {
		this.coreSettingClassConfig = coreSettingClassConfig;
	}

	public int getPos_class() {
		return pos_class;
	}

	public void setPos_class(int pos_class) {
		this.pos_class = pos_class;
	}

	public int getPos_shift() {
		return pos_shift;
	}

	public void setPos_shift(int pos_shift) {
		this.pos_shift = pos_shift;
	}

	public int getPos_section() {
		return pos_section;
	}

	public void setPos_section(int pos_section) {
		this.pos_section = pos_section;
	}

	public int getPos_dep_class() {
		return pos_dep_class;
	}

	public void setPos_dep_class(int pos_dep_class) {
		this.pos_dep_class = pos_dep_class;
	}

	public int getPos_dep_shift() {
		return pos_dep_shift;
	}

	public void setPos_dep_shift(int pos_dep_shift) {
		this.pos_dep_shift = pos_dep_shift;
	}

	public int getPos_dep_section() {
		return pos_dep_section;
	}

	public void setPos_dep_section(int pos_dep_section) {
		this.pos_dep_section = pos_dep_section;
	}

	public double getWithout4th() {
		return without4th;
	}

	public void setWithout4th(double without4th) {
		this.without4th = without4th;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public double getTotalSubjectFullMark() {
		return totalSubjectFullMark;
	}

	public void setTotalSubjectFullMark(double totalSubjectFullMark) {
		this.totalSubjectFullMark = totalSubjectFullMark;
	}

	
}
