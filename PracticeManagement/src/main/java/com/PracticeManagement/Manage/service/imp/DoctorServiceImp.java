package com.PracticeManagement.Manage.service.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Doctor;
import com.PracticeManagement.Manage.service.DoctorService;

/**
 * Implement DoctorService interface chứa các phương thức thao tác với đối tượng Doctor trong database
 * @author Nguyễn Minh Trí
 * @see Doctor
 */

@Repository
public class DoctorServiceImp implements DoctorService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * Đây là phương thức lưu một đối tượng doctor vào database
	 * @param doctor Đây là đối tượng doctor cần lưu
	 * @return int Trả về 1 hoặc 0 khi đối tượng doctor được lưu thành công hoặc không thành công
	 */
	@Override
	public int save(Doctor doctor) {
		
//		Tự sinh id bác sĩ
		
//		List<Doctor> doctors = jdbcTemplate.query("select iddoctor from doctor", new BeanPropertyRowMapper<Doctor>(Doctor.class));
//		int count = jdbcTemplate.queryForObject("select count(iddoctor) from doctor", Integer.class);
//		List<Integer> listDoctorList = new ArrayList<>();
//		for(int i = 0; i < count; i++) {
//			listDoctorList.add(Integer.parseInt(doctors.get(i).getIddoctor().substring(2)));
//		}
//		Collections.sort(listDoctorList);
//		int index = listDoctorList.get(listDoctorList.size()-1) + 1;
//		String iddoctor;
//	
//		if(index < 10) 
//			iddoctor = "BS0" + index;
//		else
//			iddoctor = "BS" + index;
//		return jdbcTemplate.update("insert into doctor values(?,?,?,?,?,?,?)", new Object[] {iddoctor, doctor.getIdfaculty(), doctor.getName(), doctor.getAddress(), doctor.getPhone(), doctor.isSex(), doctor.getBirthday()});

		return jdbcTemplate.update("insert into doctor values(?,?,?,?,?,?,?)", new Object[] {doctor.getIddoctor(), doctor.getIdfaculty(), doctor.getName(), doctor.getAddress(), doctor.getPhone(), doctor.isSex(), doctor.getBirthday()});

	}

	/**
	 * Đây là phương thức cập nhật lại một đối tượng doctor trong database
	 * @param doctor Đây là đối tượng doctor cần lưu
	 * @param id Đây là iddoctor trong database
	 * @return int Trả về 1 hoặc 0 khi đối tượng doctor được cập nhật thành công hoặc không thành công
	 */
	@Override
	public int update(Doctor doctor, String id) {
		return jdbcTemplate.update("update doctor set idfaculty=?, name=?, address=?, phone=?, sex=?, birthday=? where iddoctor=?", new Object[] {doctor.getIdfaculty(), doctor.getName(), doctor.getAddress(), doctor.getPhone(), doctor.isSex(), doctor.getBirthday(), id});
	}

	/**
	 * Đây là phương thức xóa một đối tượng doctor trong database
	 * @param id Đây là iddoctor trong database
	 * @return Trả về 1 hoặc 0 khi đối tượng doctor được xóa thành công hoặc không thành công
	 */
	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from doctor where iddoctor=?", id);
	}

	/**
	 * Đây là phương thức lấy các đối tượng doctor trong database
	 * @return Doctor Trả về danh sách các đối tượng doctor trong database 
	 */
	@Override
	public List<Doctor> getAll() {
		List<Doctor> Doctor = jdbcTemplate.query("select * from doctor", new BeanPropertyRowMapper<Doctor>(Doctor.class));
		return Doctor;
	}

	/**
	 * Đây là phương thức lấy các đối tượng doctor theo iddoctor trong database
	 * @param id Đây là iddoctor trong database
	 * @return Trả về 1 hoặc 0 khi có một đối tượng diasease có trong database
	 */
	@Override
	public Doctor getById(String id) {
		return jdbcTemplate.queryForObject("select * from doctor where iddoctor=?", new BeanPropertyRowMapper<Doctor>(Doctor.class), id);
	}
	
}
