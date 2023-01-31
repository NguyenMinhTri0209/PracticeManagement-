package com.PracticeManagement.Manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PracticeManagement.Manage.model.Prescription;
import com.PracticeManagement.Manage.service.PrescriptionService;

@RestController
public class PrescriptionController {
	@Autowired
	private PrescriptionService prescriptionService;
	
	@GetMapping("/prescriptions")
	public List<Prescription> getPrescription(){
		return prescriptionService.getAll();
	}
	
	@GetMapping("/prescriptions/{id}")
	public Prescription getPrescriptionById(@PathVariable String id) {
		return prescriptionService.getById(id);
	}
	
	@PostMapping("/prescriptions")
	public String savePrescription(@RequestBody Prescription prescription) {
		return prescriptionService.save(prescription) + " object is save.";
	}
	
	@PutMapping("/prescriptions/{id}")
	public String updatePrescription(@RequestBody Prescription prescription, @PathVariable String id) {
		return prescriptionService.update(prescription, id) + " object is update.";
	}
	
	@DeleteMapping("/prescriptions/{id}")
	public String deletePrescription(@PathVariable String id) {
		return prescriptionService.delete(id) + " object is delete.";
	}
}
