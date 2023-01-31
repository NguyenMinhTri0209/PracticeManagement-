package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Medicalrecord;
import com.PracticeManagement.Manage.service.MedicalrecordService;

@Repository
public class MedicalrecordServiceImp implements MedicalrecordService{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Medicalrecord medicalrecord) {
		return jdbcTemplate.update("insert into medicalrecord values(?,?,?,?,?,?)", new Object[] {medicalrecord.getIdmedicalrecord(), medicalrecord.getStartdate(), medicalrecord.getEndstart(), medicalrecord.getReason(), medicalrecord.getIdpatient(), medicalrecord.getIddoctor()});
	}

	@Override
	public int update(Medicalrecord medicalrecord, String id) {
		return jdbcTemplate.update("update medicalrecord set startdate=?, endstart=?, reason=?, idpatient=?, iddoctor=? where idmedicalrecord=?", new Object[] {medicalrecord.getStartdate(), medicalrecord.getEndstart(), medicalrecord.getReason(), medicalrecord.getIdpatient(), medicalrecord.getIddoctor(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from medicalrecord where idmedicalrecord=?", id);
	}

	@Override
	public List<Medicalrecord> getAll() {
		List<Medicalrecord> Medicalrecord = jdbcTemplate.query("select * from medicalrecord", new BeanPropertyRowMapper<Medicalrecord>(Medicalrecord.class));
		return Medicalrecord;
	}

	@Override
	public Medicalrecord getById(String id) {
		return jdbcTemplate.queryForObject("select * from medicalrecord where idmedicalrecord=?", new BeanPropertyRowMapper<Medicalrecord>(Medicalrecord.class), id);
	}
	
	
	
}
