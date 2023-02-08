package com.PracticeManagement.Manage.controller;

import java.net.URI;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.PracticeManagement.Manage.model.Doctor;
import com.PracticeManagement.Manage.service.DoctorService;
import com.PracticeManagement.Manage.utils.InsertDBDoctor;
import com.PracticeManagement.Manage.utils.InsertDBDoctorMultiThreads;

@RestController
public class DoctorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DoctorController.class);
	
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
	public String savedatamultithread() throws Exception{
		dbDoctorMultiThreads.readDoctorData();
		CompletableFuture<String> doctor1 = dbDoctorMultiThreads.saveDoctor(dbDoctorMultiThreads.getDoctorList1());
		CompletableFuture<String> doctor2 = dbDoctorMultiThreads.saveDoctor(dbDoctorMultiThreads.getDoctorList2());
		CompletableFuture<String> doctor3 = dbDoctorMultiThreads.saveDoctor(dbDoctorMultiThreads.getDoctorList3());
		CompletableFuture.allOf(doctor1,doctor2,doctor3).join();
		return "Done";
	}
	
	@GetMapping("/doctors")
	public List<Doctor> getDoctor(){
		LOGGER.info("Đọc dữ liệu bác sĩ");
		return doctorService.getAll();
	}
	
	@GetMapping("/doctors/{id}")
	public Doctor getDoctorById(@PathVariable String id) {
		return doctorService.getById(id);
	}
	
	@RequestMapping(value="/doctors", method=RequestMethod.POST)
	public HttpEntity<Doctor> saveDoctor(@RequestBody Doctor doctor) {
//		return doctorService.save(doctor) + " object is save.";
		try {
	        Doctor Doctor = doctorService.save(doctor);
	        return ResponseEntity.created(new URI("/doctors" + Doctor.getIddoctor()))
	                .body(doctor);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	    }
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
