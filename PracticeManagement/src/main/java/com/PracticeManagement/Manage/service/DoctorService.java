package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Doctor;

public interface DoctorService {
	int save(Doctor doctor);
	
	int update(Doctor doctor, String id);
	
	int delete(String id);
	
	List<Doctor> getAll();
	
	Doctor getById(String id);
}

