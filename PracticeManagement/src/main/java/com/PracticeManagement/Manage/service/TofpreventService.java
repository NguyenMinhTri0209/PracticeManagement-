package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Tofprevent;

public interface TofpreventService {
	int save(Tofprevent tofprevent);
	
	int update(Tofprevent tofprevent, String id);
	
	int delete(String id);
	
	List<Tofprevent> getAll();
	
	Tofprevent getById(String id);
	
	void updateCostofRoom(Tofprevent tofprevent, String id) throws Exception;
}
