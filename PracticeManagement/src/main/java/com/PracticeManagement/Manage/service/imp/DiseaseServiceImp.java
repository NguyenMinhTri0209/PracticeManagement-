package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Disease;
import com.PracticeManagement.Manage.service.DiseaseService;

@Repository
public class DiseaseServiceImp implements DiseaseService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Disease disease) {
		return jdbcTemplate.update("insert into disease values(?,?,?)", new Object[] {disease.getIddisease(), disease.getName(), disease.getSymptom()});
	}

	@Override
	public int update(Disease disease, String id) {
		return jdbcTemplate.update("update disease set name=?, symptom=? where iddisease=?", new Object[] {disease.getName(), disease.getSymptom(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from disease where iddisease=?", id);
	}

	@Override
	public List<Disease> getAll() {
		List<Disease> Disease = jdbcTemplate.query("select * from disease", new BeanPropertyRowMapper<Disease>(Disease.class));
		return Disease;
	}

	@Override
	public Disease getById(String id) {
		return jdbcTemplate.queryForObject("select * from disease where iddisease=?", new BeanPropertyRowMapper<Disease>(Disease.class), id);
	}

}
