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

import com.PracticeManagement.Manage.model.Medicalrecord;
import com.PracticeManagement.Manage.service.MedicalrecordService;

@RestController
public class MedicalrecordController {

	@Autowired
	private MedicalrecordService medicalrecordService;
	
	@GetMapping("/medicalrecords")
	public List<Medicalrecord> getMedicalrecord(){
		return medicalrecordService.getAll();
	}
	
	@GetMapping("/medicalrecords/{id}")
	public Medicalrecord getMedicalrecordById(@PathVariable String id) {
		return medicalrecordService.getById(id);
	}
	
	@PostMapping("/medicalrecords")
	public String saveMedicalrecord(@RequestBody Medicalrecord medicalrecord) {
		return medicalrecordService.save(medicalrecord) + " object is save.";
	}
	
	@PutMapping("/medicalrecords/{id}")
	public String updateMedicalrecord(@RequestBody Medicalrecord medicalrecord, @PathVariable String id) {
		return medicalrecordService.update(medicalrecord, id) + " object is update.";
	}
	
	@DeleteMapping("/medicalrecords/{id}")
	public String deleteMedicalrecord(@PathVariable String id) {
		return medicalrecordService.delete(id) + " object is delete.";
	}
}
