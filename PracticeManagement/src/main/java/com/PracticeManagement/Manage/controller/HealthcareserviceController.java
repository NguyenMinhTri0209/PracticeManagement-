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

import com.PracticeManagement.Manage.model.Healthcareservice;
import com.PracticeManagement.Manage.service.HealthcareserviceService;

@RestController
public class HealthcareserviceController {
	
	@Autowired
	HealthcareserviceService healthcareserviceService;
	
	@GetMapping("/healthcareserviceservices")
	public List<Healthcareservice> getHealthcareservice(){
		return healthcareserviceService.getAll();
	}
	
	@GetMapping("/healthcareserviceservices/{id}")
	public Healthcareservice getHealthcareserviceById(@PathVariable String id) {
		return healthcareserviceService.getById(id);
	}
	
	@PostMapping("/healthcareserviceservices")
	public String saveHealthcareservice(@RequestBody Healthcareservice healthcareservice) {
		return healthcareserviceService.save(healthcareservice) + " object is save.";
	}
	
	@PutMapping("/healthcareserviceservices/{id}")
	public String updateHealthcareservice(@RequestBody Healthcareservice healthcareservice, @PathVariable String id) {
		return healthcareserviceService.update(healthcareservice, id) + " object is update.";
	}
	
	@DeleteMapping("/healthcareserviceservices/{id}")
	public String deleteHealthcareservice(@PathVariable String id) {
		return healthcareserviceService.delete(id) + " object is delete.";
	}
}
