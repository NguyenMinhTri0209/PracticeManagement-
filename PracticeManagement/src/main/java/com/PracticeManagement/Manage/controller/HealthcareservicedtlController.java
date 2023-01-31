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

import com.PracticeManagement.Manage.model.Healthcareservicedtl;
import com.PracticeManagement.Manage.service.HealthcareservicedtlServices;

@RestController
public class HealthcareservicedtlController {
	
	@Autowired
	HealthcareservicedtlServices healthcareservicedtlServices;
	
	@GetMapping("/healthcareservicedtlservices")
	public List<Healthcareservicedtl> getHealthcareservicedtl(){
		return healthcareservicedtlServices.getAll();
	}
	
	@GetMapping("/healthcareservicedtlservices/{id}")
	public List<Healthcareservicedtl> getHealthcareservicedtlById(@PathVariable String id) {
		return healthcareservicedtlServices.getById(id);
	}
	
	@PostMapping("/healthcareservicedtlservices")
	public String saveHealthcareservicedtl(@RequestBody Healthcareservicedtl healthcareservicedtl) {
		return healthcareservicedtlServices.save(healthcareservicedtl) + " object is save.";
	}
	
	@PutMapping("/healthcareservicedtlservices/{id}")
	public String updateHealthcareservicedtl(@RequestBody Healthcareservicedtl healthcareservicedtl, @PathVariable String id) {
		return healthcareservicedtlServices.update(healthcareservicedtl, id) + " object is update.";
	}
	
	@DeleteMapping("/healthcareservicedtlservices/{id}")
	public String deleteHealthcareservicedtl(@PathVariable String id) {
		return healthcareservicedtlServices.delete(id) + " object is delete.";
	}
	
}
