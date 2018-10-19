package com.coderbd.entity.examStartUp;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import com.coderbd.entity.global.GlobalExamGrade;


public class GlobalExamGradeDataModel extends ListDataModel<GlobalExamGrade> implements SelectableDataModel<GlobalExamGrade>,Serializable {

	
	private static final long serialVersionUID = 1L;
	
	public GlobalExamGradeDataModel() {

	}

	public GlobalExamGradeDataModel(List<GlobalExamGrade> list) {
	super(list);
	}

	@Override
	public GlobalExamGrade getRowData(String examGradeID) {

	@SuppressWarnings("unchecked")
	List<GlobalExamGrade> globalExamGradeData = (List<GlobalExamGrade>) getWrappedData();

	for (GlobalExamGrade gs : globalExamGradeData) {
		if (gs.getExamGradeID().equals(examGradeID)) {
			return gs;
		}
	}
	return null;

	}

	@Override
	public Object getRowKey(GlobalExamGrade gs) {
	return gs.getExamGradeID();
	}



}