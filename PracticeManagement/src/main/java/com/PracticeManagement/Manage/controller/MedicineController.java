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

import com.PracticeManagement.Manage.model.Medicine;
import com.PracticeManagement.Manage.service.MedicineService;

@RestController
public class MedicineController {
	
	@Autowired
	private MedicineService medicineService;
	
	@GetMapping("/medicines")
	public List<Medicine> getMedicine(){
		return medicineService.getAll();
	}
	
	@GetMapping("/medicines/{id}")
	public Medicine getMedicineById(@PathVariable String id) {
		return medicineService.getById(id);
	}
	
	@PostMapping("/medicines")
	public String saveMedicine(@RequestBody Medicine medicine) {
		return medicineService.save(medicine) + " object is save.";
	}
	
	@PutMapping("/medicines/{id}")
	public String updateMedicine(@RequestBody Medicine medicine, @PathVariable String id) {
		return medicineService.update(medicine, id) + " object is update.";
	}
	
	@DeleteMapping("/medicines/{id}")
	public String deleteMedicine(@PathVariable String id) {
		return medicineService.delete(id) + " object is delete.";
	}
}
