package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Tofservice;

public interface TofserviceService {
	int save(Tofservice tofservice);
	
	int update(Tofservice tofservice, String id);
	
	int delete(String id);
	
	List<Tofservice> getAll();
	
	Tofservice getById(String id);
}
