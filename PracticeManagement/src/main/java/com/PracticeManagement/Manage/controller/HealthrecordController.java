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

import com.PracticeManagement.Manage.model.Healthrecord;
import com.PracticeManagement.Manage.service.HealthrecordService;

@RestController
public class HealthrecordController {
	@Autowired
	private HealthrecordService healthrecordService;
	
	@GetMapping("/healthrecordservices")
	public List<Healthrecord> getHealthrecord(){
		return healthrecordService.getAll();
	}
	
	@GetMapping("/healthrecordservices/{id}")
	public Healthrecord getHealthrecordById(@PathVariable String id) {
		return healthrecordService.getById(id);
	}
	
	@PostMapping("/healthrecordservices")
	public String saveHealthrecord(@RequestBody Healthrecord healthrecord) {
		return healthrecordService.save(healthrecord) + " object is save.";
	}
	
	@PutMapping("/healthrecordservices/{id}")
	public String updateHealthrecord(@RequestBody Healthrecord healthrecord, @PathVariable String id) {
		return healthrecordService.update(healthrecord, id) + " object is update.";
	}
	
	@DeleteMapping("/healthrecordservices/{id}")
	public String deleteHealthrecord(@PathVariable String id) {
		return healthrecordService.delete(id) + " object is delete.";
	}
}
