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

import com.PracticeManagement.Manage.model.Toftest;
import com.PracticeManagement.Manage.service.ToftestService;

@RestController
public class ToftestController {
	
	@Autowired
	private ToftestService toftestService;
	
	
	@GetMapping("/toftests")
	public List<Toftest> getDoctor(){
		return toftestService.getAll();
	}
	
	@GetMapping("/toftests/{id}")
	public Toftest getToftestById(@PathVariable String id) {
		return toftestService.getById(id);
	}
	
	@PostMapping("/toftests")
	public String saveToftest(@RequestBody Toftest toftest) {
		return toftestService.save(toftest) + " object is save.";
	}
	
	@PutMapping("/toftests/{id}")
	public String updateToftest(@RequestBody Toftest toftest, @PathVariable String id) {
		return toftestService.update(toftest, id) + " object is update.";
	}
	
	@DeleteMapping("/toftests/{id}")
	public String deleteToftest(@PathVariable String id) {
		return toftestService.delete(id) + " object is delete.";
	}
}
