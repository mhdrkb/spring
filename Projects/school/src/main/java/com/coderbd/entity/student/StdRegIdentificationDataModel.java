package com.coderbd.entity.student;

import java.io.Serializable;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;


public class StdRegIdentificationDataModel extends ListDataModel<StdRegIdentification> implements SelectableDataModel<StdRegIdentification>,Serializable{


	private static final long serialVersionUID = 1L;

	public StdRegIdentificationDataModel() {

	}

	public StdRegIdentificationDataModel(List<StdRegIdentification> list) {
	super(list);
	}

	@Override
	public StdRegIdentification getRowData(String studentID) {

	@SuppressWarnings("unchecked")
	List<StdRegIdentification> stdData = (List<StdRegIdentification>) getWrappedData();

	for (StdRegIdentification gs : stdData) {
		if (gs.getStdRegBasicInfoIdentification().getStudentID().equals(studentID)) {
			return gs;
		}
	}
	return null;

	}

	@Override
	public Object getRowKey(StdRegIdentification gs) {
	return gs.getStdRegBasicInfoIdentification().getStudentID();
	}
	
	
}
