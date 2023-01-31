package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Receiptdtl;

public interface ReceiptdtlService {
	int save(Receiptdtl receiptdtl);
	
	int update(Receiptdtl receiptdtl, String id);
	
	int delete(String id);
	
	List<Receiptdtl> getAll();
	
	Receiptdtl getById(String id);
}
