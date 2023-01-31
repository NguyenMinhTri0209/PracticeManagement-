package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Toftest;

public interface ToftestService {
	int save(Toftest toftest);
	
	int update(Toftest toftest, String id);
	
	int delete(String id);
	
	List<Toftest> getAll();
	
	Toftest getById(String id);
}
