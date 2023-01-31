package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Prevent;
import com.PracticeManagement.Manage.service.PreventService;

@Repository
public class PreventServiceImp implements PreventService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Prevent prevent) {
		return jdbcTemplate.update("insert into prevent values(?,?,?,?,?,?)", new Object[] {prevent.getIdprevent(), prevent.getIdtofroom(), prevent.getIdpatient(), prevent.getNumberofthebed(), prevent.getNumberoftheroom(), prevent.getRoomname()});
	}

	@Override
	public int update(Prevent prevent, String id) {
		return jdbcTemplate.update("update prevent set idtofroom=?, idpatient=?, numberofthebed=?, numberoftheroom=?, roomname=? where idprevent=?", new Object[] {prevent.getIdtofroom(), prevent.getIdpatient(), prevent.getNumberofthebed(), prevent.getNumberoftheroom(), prevent.getRoomname(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from prevent where idprevent=?", id);
	}

	@Override
	public List<Prevent> getAll() {
		List<Prevent> Prevent = jdbcTemplate.query("select * from prevent", new BeanPropertyRowMapper<Prevent>(Prevent.class));
		return Prevent;
	}

	@Override
	public Prevent getById(String id) {
		return jdbcTemplate.queryForObject("select * from prevent where idprevent=?", new BeanPropertyRowMapper<Prevent>(Prevent.class), id);
	}
	
}
