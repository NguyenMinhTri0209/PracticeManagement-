package com.PracticeManagement.Manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.PracticeManagement.Manage.model.Patient;
import com.PracticeManagement.Manage.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patients")
	@ResponseBody
	public List<Patient> getPatient(){
		return patientService.getAll();
	}
	
	@GetMapping("/patients/{id}")
	@ResponseBody
	public Patient getPatientById(@PathVariable String id) {
		return patientService.getById(id);
	}
	
	@PostMapping("/patients")
	@ResponseBody
	public String savePatient(@RequestBody Patient patient) {
		return patientService.save(patient) + " object is save";
	}
	
	@PutMapping("/patients/{id}")
	@ResponseBody
	public String updatePatient(@RequestBody Patient patient, @PathVariable String id) {
		return patientService.update(patient, id) + " object is update.";
	}
	
	@DeleteMapping("/patients/{id}")
	@ResponseBody
	public String deletePatient(@PathVariable String id) {
		return patientService.delete(id) + " object is delete.";
	}

}
