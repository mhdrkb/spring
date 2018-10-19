package com.coderbd.entity.exam;

import java.util.Date;

import javax.persistence.CascadeType;
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
import com.coderbd.entity.core.CoreSettingsClass;
import com.coderbd.entity.examSetting.StdExamExamConfig;
import com.coderbd.entity.student.StdRegBasicInfo;
import com.coderbd.entity.subject.InstituteSubject;


@Entity
@Table(name = "stdexam_markinput", uniqueConstraints = @UniqueConstraint(columnNames = { "studentID", "examConfigID",
		"subjectID", "academicYear", "instituteID" }) )

public class SdExamMarkInput {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "markInputID")
	private long markInputID;

	@Column(name = "shortCode1")
	private String shortCode1;

	@Column(name = "shortCode2")
	private String shortCode2;

	@Column(name = "shortCode3")
	private String shortCode3;

	@Column(name = "shortCode4")
	private String shortCode4;

	@Column(name = "shortCode5")
	private String shortCode5;

	@Column(name = "shortCode6")
	private String shortCode6;

	@Column(name = "shortCode7")
	private String shortCode7;

	@Column(name = "shortCode8")
	private String shortCode8;

	@Column(name = "allShortCode")
	private String allShortCode;

	@Column(name = "subjectFullMark")
	private double subjectFullMark;

	@Column(name = "totalMark")
	private double totalMark;

	@Column(name = "totalScore")
	private double totalScore;

	@Column(name = "finalScore")
	private double finalScore;

	@Column(name = "letterGrade")
	private String letterGrade;

	@Column(name = "gradePoint")
	private double gradePoint;

	@Column(name = "s1")
	private double s1;

	@Column(name = "s2")
	private double s2;

	@Column(name = "s3")
	private double s3;

	@Column(name = "s4")
	private double s4;

	@Column(name = "preSubjectID")
	private String preSubjectID;

	// Sum variable
	@Transient
	private double sc1;
	@Transient
	private double sc2;
	@Transient
	private double sc3;
	@Transient
	private double sc4;

	@Transient
	private double shortC1;
	@Transient
	private double shortC2;
	@Transient
	private double shortC3;
	@Transient
	private double shortC4;
	@Transient
	private String studentID;
	@Transient
	private String studentName;
	@Transient
	private String roll;
	@Transient
	private boolean check;

	@Column(name = "academicYear")
	private String academicYear;

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
	@JoinColumn(name = "subjectID")
	private InstituteSubject instituteSubject;

	@ManyToOne
	@JoinColumn(name = "examConfigID")
	private StdExamExamConfig stdExamConfig;

	@ManyToOne
	@JoinColumn(name = "classConfigID")
	private CoreSettingClassConfig coreSettingClassConfig;

	@ManyToOne
	@JoinColumn(name = "classID")
	private CoreSettingsClass coreSettingsClass;

	public SdExamMarkInput() {

	}

	public SdExamMarkInput(String shortCode1, String shortCode2, String shortCode3, String shortCode4,
			String shortCode5, String shortCode6, String shortCode7, String shortCode8, String allShortCode,
			double subjectFullMark, double totalMark, double totalScore, String letterGrade, double gradePoint,
			String academicYear, String instituteID, String recordNote, String userExecuted, Date dateExecuted,
			String ipExecuted, int recordStatus, StdRegBasicInfo basicInfo, InstituteSubject instituteSubject,
			StdExamExamConfig stdExamConfig, CoreSettingClassConfig coreSettingClassConfig,
			CoreSettingsClass coreSettingsClass, String preSubjectID) {

		this.shortCode1 = shortCode1;
		this.shortCode2 = shortCode2;
		this.shortCode3 = shortCode3;
		this.shortCode4 = shortCode4;
		this.shortCode5 = shortCode5;
		this.shortCode6 = shortCode6;
		this.shortCode7 = shortCode7;
		this.shortCode8 = shortCode8;
		this.allShortCode = allShortCode;
		this.subjectFullMark = subjectFullMark;
		this.totalMark = totalMark;
		this.totalScore = totalScore;
		this.letterGrade = letterGrade;
		this.gradePoint = gradePoint;
		this.academicYear = academicYear;
		this.instituteID = instituteID;
		this.recordNote = recordNote;
		this.userExecuted = userExecuted;
		this.dateExecuted = dateExecuted;
		this.ipExecuted = ipExecuted;
		this.recordStatus = recordStatus;
		this.basicInfo = basicInfo;
		this.instituteSubject = instituteSubject;
		this.stdExamConfig = stdExamConfig;
		this.coreSettingClassConfig = coreSettingClassConfig;
		this.coreSettingsClass = coreSettingsClass;
		this.preSubjectID = preSubjectID;
	}

	public long getMarkInputID() {
		return markInputID;
	}

	public void setMarkInputID(long markInputID) {
		this.markInputID = markInputID;
	}

	public String getShortCode1() {
		return shortCode1;
	}

	public void setShortCode1(String shortCode1) {
		this.shortCode1 = shortCode1;
	}

	public String getShortCode2() {
		return shortCode2;
	}

	public void setShortCode2(String shortCode2) {
		this.shortCode2 = shortCode2;
	}

	public String getShortCode3() {
		return shortCode3;
	}

	public void setShortCode3(String shortCode3) {
		this.shortCode3 = shortCode3;
	}

	public String getShortCode4() {
		return shortCode4;
	}

	public void setShortCode4(String shortCode4) {
		this.shortCode4 = shortCode4;
	}

	public String getShortCode5() {
		return shortCode5;
	}

	public void setShortCode5(String shortCode5) {
		this.shortCode5 = shortCode5;
	}

	public String getShortCode6() {
		return shortCode6;
	}

	public void setShortCode6(String shortCode6) {
		this.shortCode6 = shortCode6;
	}

	public String getShortCode7() {
		return shortCode7;
	}

	public void setShortCode7(String shortCode7) {
		this.shortCode7 = shortCode7;
	}

	public String getShortCode8() {
		return shortCode8;
	}

	public void setShortCode8(String shortCode8) {
		this.shortCode8 = shortCode8;
	}

	public String getAllShortCode() {
		return allShortCode;
	}

	public void setAllShortCode(String allShortCode) {
		this.allShortCode = allShortCode;
	}

	public double getSubjectFullMark() {
		return subjectFullMark;
	}

	public void setSubjectFullMark(double subjectFullMark) {
		this.subjectFullMark = subjectFullMark;
	}

	public double getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(double totalMark) {
		this.totalMark = totalMark;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public double getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(double gradePoint) {
		this.gradePoint = gradePoint;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
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

	public InstituteSubject getInstituteSubject() {
		return instituteSubject;
	}

	public void setInstituteSubject(InstituteSubject instituteSubject) {
		this.instituteSubject = instituteSubject;
	}

	public StdExamExamConfig getStdExamConfig() {
		return stdExamConfig;
	}

	public void setStdExamConfig(StdExamExamConfig stdExamConfig) {
		this.stdExamConfig = stdExamConfig;
	}

	public CoreSettingClassConfig getCoreSettingClassConfig() {
		return coreSettingClassConfig;
	}

	public void setCoreSettingClassConfig(CoreSettingClassConfig coreSettingClassConfig) {
		this.coreSettingClassConfig = coreSettingClassConfig;
	}

	public CoreSettingsClass getCoreSettingsClass() {
		return coreSettingsClass;
	}

	public void setCoreSettingsClass(CoreSettingsClass coreSettingsClass) {
		this.coreSettingsClass = coreSettingsClass;
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}

	public double getS4() {
		return s4;
	}

	public void setS4(double s4) {
		this.s4 = s4;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public String getPreSubjectID() {
		return preSubjectID;
	}

	public void setPreSubjectID(String preSubjectID) {
		this.preSubjectID = preSubjectID;
	}

	public double getSc1() {
		return sc1;
	}

	public void setSc1(double sc1) {
		this.sc1 = sc1;
	}

	public double getSc2() {
		return sc2;
	}

	public void setSc2(double sc2) {
		this.sc2 = sc2;
	}

	public double getSc3() {
		return sc3;
	}

	public void setSc3(double sc3) {
		this.sc3 = sc3;
	}

	public double getSc4() {
		return sc4;
	}

	public void setSc4(double sc4) {
		this.sc4 = sc4;
	}

	public double getShortC1() {
		return shortC1;
	}

	public void setShortC1(double shortC1) {
		this.shortC1 = shortC1;
	}

	public double getShortC2() {
		return shortC2;
	}

	public void setShortC2(double shortC2) {
		this.shortC2 = shortC2;
	}

	public double getShortC3() {
		return shortC3;
	}

	public void setShortC3(double shortC3) {
		this.shortC3 = shortC3;
	}

	public double getShortC4() {
		return shortC4;
	}

	public void setShortC4(double shortC4) {
		this.shortC4 = shortC4;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

}
