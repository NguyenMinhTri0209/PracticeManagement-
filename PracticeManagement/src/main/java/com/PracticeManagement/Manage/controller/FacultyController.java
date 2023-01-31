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

import com.PracticeManagement.Manage.model.Faculty;
import com.PracticeManagement.Manage.service.FacultyService;

@RestController
public class FacultyController {
	
	@Autowired
	FacultyService facultyService;
	
	@GetMapping("/facutlies")
	public List<Faculty> getFaculty(){
		return facultyService.getAll();
	}
	
	@GetMapping("/facutlies/{id}")
	public Faculty getFacultyById(@PathVariable String id) {
		return facultyService.getById(id);
	}
	
	@PostMapping("/facutlies")
	public String saveFaculty(@RequestBody Faculty faculty) {
		return facultyService.save(faculty) + " object is save.";
	}
	
	@PutMapping("/facutlies/{id}")
	public String updateFaculty(@RequestBody Faculty faculty, @PathVariable String id) {
		return facultyService.update(faculty, id) + " object is update.";
	}
	
	@DeleteMapping("/facutlies/{id}")
	public String deleteFaculty(@PathVariable String id) {
		return facultyService.delete(id) + " object is delete.";
	}
}
