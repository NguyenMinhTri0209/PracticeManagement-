package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Prevent;

public interface PreventService {
	int save(Prevent prevent);
	
	int update(Prevent prevent, String id);
	
	int delete(String id);
	
	List<Prevent> getAll();
	
	Prevent getById(String id);
}
