package com.PracticeManagement.Manage.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
import com.PracticeManagement.Manage.utils.InsertDBDoctorMultiThreads;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private InsertDBDoctor dbDoctor;
	
	@Autowired
	private InsertDBDoctorMultiThreads dbDoctorMultiThreads; 
	
	@RequestMapping("/savedata")
	public void savedata() throws Exception{
		dbDoctor.saveDoctorData();
	}
	
	@RequestMapping("/savedatamultithread")
	@Transactional(rollbackFor = Exception.class)
	public String savedatamultithread(){
		System.out.println("Loading...");
		dbDoctorMultiThreads.readDoctorData();
		CompletableFuture<String> doctor1 = dbDoctorMultiThreads.saveDoctor();
		CompletableFuture<String> doctor2 = dbDoctorMultiThreads.saveDoctor1();
		CompletableFuture<String> doctor3 = dbDoctorMultiThreads.saveDoctor2();
		CompletableFuture.allOf(doctor1,doctor2,doctor3).join();
		return "Done";
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
