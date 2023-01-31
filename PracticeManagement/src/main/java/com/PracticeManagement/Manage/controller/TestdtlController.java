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

import com.PracticeManagement.Manage.model.Testdtl;
import com.PracticeManagement.Manage.service.TestdtlService;

@RestController
public class TestdtlController {
		
	@Autowired
	private TestdtlService testdtlService;
	
	@GetMapping("/testdtls")
	public List<Testdtl> getTestdtl(){
		return testdtlService.getAll();
	}
	
	@GetMapping("/testdtls/{id}")
	public List<Testdtl> getTestdtlById(@PathVariable String id) {
		return testdtlService.getById(id);
	}
	
	@PostMapping("/testdtls")
	public String saveTestdtl(@RequestBody Testdtl testdtl) {
		return testdtlService.save(testdtl) + " object is save.";
	}
	
	@PutMapping("/testdtls/{id}")
	public String updateTestdtl(@RequestBody Testdtl testdtl, @PathVariable String id) {
		return testdtlService.update(testdtl, id) + " object is update.";
	}
	
	@DeleteMapping("/testdtls/{id}")
	public String deleteTestdtl(@PathVariable String id) {
		return testdtlService.delete(id) + " object is delete.";
	}
}
