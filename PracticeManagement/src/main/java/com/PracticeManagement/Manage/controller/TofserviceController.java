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

import com.PracticeManagement.Manage.model.Tofservice;
import com.PracticeManagement.Manage.service.TofserviceService;

@RestController
public class TofserviceController {
	
	@Autowired
	private TofserviceService tofserviceService;
	
	@GetMapping("/tofservices")
	public List<Tofservice> getTofservice(){
		return tofserviceService.getAll();
	}
	
	@GetMapping("/tofservices/{id}")
	public Tofservice getTofserviceById(@PathVariable String id) {
		return tofserviceService.getById(id);
	}
	
	
	@PostMapping("/tofservices")
	public String saveTofservice(@RequestBody Tofservice tofservice) {
		return tofserviceService.save(tofservice) + " object is save.";
	}
	
	@PutMapping("/tofservices/{id}")
	public String updateTofservice(@RequestBody Tofservice tofservice, @PathVariable String id) {
		return tofserviceService.update(tofservice, id) + " object is update.";
	}
	
	@DeleteMapping("/tofservices/{id}")
	public String deleteTofservice(@PathVariable String id) {
		return tofserviceService.delete(id) + " object is delete.";
	}
}
