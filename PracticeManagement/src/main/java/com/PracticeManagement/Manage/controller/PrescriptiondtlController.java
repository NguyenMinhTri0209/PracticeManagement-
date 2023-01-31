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

import com.PracticeManagement.Manage.model.Prescriptiondtl;
import com.PracticeManagement.Manage.service.PrescriptiondtlService;

@RestController
public class PrescriptiondtlController {
	
	@Autowired
	private PrescriptiondtlService prescriptiondtlService;
	
	@GetMapping("/prescriptiondts")
	public List<Prescriptiondtl> getPrescriptiondtl(){
		return prescriptiondtlService.getAll();
	}
	
	@GetMapping("/prescriptiondts/{idprescription}/{idmedicine}")
	public Prescriptiondtl getPrescriptiondtlById(@PathVariable String idprescription, @PathVariable String idmedicine) {
		return prescriptiondtlService.getById(idprescription, idmedicine);
	}
	
	@GetMapping("/prescriptiondts/{idprescription}")
	public List<Prescriptiondtl> getPrescriptiondtlById(@PathVariable String idprescription) {
		return prescriptiondtlService.getById(idprescription);
	}
	
	@PostMapping("/prescriptiondts")
	public String savePrescriptiondtl(@RequestBody Prescriptiondtl prescriptiondtl) {
		return prescriptiondtlService.save(prescriptiondtl) + " object is save.";
	}
	
	@PutMapping("/prescriptiondts/{ididprescription}/{ididmedicine}")
	public String updatePrescriptiondtl(@RequestBody Prescriptiondtl prescriptiondtl, @PathVariable String ididprescription, @PathVariable String ididmedicine) {
		return prescriptiondtlService.update(prescriptiondtl, ididprescription, ididmedicine) + " object is update.";
	}
	
	@DeleteMapping("/prescriptiondts/{idprescription}/{idmedicine}")
	public String deletePrescriptiondtl(@PathVariable String idprescription, @PathVariable String idmedicine) {
		return prescriptiondtlService.delete(idprescription, idmedicine) + " object is delete.";
	}
}
