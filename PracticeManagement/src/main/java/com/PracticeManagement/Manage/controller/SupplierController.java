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

import com.PracticeManagement.Manage.model.Supplier;
import com.PracticeManagement.Manage.service.SupplierService;

@RestController
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@GetMapping("/services")
	public List<Supplier> getSupplier(){
		return supplierService.getAll();
	}

	@GetMapping("/services/{id}")
	public Supplier getSupplierById(@PathVariable String id) {
		return supplierService.getById(id);
	}
	
	@PostMapping("/services")
	public String saveSupplier(@RequestBody Supplier supplier) {
		return supplierService.save(supplier) + " object is save.";
	}
	
	@PutMapping("/services/{id}")
	public String updateSupplier(@RequestBody Supplier supplier, @PathVariable String id) {
		return supplierService.update(supplier, id) + " object is update.";
	}
	
	@DeleteMapping("/services/{id}")
	public String deleteSupplier(@PathVariable String id) {
		return supplierService.delete(id) + " object is delete.";
	}
}
