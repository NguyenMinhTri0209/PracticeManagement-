package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Testdtl;
import com.PracticeManagement.Manage.service.TestdtlService;

@Repository
public class TestdtlServiceImp implements TestdtlService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Testdtl testdtl) {
		return jdbcTemplate.update("insert into testdtl values(?,?,?,?,?,?)", new Object[] {testdtl.getIdtestdtl(),testdtl.getIdtoftest(), testdtl.getIdpatient(), testdtl.getStartdate(), testdtl.getResult(), testdtl.getReason()});
	}

	@Override
	public int update(Testdtl testdtl, String id) {
		return jdbcTemplate.update("update testdtl set idtoftest=?, idpatient=?, startdate=?, result=?, reason=? where idtestdtl=?", new Object[] {testdtl.getIdtoftest(), testdtl.getIdpatient(), testdtl.getStartdate(), testdtl.getResult(), testdtl.getReason(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from testdtl where idtestdtl=?", id);
	}

	@Override
	public List<Testdtl> getById(String id) {
		List<Testdtl> testdtls = jdbcTemplate.query("select * from testdtl where idpatient=?", new BeanPropertyRowMapper<Testdtl>(Testdtl.class), id);
		return testdtls;
	}

	@Override
	public List<Testdtl> getAll() {
		List<Testdtl> testdtls = jdbcTemplate.query("select * from testdtl", new BeanPropertyRowMapper<Testdtl>(Testdtl.class));
		return testdtls;
	}

	
}
