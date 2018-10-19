package com.coderbd.entity.examStartUp;

import java.io.Serializable;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

import com.coderbd.entity.global.GlobalExam;



public class GlobalExamDataModel extends  ListDataModel<GlobalExam>  implements SelectableDataModel<GlobalExam>,Serializable{

	private static final long serialVersionUID = 1L;
	
	public GlobalExamDataModel() {

	}

	public GlobalExamDataModel(List<GlobalExam> list) {
	super(list);
	}

	@Override
	public GlobalExam getRowData(String examID) {

	@SuppressWarnings("unchecked")
	List<GlobalExam> globalExamData = (List<GlobalExam>) getWrappedData();

	for (GlobalExam gs : globalExamData) {
		if (gs.getExamID().equals(examID)) {
			return gs;
		}
	}
	return null;

	}

	@Override
	public Object getRowKey(GlobalExam gs) {
	return gs.getExamID();
	}
	

}
