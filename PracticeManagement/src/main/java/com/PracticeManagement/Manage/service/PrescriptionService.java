package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Prescription;

public interface PrescriptionService {
int save(Prescription prescription);
	
	int update(Prescription prescription, String id);
	
	int delete(String id);
	
	List<Prescription> getAll();
	
	Prescription getById(String id);
}
