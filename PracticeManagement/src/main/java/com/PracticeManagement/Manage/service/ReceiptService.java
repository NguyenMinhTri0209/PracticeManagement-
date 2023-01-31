package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Receipt;

public interface ReceiptService {
	int save(Receipt receipt);
	
	int update(Receipt receipt, String id);
	
	int delete(String id);
	
	List<Receipt> getAll();
	
	Receipt getById(String id);
	
	long checkBill(String id);
}
