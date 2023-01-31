package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Prescriptiondtl;
import com.PracticeManagement.Manage.service.PrescriptiondtlService;

@Repository
public class PrescriptiondtlServiceImp implements PrescriptiondtlService{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Prescriptiondtl prescriptiondtl) {
		return jdbcTemplate.update("insert into prescriptiondtl values(?,?,?)", new Object[] {prescriptiondtl.getIdprescription(), prescriptiondtl.getIdmedicine(), prescriptiondtl.getAmount()});
	}


	@Override
	public List<Prescriptiondtl> getAll() {
		List<Prescriptiondtl> prescriptiondtls = jdbcTemplate.query("select * from prescriptiondtl", new BeanPropertyRowMapper<Prescriptiondtl>(Prescriptiondtl.class));
		return prescriptiondtls;
	}


	@Override
	public List<Prescriptiondtl> getById(String idprescription) {
		List<Prescriptiondtl> prescriptiondtls = jdbcTemplate.query("select * from prescriptiondtl where idprescription=?", new BeanPropertyRowMapper<Prescriptiondtl>(Prescriptiondtl.class), idprescription);
		return prescriptiondtls;
	}

	@Override
	public Prescriptiondtl getById(String idprescription, String idmedicine) {
		return jdbcTemplate.queryForObject("select * from prescriptiondtl where idprescription=? and idmedicine=?", new BeanPropertyRowMapper<Prescriptiondtl>(Prescriptiondtl.class), idprescription, idmedicine);
	}

	@Override
	public int update(Prescriptiondtl prescriptiondtl, String idprescription, String idmedicine) {
		return jdbcTemplate.update("update prescriptiondtl set amount=? where idprescription=? and idmedicine=?", new Object[] {prescriptiondtl.getAmount(), idprescription, idmedicine});
	}


	@Override
	public int delete(String idprescription, String idmedicine) {
		return jdbcTemplate.update("delete from prescriptiondtl where idprescription=? and idmedicine=?",idprescription,idmedicine);
	}
	
}
