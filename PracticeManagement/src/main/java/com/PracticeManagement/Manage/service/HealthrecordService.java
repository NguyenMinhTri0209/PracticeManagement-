package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Healthrecord;

public interface HealthrecordService {
	int save(Healthrecord healthrecord);
	
	int update(Healthrecord healthrecord, String id);
	
	int delete(String id);
	
	List<Healthrecord> getAll();
	
	Healthrecord getById(String id);
}
