package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Medicine;
import com.PracticeManagement.Manage.service.MedicineService;

@Repository
public class MedicineServiceImp implements MedicineService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Medicine medicine) {
		return jdbcTemplate.update("insert into medicine values(?,?,?,?,?)",new Object[] {medicine.getIdmedicine(), medicine.getName(), medicine.getCost(), medicine.getUnit(), medicine.getIdsupplier()}); 
	}

	@Override
	public int update(Medicine medicine, String id) {
		return jdbcTemplate.update("update medicine set name=?, cost=?, unit=?, idsupplier=? where idmedicine=?",new Object[] {medicine.getName(), medicine.getCost(), medicine.getUnit(), medicine.getIdsupplier(),id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from medicine where idmedicine=?",id);
	}

	@Override
	public List<Medicine> getAll() {
		List<Medicine> medicine = jdbcTemplate.query("select * from medicine", new BeanPropertyRowMapper<Medicine>(Medicine.class));
		return medicine;
	}

	@Override
	public Medicine getById(String id) {
		return jdbcTemplate.queryForObject("select * from medicine where idmedicine=?", new BeanPropertyRowMapper<Medicine>(Medicine.class), id);
	}
	
}
