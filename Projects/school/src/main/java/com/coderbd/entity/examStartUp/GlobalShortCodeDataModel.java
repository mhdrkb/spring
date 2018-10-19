package com.coderbd.entity.examStartUp;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import com.coderbd.entity.global.GlobalShortCode;



public class GlobalShortCodeDataModel extends ListDataModel<GlobalShortCode> implements SelectableDataModel<GlobalShortCode>,Serializable {

	
	private static final long serialVersionUID = 1L;
	
	public GlobalShortCodeDataModel() {

	}

	public GlobalShortCodeDataModel(List<GlobalShortCode> list) {
	super(list);
	}

	@Override
	public GlobalShortCode getRowData(String shortCodeID) {

	@SuppressWarnings("unchecked")
	List<GlobalShortCode> globalshortCodeData = (List<GlobalShortCode>) getWrappedData();

	for (GlobalShortCode gs : globalshortCodeData) {
		if (gs.getShortCodeID().equals(shortCodeID)) {
			return gs;
		}
	}
	return null;

	}

	@Override
	public Object getRowKey(GlobalShortCode gs) {
	return gs.getShortCodeID();
	}



}
