package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Faculty;
import com.PracticeManagement.Manage.service.FacultyService;

@Repository
public class FacultyServiceImp implements FacultyService{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Faculty faculty) {
		return jdbcTemplate.update("insert into faculty values(?,?)", new Object[] {faculty.getIdfaculty(), faculty.getName()});
	}

	@Override
	public int update(Faculty faculty, String id) {
		return jdbcTemplate.update("update faculty set name=? where idfaculty=?",new Object[] {faculty.getName(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from faculty where idfaculty=?", id);
	}

	@Override
	public List<Faculty> getAll() {
		List<Faculty> faculties = jdbcTemplate.query("select * from faculty", new BeanPropertyRowMapper<Faculty>(Faculty.class));
		return faculties;
	}

	@Override
	public Faculty getById(String id) {
		return jdbcTemplate.queryForObject("select * from faculty where idfaculty=?", new BeanPropertyRowMapper<Faculty>(Faculty.class), id);
	}
	
}
