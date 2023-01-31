package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Faculty;

public interface FacultyService {
	int save(Faculty faculty);
	
	int update(Faculty faculty, String id);
	
	int delete(String id);
	
	List<Faculty> getAll();
	
	Faculty getById(String id);
}
