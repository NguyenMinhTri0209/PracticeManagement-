package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Toftest;
import com.PracticeManagement.Manage.service.ToftestService;

@Repository
public class ToftestServiceImp implements ToftestService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Toftest toftest) {
		return jdbcTemplate.update("insert into toftest values(?,?,?)", new Object[] {toftest.getIdtoftest(), toftest.getName(), toftest.getCost()});
	}

	@Override
	public int update(Toftest toftest, String id) {
		return jdbcTemplate.update("update toftest set name=?, cost=? where idtoftest=?", new Object[] {toftest.getName(), toftest.getCost(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from toftest where idtoftest=?", id);
	}

	@Override
	public List<Toftest> getAll() {
		List<Toftest> toftests = jdbcTemplate.query("select * from toftest", new BeanPropertyRowMapper<Toftest>(Toftest.class));
		return toftests;
	}

	@Override
	public Toftest getById(String id) {
		return jdbcTemplate.queryForObject("select * from toftest where idtoftest=?", new BeanPropertyRowMapper<Toftest>(Toftest.class), id);
	}
	
	
}
