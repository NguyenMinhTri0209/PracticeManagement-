package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Healthcareservicedtl;
import com.PracticeManagement.Manage.service.HealthcareservicedtlServices;

@Repository
public class HealthcareservicedtlServiceImp implements HealthcareservicedtlServices{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Healthcareservicedtl healthcareservicedtl) {
		return jdbcTemplate.update("insert into healthcareservicedtl values(?,?,?,?)", new Object[] {healthcareservicedtl.getIdhealthcareservice(), healthcareservicedtl.getIdservice(), healthcareservicedtl.getUseatdate(), healthcareservicedtl.getQuantities()});
	}

	@Override
	public int update(Healthcareservicedtl healthcareservicedtl, String id) {
		return jdbcTemplate.update("update healthcareservicedtl set idservice=?, useatdate=?, quantities =? where idhealthcareservice=?", new Object[] {healthcareservicedtl.getIdservice(), healthcareservicedtl.getUseatdate(), healthcareservicedtl.getQuantities(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from healthcareservicedtl where idhealthcareservice=?", id);
	}

	@Override
	public List<Healthcareservicedtl> getAll() {
		List<Healthcareservicedtl> healthcareservicedtls = jdbcTemplate.query("select * from healthcareservicedtl", new BeanPropertyRowMapper<Healthcareservicedtl>(Healthcareservicedtl.class));
		return healthcareservicedtls;
	}

	@Override
	public List<Healthcareservicedtl> getById(String id) {
		List<Healthcareservicedtl> healthcareservicedtls = jdbcTemplate.query("select * from healthcareservicedtl where idhealthcareservice=?", new BeanPropertyRowMapper<Healthcareservicedtl>(Healthcareservicedtl.class), id);
		return healthcareservicedtls;
	}
	
	
}
