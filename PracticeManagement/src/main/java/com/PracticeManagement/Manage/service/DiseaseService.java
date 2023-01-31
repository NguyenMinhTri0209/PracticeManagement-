package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Disease;

public interface DiseaseService {
	
	int save(Disease disease);
	
	int update(Disease disease, String id);
	
	int delete(String id);
	
	List<Disease> getAll();
	
	Disease getById(String id);
	
}
