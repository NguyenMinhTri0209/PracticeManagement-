package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Healthrecord;
import com.PracticeManagement.Manage.service.HealthrecordService;

@Repository
public class HealthrecordServiceImp implements HealthrecordService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Healthrecord healthrecord) {
		return jdbcTemplate.update("insert into healthrecord values(?,?,?,?,?,?)", new Object[] {healthrecord.getIdhealthrecord(), healthrecord.getStartdate(), healthrecord.getIddoctor(), healthrecord.getIdpatient(), healthrecord.getIddisease(), healthrecord.getCost()});
	}

	@Override
	public int update(Healthrecord healthrecord, String id) {
		return jdbcTemplate.update("update healthrecord set startdate=?, iddoctor=?, idpatient=?, iddisease=?, cost=? where idhealthrecord=?", new Object[] {healthrecord.getStartdate(), healthrecord.getIddoctor(), healthrecord.getIdpatient(), healthrecord.getIddisease(), healthrecord.getCost(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from healthrecord where idhealthrecord=?", id);
	}

	@Override
	public List<Healthrecord> getAll() {
		List<Healthrecord> Healthrecord = jdbcTemplate.query("select * from healthrecord", new BeanPropertyRowMapper<Healthrecord>(Healthrecord.class));
		return Healthrecord;
	}

	@Override
	public Healthrecord getById(String id) {
		return jdbcTemplate.queryForObject("select * from healthrecord where idhealthrecord=?", new BeanPropertyRowMapper<Healthrecord>(Healthrecord.class), id);
	}
	
}
