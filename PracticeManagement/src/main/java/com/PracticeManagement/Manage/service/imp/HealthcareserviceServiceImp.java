package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Healthcareservice;
import com.PracticeManagement.Manage.service.HealthcareserviceService;

@Repository
public class HealthcareserviceServiceImp implements HealthcareserviceService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Healthcareservice healthcareservice) {
		return jdbcTemplate.update("insert into healthcareservice values(?,?)", new Object[] {healthcareservice.getIdhealthcareservice(), healthcareservice.getIdpatient()});
	}

	@Override
	public int update(Healthcareservice healthcareservice, String id) {
		return jdbcTemplate.update("update healthcareservice set idpatient=? where idhealthcareservice=?", new Object[] {healthcareservice.getIdpatient(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from healthcareservice where idhealthcareservice =?", id);
	}

	@Override
	public List<Healthcareservice> getAll() {
		List<Healthcareservice> healthcareservices = jdbcTemplate.query("select * from healthcareservice", new BeanPropertyRowMapper<Healthcareservice>(Healthcareservice.class));
		return healthcareservices;
	}

	@Override
	public Healthcareservice getById(String id) {
		return jdbcTemplate.queryForObject("select * from healthcareservice where idhealthcareservice=?", new BeanPropertyRowMapper<Healthcareservice>(Healthcareservice.class), id);
	}

	
}
