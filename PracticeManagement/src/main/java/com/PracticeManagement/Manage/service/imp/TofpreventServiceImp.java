package com.PracticeManagement.Manage.service.imp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.PracticeManagement.Manage.model.Prevent;
import com.PracticeManagement.Manage.model.Tofprevent;
import com.PracticeManagement.Manage.service.ReceiptService;
import com.PracticeManagement.Manage.service.TofpreventService;

@Repository
public class TofpreventServiceImp implements TofpreventService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ReceiptService receiptService;
	
	@Override
	public int save(Tofprevent tofprevent) {
		return jdbcTemplate.update("insert into tofprevent values(?,?,?,?,?)", new Object[] {tofprevent.getIdtofroom(), tofprevent.getName(), tofprevent.getQuantities(), tofprevent.isStatus(), tofprevent.getCost()});
	}

	@Override
	public int update(Tofprevent tofprevent, String id) {
		return jdbcTemplate.update("update tofprevent set name=?, quantities=?, status=?, cost=? where idtofroom=?", new Object[] {tofprevent.getName(), tofprevent.getQuantities(), tofprevent.isStatus(), tofprevent.getCost(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from tofprevent where idtofroom=?", id);
	}

	@Override
	public List<Tofprevent> getAll() {
		List<Tofprevent> tofprevents = jdbcTemplate.query("select * from tofprevent", new BeanPropertyRowMapper<Tofprevent>(Tofprevent.class));
		return tofprevents;
	}

	@Override
	public Tofprevent getById(String id) {
		return jdbcTemplate.queryForObject("select * from tofprevent where idtofroom=?", new BeanPropertyRowMapper<Tofprevent>(Tofprevent.class), id);
	}
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateCostofRoom(Tofprevent tofprevent, String id) {
		jdbcTemplate.update("update tofprevent set cost=? where idtofroom=?", new Object[] {tofprevent.getCost(), id});
		List<Prevent> list = jdbcTemplate.query("select idpatient from prevent as pr, tofprevent as prdtl where pr.idtofroom = prdtl.idtofroom and pr.idtofroom=?",new BeanPropertyRowMapper<Prevent>(Prevent.class),id);
		for(int i=0; i<list.size()-1; i++) {
			receiptService.checkBill(list.get(i).getIdpatient());
		}
	}
}
