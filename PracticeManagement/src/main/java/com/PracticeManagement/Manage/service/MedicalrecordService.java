package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Medicalrecord;

public interface MedicalrecordService {
	int save(Medicalrecord medicalrecord);
	
	int update(Medicalrecord medicalrecord, String id);
	
	int delete(String id);
	
	List<Medicalrecord> getAll();
	
	Medicalrecord getById(String id);
}
