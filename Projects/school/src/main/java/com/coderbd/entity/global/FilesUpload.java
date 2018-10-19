package com.coderbd.entity.global;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.primefaces.model.UploadedFile;

@Entity
@Table(name="files_upload")
public class FilesUpload implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FileID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fileID;
	
	@Column(name="FileName")
	private String fileName;
	
	
	@Column(name="FileSize")
	private long fileSize;
	
	@Column(name="FileData")
	private byte[] fileData;
	
	@Transient
	private UploadedFile uploadedFile;
	
	
	

	public FilesUpload() {
		super();
	}
	
	

	public FilesUpload(int fileID, String fileName, byte[] fileData,
			UploadedFile uploadedFile) {
		super();
		this.fileID = fileID;
		this.fileName = fileName;
		this.fileData = fileData;
		this.uploadedFile = uploadedFile;
	}



	public FilesUpload(int fileID, String fileName, byte[] fileData) {
		super();
		this.fileID = fileID;
		this.fileName = fileName;		
		this.fileData = fileData;
	}

	


	public FilesUpload(String fileName,long fileSize, byte[] fileData) {
		super();
		this.fileName = fileName;
		this.fileSize=fileSize;
		this.fileData = fileData;
	}



	public int getFileID() {
		return fileID;
	}

	public void setFileID(int fileID) {
		this.fileID = fileID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	

	public long getFileSize() {
		return fileSize;
	}



	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	
	
	

}
