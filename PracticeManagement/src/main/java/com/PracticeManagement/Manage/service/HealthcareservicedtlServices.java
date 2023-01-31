package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Healthcareservicedtl;


public interface HealthcareservicedtlServices {
	int save(Healthcareservicedtl healthcareservicedtl);
	
	int update(Healthcareservicedtl healthcareservicedtl, String id);
	
	int delete(String id);
	
	List<Healthcareservicedtl> getAll();
	
	List<Healthcareservicedtl> getById(String id);
}
