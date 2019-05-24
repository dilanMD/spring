package com.deluxan.service;

import com.deluxan.dao.ClassificationsDAO;
import com.deluxan.model.Classifications;

public class ClassificationsServiceImpl implements ClassificationsService {
	private ClassificationsDAO classificationsDAO;

	public void setClassificationsDAO(ClassificationsDAO classificationsDAO) {
		this.classificationsDAO = classificationsDAO;
	}

	public void addClassification(Classifications classifications) {
		classificationsDAO.createClassification(classifications);
	}
}
