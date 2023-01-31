package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Receipt;
import com.PracticeManagement.Manage.model.Tofservice;
import com.PracticeManagement.Manage.service.ReceiptService;
@Repository
public class ReceiptServiceImp implements ReceiptService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Receipt receipt) {
		return jdbcTemplate.update("insert into receipt values(?,?,?,?)", new Object[] {receipt.getIdreceipt(), receipt.getIdemployee(), receipt.getIdpatient(), receipt.getCheckatdate()});
	}

	@Override
	public int update(Receipt receipt, String id) {
		return jdbcTemplate.update("update receipt set idemployee=?, idpatient=?, checkatdate=? where idreceipt=?", new Object[] {receipt.getIdemployee(), receipt.getIdpatient(), receipt.getCheckatdate(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from receipt where idreceipt=?", id);
	}

	@Override
	public List<Receipt> getAll() {
		List<Receipt> receipts = jdbcTemplate.query("select * from receipt", new BeanPropertyRowMapper<Receipt>(Receipt.class));
		return receipts;
	}

	@Override
	public Receipt getById(String id) {
		return jdbcTemplate.queryForObject("select * from receipt where idreceipt=?", new BeanPropertyRowMapper<Receipt>(Receipt.class), id);

	}

	// Biên lai bệnh nhân, tham số truyền vào là mã bệnh nhân
	@Override
	public long checkBill(String id) {
		
		//lấy giảm giá
		float temp = jdbcTemplate.queryForObject("select discount from receiptdtl as redtl, receipt as re where re.idreceipt = redtl.idreceipt and re.idpatient = ?", Float.class, id);
		float discount;
		if(temp == 0)
			discount = 1;
		else
			discount = temp;
		
		//tiền dịch vụ khám
		long costofservice = jdbcTemplate.queryForObject("select sum(cost) from tofservice as tofsr, healthcareservice as hs, healthcareservicedtl as hsdtl where hs.idhealthcareservice = hsdtl.idhealthcareservice and hsdtl.idservice = tofsr.idservice and idpatient=? group by idpatient",Long.class,id);
		
		//tiền phòng bệnh
		long costofprevent = jdbcTemplate.queryForObject("select sum(cost) from prevent as pr, tofprevent as tofpr where pr.idtofroom = tofpr.idtofroom and idpatient=? group by idpatient",Long.class,id);
		
		//tiền phiếu xét nghiệm
		long costoftest = jdbcTemplate.queryForObject("select sum(cost) from testdtl as t, toftest as toft where t.idtoftest = toft.idtoftest and idpatient=? group by idpatient",Long.class,id);
		
		//tổng số tiền
		long sum = (long)((costofservice + costofprevent + costoftest) * discount);
		
		System.out.println(costofservice +" "+ costofprevent + " " + costoftest + " " + discount);
		
		return sum;
	}
	
}
