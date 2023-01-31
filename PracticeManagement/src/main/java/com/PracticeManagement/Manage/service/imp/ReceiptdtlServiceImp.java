package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Receiptdtl;
import com.PracticeManagement.Manage.service.ReceiptdtlService;

@Repository
public class ReceiptdtlServiceImp implements ReceiptdtlService{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Receiptdtl receiptdtl) {
		return jdbcTemplate.update("insert into receiptdtl values(?,?,?)", new Object[] {receiptdtl.getIdreceipt(), receiptdtl.getDiscount(), receiptdtl.isPaymenttype()});
	}

	@Override
	public int update(Receiptdtl receiptdtl, String id) {
		return jdbcTemplate.update("update receiptdtl set discount=?, paymenttype=? where idreceipt=?", new Object[] {receiptdtl.getDiscount(), receiptdtl.isPaymenttype(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from receiptdtl where idreceipt=?", id);
	}

	@Override
	public List<Receiptdtl> getAll() {
		List<Receiptdtl> receiptdtls = jdbcTemplate.query("select * from receiptdtl", new BeanPropertyRowMapper<Receiptdtl>(Receiptdtl.class));
		return receiptdtls;
	}

	@Override
	public Receiptdtl getById(String id) {
		return jdbcTemplate.queryForObject("select * from receiptdtl where idreceipt=?", new BeanPropertyRowMapper<Receiptdtl>(Receiptdtl.class), id);
	}

}
