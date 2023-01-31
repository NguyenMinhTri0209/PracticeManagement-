package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Prescription;
import com.PracticeManagement.Manage.service.PrescriptionService;

@Repository
public class PrescriptionServiceImp implements PrescriptionService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Prescription prescription) {
		return jdbcTemplate.update("insert into prescription values(?,?,?)", new Object[] {prescription.getIdprescription(), prescription.getIdpatient(), prescription.getIddoctor()});
	}

	@Override
	public int update(Prescription prescription, String id) {
		return jdbcTemplate.update("update prescription set idpatient=?, iddoctor=? where idprescription=?", new Object[] {prescription.getIdpatient(), prescription.getIddoctor(),id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from prescription where idprescription=?",id);
	}

	@Override
	public List<Prescription> getAll() {
		List<Prescription> prescriptions = jdbcTemplate.query("select * from prescription", new BeanPropertyRowMapper<Prescription>(Prescription.class));
		return prescriptions;
	}

	@Override
	public Prescription getById(String id) {
		return jdbcTemplate.queryForObject("select * from prescription where idprescription=?",new BeanPropertyRowMapper<Prescription>(Prescription.class),id);
	}
	
}
