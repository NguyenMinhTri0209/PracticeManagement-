package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Supplier;
import com.PracticeManagement.Manage.service.SupplierService;

@Repository
public class SupplierServiceImp implements SupplierService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Supplier supplier) {
		return jdbcTemplate.update("insert into supplier values(?,?,?,?)", new Object[] {supplier.getIdsupplier(), supplier.getName(), supplier.getAddress(), supplier.getPhone()});
	}

	@Override
	public int update(Supplier supplier, String id) {
		return jdbcTemplate.update("update supplier set name=?, address=?, phone=? where idsupplier=?", new Object[] {supplier.getName(), supplier.getAddress(), supplier.getPhone(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from supplier where idsupplier=?", id);
	}

	@Override
	public List<Supplier> getAll() {
		List<Supplier> suppliers = jdbcTemplate.query("select * from supplier", new BeanPropertyRowMapper<Supplier>(Supplier.class));
		return suppliers;
	}

	@Override
	public Supplier getById(String id) {
		return jdbcTemplate.queryForObject("select * from supplier where idsupplier=?", new BeanPropertyRowMapper<Supplier>(Supplier.class), id);
	}

}
