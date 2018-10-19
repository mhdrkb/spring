package com.coderbd.entity.assaign;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import com.coderbd.entity.hr.StaffRegiBasicInfo;



public class StaffRegiBasicInfoDataModel extends ListDataModel<StaffRegiBasicInfo> implements SelectableDataModel<StaffRegiBasicInfo>,Serializable{

	
	private static final long serialVersionUID = 1L;

	public StaffRegiBasicInfoDataModel() {

	}

	public StaffRegiBasicInfoDataModel(List<StaffRegiBasicInfo> list) {
	super(list);
	}

	@Override
	public StaffRegiBasicInfo getRowData(String staffID) {

	@SuppressWarnings("unchecked")
	List<StaffRegiBasicInfo> staffRegiBasicInfoData = (List<StaffRegiBasicInfo>) getWrappedData();

	for (StaffRegiBasicInfo gs : staffRegiBasicInfoData) {
		if (gs.getStaffID().equals(staffID)) {
			return gs;
		}
	}
	return null;

	}

	@Override
	public Object getRowKey(StaffRegiBasicInfo gs) {
	return gs.getStaffID();
	}
	
	
}
