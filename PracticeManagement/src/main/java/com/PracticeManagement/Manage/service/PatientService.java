package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Patient;

public interface PatientService {
	int save(Patient patient);
	
	int update(Patient patient, String id);
	
	int delete(String id);
	
	List<Patient> getAll();
	
	Patient getById(String id);
	
}
