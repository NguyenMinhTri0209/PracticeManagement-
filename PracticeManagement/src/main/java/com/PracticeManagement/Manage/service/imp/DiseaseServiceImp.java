package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Disease;
import com.PracticeManagement.Manage.service.DiseaseService;

/**
 *	Implement DiseaseService interface chứa các phương thức thao tác với đối tượng Disease trong database
 *	@author Nguyễn Minh Trí
 *	@see Disease
 */

@Repository
public class DiseaseServiceImp implements DiseaseService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * Đây là phương thức lưu một đối tượng disease vào database
	 * @param disease Đây là đối tượng disease cần lưu
	 * @return int Trả về 1 hoặc 0 khi đối tượng diasease được lưu thành công hoặc không thành công
	 */
	@Override
	public int save(Disease disease) {
		return jdbcTemplate.update("insert into disease values(?,?,?)", new Object[] {disease.getIddisease(), disease.getName(), disease.getSymptom()});
	}
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng disease trong database
	 * @param disease Đây là đối tượng disease cần lưu
	 * @param id Đây là iddiasease trong database
	 * @return int Trả về 1 hoặc 0 khi đối tượng diasease được cập nhật thành công hoặc không thành công
	 */
	@Override
	public int update(Disease disease, String id) {
		return jdbcTemplate.update("update disease set name=?, symptom=? where iddisease=?", new Object[] {disease.getName(), disease.getSymptom(), id});
	}

	/**
	 * Đây là phương thức xóa một đối tượng disease trong database
	 * @param id Đây là iddiasease trong database
	 * @return Trả về 1 hoặc 0 khi đối tượng diasease được xóa thành công hoặc không thành công
	 */
	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from disease where iddisease=?", id);
	}
	
	/**
	 * Đây là phương thức lấy các đối tượng disease trong database
	 * @return Disease Trả về danh sách các đối tượng diasease trong database 
	 */
	@Override
	public List<Disease> getAll() {
		List<Disease> Disease = jdbcTemplate.query("select * from disease", new BeanPropertyRowMapper<Disease>(Disease.class));
		return Disease;
	}

	/**
	 * Đây là phương thức lấy đối tượng disease theo iddiasease trong database
	 * @param id Đây là iddiasease trong database
	 * @return Trả về 1 hoặc 0 khi có một đối tượng diasease có trong database
	 */
	@Override
	public Disease getById(String id) {
		return jdbcTemplate.queryForObject("select * from disease where iddisease=?", new BeanPropertyRowMapper<Disease>(Disease.class), id);
	}

}
