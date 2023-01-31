package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Tofservice;
import com.PracticeManagement.Manage.service.TofserviceService;

@Repository
public class TofserviceServiceImp implements TofserviceService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Tofservice tofservice) {
		return jdbcTemplate.update("insert into tofservice values(?,?,?)", new Object[] {tofservice.getIdservice(), tofservice.getName(), tofservice.getCost()});
	}

	@Override
	public int update(Tofservice tofservice, String id) {
		return jdbcTemplate.update("update tofservice set name=?, cost=? where idservice=?", new Object[] {tofservice.getName(), tofservice.getCost(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from tofservice where idservice=?", id);
	}

	@Override
	public List<Tofservice> getAll() {
		List<Tofservice> tofservices = jdbcTemplate.query("select * from tofservice", new BeanPropertyRowMapper<Tofservice>(Tofservice.class));
		return tofservices;
	}

	@Override
	public Tofservice getById(String id) {
		return jdbcTemplate.queryForObject("select * from tofservice where idservice=?", new BeanPropertyRowMapper<Tofservice>(Tofservice.class), id);
	}
	
}	
