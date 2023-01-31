package com.PracticeManagement.Manage.service;

import java.util.List;


import com.PracticeManagement.Manage.model.Medicine;

public interface MedicineService {
	int save(Medicine medicine);
	
	int update(Medicine medicine, String id);
	
	int delete(String id);
	
	List<Medicine> getAll();
	
	Medicine getById(String id);
}
