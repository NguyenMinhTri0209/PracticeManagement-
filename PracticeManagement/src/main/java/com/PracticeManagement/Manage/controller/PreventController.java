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

import com.PracticeManagement.Manage.model.Prevent;
import com.PracticeManagement.Manage.service.PreventService;

@RestController
public class PreventController {
	
	@Autowired
	private PreventService preventService;
	
	@GetMapping("/prevents")
	public List<Prevent> getPrevent(){
		return preventService.getAll();
	}
	
	@GetMapping("/prevents/{id}")
	public Prevent getPreventById(@PathVariable String id) {
		return preventService.getById(id);
	}
	
	@PostMapping("/prevents")
	public String savePrevent(@RequestBody Prevent prevent) {
		return preventService.save(prevent) + " object is save.";
	}

	@PutMapping("/prevents/{id}")
	public String updatePrevent(@RequestBody Prevent prevent, @PathVariable String id) {
		return preventService.update(prevent, id) + " object is update.";
	}
	
	@DeleteMapping("/prevents/{id}")
	public String deletePrevent(@PathVariable String id) {
		return preventService.delete(id) + " object is delete.";
	}
}
