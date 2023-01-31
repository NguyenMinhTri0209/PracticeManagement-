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

import com.PracticeManagement.Manage.model.Disease;
import com.PracticeManagement.Manage.service.DiseaseService;

@RestController
public class DiseaseController {
	
	@Autowired
	private DiseaseService diseaseService;
	
	@GetMapping("/diseases")
	public List<Disease> getDisease(){
		return diseaseService.getAll();
	}
	
	@GetMapping("/diseases/{id}")
	public Disease getDiseaseById(@PathVariable String id) {
		return diseaseService.getById(id);
	}
	
	@PostMapping("/diseases")
	public String saveDisease(@RequestBody Disease disease) {
		return diseaseService.save(disease) + " object is save.";
	}
	
	@PutMapping("/diseases/{id}")
	public String updateDisease(@RequestBody Disease disease, @PathVariable String id) {
		return diseaseService.update(disease, id) + " object is update.";
	}
	
	@DeleteMapping("/diseases/{id}")
	public String deleteDisease(@PathVariable String id) {
		return diseaseService.delete(id) + " object is delete.";
	}
	
}
