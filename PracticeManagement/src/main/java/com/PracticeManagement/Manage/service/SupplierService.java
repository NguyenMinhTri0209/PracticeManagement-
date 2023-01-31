package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Supplier;

public interface SupplierService {
	int save(Supplier supplier);
	
	int update(Supplier supplier, String id);
	
	int delete(String id);
	
	List<Supplier> getAll();
	
	Supplier getById(String id);
}
