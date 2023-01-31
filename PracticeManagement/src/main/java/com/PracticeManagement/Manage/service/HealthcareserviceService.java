package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Healthcareservice;

public interface HealthcareserviceService {
	int save(Healthcareservice healthcareservice);
	
	int update(Healthcareservice healthcareservice, String id);
	
	int delete(String id);
	
	List<Healthcareservice> getAll();
	
	Healthcareservice getById(String id);
}
