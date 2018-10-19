package com.coderbd.entity.examSetting;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import com.coderbd.entity.examStartUp.Exam;


public class ExamSettingDataModel extends ListDataModel<Exam> implements SelectableDataModel<Exam>, Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public ExamSettingDataModel() {

	}

	public ExamSettingDataModel(List<Exam> list) {
		super(list);
	}

	@Override
	public Exam getRowData(String examID) {

		@SuppressWarnings("unchecked")
		List<Exam> examData = (List<Exam>) getWrappedData();

		for (Exam exams : examData) {
			if (exams.getExamID().equals(examID)) {
				return exams;
			}
		}
		return null;

	}

	@Override
	public Object getRowKey(Exam scSection) {
		return scSection.getExamID();
	}

}
