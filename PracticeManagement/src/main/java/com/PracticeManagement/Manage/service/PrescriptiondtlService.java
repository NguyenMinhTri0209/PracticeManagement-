package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Prescriptiondtl;

public interface PrescriptiondtlService {
	int save(Prescriptiondtl prescriptiondtl);
	
	int update(Prescriptiondtl prescriptiondtl, String idprescription, String idmedicine);
	
	int delete(String idprescription, String idmedicine);
	
	List<Prescriptiondtl> getAll();
	
	List<Prescriptiondtl> getById(String idprescription);
	
	Prescriptiondtl getById(String idprescription, String idmedicine);
}
