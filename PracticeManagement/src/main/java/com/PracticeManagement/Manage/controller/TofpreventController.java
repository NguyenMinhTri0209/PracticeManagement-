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

import com.PracticeManagement.Manage.model.Tofprevent;
import com.PracticeManagement.Manage.service.TofpreventService;

@RestController
public class TofpreventController {
	
	@Autowired
	private TofpreventService tofpreventService;
	
	@GetMapping("/tofprevents")
	public List<Tofprevent> getTofprevent(){
		return tofpreventService.getAll();
	}
	
	@GetMapping("/tofprevents/{id}")
	public Tofprevent getTofpreventById(@PathVariable String id) {
		return tofpreventService.getById(id);
	}
	
	@PostMapping("/tofprevents")
	public String saveTofprevent(@RequestBody Tofprevent tofprevent) {
		return tofpreventService.save(tofprevent) + " object is save.";
	}
	
	@PutMapping("/tofprevents/{id}")
	public String updateTofprevent(@RequestBody Tofprevent tofprevent, @PathVariable String id) {
		return tofpreventService.update(tofprevent, id) + " object is update.";
	}
	
	@DeleteMapping("/tofprevents/{id}")
	public String deleteTofprevent(@PathVariable String id) {
		return tofpreventService.delete(id) + " object is delete.";
	}
}
