package com.coderbd.entity.exam;


public class StdExamMarkInputDTO {

	private String studentID;
	private String subjectID;
	private String subjectPreDefineID;
	private String shortCode1;
	private String shortCode2;
	private String shortCode3;
	private String shortCode4;
	private String allShortCode;
	private String classConfigID;
	private String examConfigID;
	
	
	private String gf_studentID;
	private String gf_subjectID;
	private String gf_subjectPredefineID;
	private double gf_totalScore;
	private double gf_subjectFullMark;
	//private String gf_point;
	private String gf_allTotalScore;
	private String gf_classConfigID;
	
	
	
	
	
	
	
	
	public StdExamMarkInputDTO(String studentID, String subjectID,
			String subjectPreDefineID, String shortCode1, String shortCode2,
			String shortCode3, String shortCode4, String allShortCode,
			String classConfigID, String examConfigID) {
		
		this.studentID = studentID;
		this.subjectID = subjectID;
		this.subjectPreDefineID = subjectPreDefineID;
		this.shortCode1 = shortCode1;
		this.shortCode2 = shortCode2;
		this.shortCode3 = shortCode3;
		this.shortCode4 = shortCode4;
		this.allShortCode = allShortCode;
		this.classConfigID = classConfigID;
		this.examConfigID = examConfigID;
	}
	
	
	public StdExamMarkInputDTO(String gf_studentID, String gf_subjectID,
			String gf_subjectPredefineID, double gf_totalScore,double gf_subjectFullMark,
			String gf_allTotalScore,String gf_classConfigID) {
		super();
		this.gf_studentID = gf_studentID;
		this.gf_subjectID = gf_subjectID;
		this.gf_subjectPredefineID = gf_subjectPredefineID;
		this.gf_totalScore = gf_totalScore;
		this.gf_subjectFullMark = gf_subjectFullMark;
		//this.gf_point = gf_point;
		this.gf_allTotalScore = gf_allTotalScore;
		this.gf_classConfigID = gf_classConfigID;
	}


	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectPreDefineID() {
		return subjectPreDefineID;
	}
	public void setSubjectPreDefineID(String subjectPreDefineID) {
		this.subjectPreDefineID = subjectPreDefineID;
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
	public String getAllShortCode() {
		return allShortCode;
	}
	public void setAllShortCode(String allShortCode) {
		this.allShortCode = allShortCode;
	}
	public String getClassConfigID() {
		return classConfigID;
	}
	public void setClassConfigID(String classConfigID) {
		this.classConfigID = classConfigID;
	}
	public String getExamConfigID() {
		return examConfigID;
	}
	public void setExamConfigID(String examConfigID) {
		this.examConfigID = examConfigID;
	}


	public String getGf_studentID() {
		return gf_studentID;
	}


	public void setGf_studentID(String gf_studentID) {
		this.gf_studentID = gf_studentID;
	}


	public String getGf_subjectID() {
		return gf_subjectID;
	}


	public void setGf_subjectID(String gf_subjectID) {
		this.gf_subjectID = gf_subjectID;
	}


	public String getGf_subjectPredefineID() {
		return gf_subjectPredefineID;
	}


	public void setGf_subjectPredefineID(String gf_subjectPredefineID) {
		this.gf_subjectPredefineID = gf_subjectPredefineID;
	}


	public double getGf_totalScore() {
		return gf_totalScore;
	}


	public void setGf_totalScore(double gf_totalScore) {
		this.gf_totalScore = gf_totalScore;
	}


	public String getGf_allTotalScore() {
		return gf_allTotalScore;
	}


	public void setGf_allTotalScore(String gf_allTotalScore) {
		this.gf_allTotalScore = gf_allTotalScore;
	}


	public String getGf_classConfigID() {
		return gf_classConfigID;
	}


	public void setGf_classConfigID(String gf_classConfigID) {
		this.gf_classConfigID = gf_classConfigID;
	}


	public double getGf_subjectFullMark() {
		return gf_subjectFullMark;
	}


	public void setGf_subjectFullMark(double gf_subjectFullMark) {
		this.gf_subjectFullMark = gf_subjectFullMark;
	}
	
	
}
