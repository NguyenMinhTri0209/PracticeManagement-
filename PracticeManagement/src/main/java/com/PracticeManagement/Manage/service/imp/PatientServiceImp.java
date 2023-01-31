package com.PracticeManagement.Manage.service.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Patient;
import com.PracticeManagement.Manage.service.PatientService;

@Repository
public class PatientServiceImp implements PatientService{

	@Autowired
	JdbcTemplate jdbcTemplate;

	// insert 
	@Override
	public int save(Patient patient) {
		
		// tự sinh mã bệnh nhân khi insert một bệnh nhân mới
		List<Patient> patients = jdbcTemplate.query("select idpatient from patient", new BeanPropertyRowMapper<Patient>(Patient.class));
		int count = jdbcTemplate.queryForObject("select count(idpatient) from patient", Integer.class);
		List<Integer> listPatientList = new ArrayList<>();
		for(int i = 0; i < count; i++) {
			listPatientList.add(Integer.parseInt(patients.get(i).getIdpatient().substring(2)));
		}
		Collections.sort(listPatientList);
		int index = listPatientList.get(listPatientList.size()-1) + 1;
		String idpatient;
	
		if(index < 10) 
			idpatient = "BN0" + index;
		else
			idpatient = "BN" + index;
		
		return jdbcTemplate.update("insert into patient values(?,?,?,?,?,?,?,?)", new Object[] {idpatient, patient.getName(), patient.getBirthday(), patient.getAddress(), patient.isSex(), patient.getRequests(), patient.getObjects(), patient.getPhone()});
	}

	//update
	@Override
	public int update(Patient patient, String id) {
		return jdbcTemplate.update("update patient set name=?, birthday=?, address=?, sex=?, requests=?, objects=?, phone=? where idpatient=?",new Object[] {patient.getName(), patient.getBirthday(), patient.getAddress(), patient.isSex(), patient.getRequests(), patient.getObjects(), patient.getPhone(), id});
	}

	//delete
	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from patient where idpatient=?", id);
	}

	//select all
	@Override
	public List<Patient> getAll() {
		List<Patient> patients = jdbcTemplate.query("select * from patient", new BeanPropertyRowMapper<Patient>(Patient.class));
		return patients;
	}

	//select by id
	@Override
	public Patient getById(String id) {
		return jdbcTemplate.queryForObject("select * from patient where idpatient=?", new BeanPropertyRowMapper<Patient>(Patient.class), id);
	}

}
