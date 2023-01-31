package com.PracticeManagement.Manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PracticeManagement.Manage.model.Doctor;
import com.PracticeManagement.Manage.service.DoctorService;
import com.PracticeManagement.Manage.utils.InsertDBDoctor;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private InsertDBDoctor dbDoctor;
	
	@RequestMapping("/savedata")
	public void savedata() throws Exception{
		dbDoctor.saveDoctorData();
	}
	
	@GetMapping("/doctors")
	public List<Doctor> getDoctor(){
		return doctorService.getAll();
	}
	
	@GetMapping("/doctors/{id}")
	public Doctor getDoctorById(@PathVariable String id) {
		return doctorService.getById(id);
	}
	
	@PostMapping("/doctors")
	public String saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.save(doctor) + " object is save.";
	}
	
	@PutMapping("/doctors/{id}")
	public String updateDoctor(@RequestBody Doctor doctor, @PathVariable String id) {
		return doctorService.update(doctor, id) + " object is update.";
	}
	
	@DeleteMapping("/doctors/{id}")
	public String deleteDoctor(@PathVariable String id) {
		return doctorService.delete(id) + " object is delete.";
	}
}
