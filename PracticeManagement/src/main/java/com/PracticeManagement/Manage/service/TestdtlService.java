package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Testdtl;

public interface TestdtlService {
	int save(Testdtl testdtl);
	
	int update(Testdtl testdtl, String id);
	
	int delete(String id);
	
	List<Testdtl> getAll();
	
	List<Testdtl> getById(String id);
}
