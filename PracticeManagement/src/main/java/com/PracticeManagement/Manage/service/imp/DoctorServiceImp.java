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

@Repository
public class DoctorServiceImp implements DoctorService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int save(Doctor doctor) {
		
//		Tự sinh mã bác sĩ
		
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

	@Override
	public int update(Doctor doctor, String id) {
		return jdbcTemplate.update("update doctor set idfaculty=?, name=?, address=?, phone=?, sex=?, birthday=? where iddoctor=?", new Object[] {doctor.getIdfaculty(), doctor.getName(), doctor.getAddress(), doctor.getPhone(), doctor.isSex(), doctor.getBirthday(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from doctor where iddoctor=?", id);
	}

	@Override
	public List<Doctor> getAll() {
		List<Doctor> Doctor = jdbcTemplate.query("select * from doctor", new BeanPropertyRowMapper<Doctor>(Doctor.class));
		return Doctor;
	}

	@Override
	public Doctor getById(String id) {
		return jdbcTemplate.queryForObject("select * from doctor where iddoctor=?", new BeanPropertyRowMapper<Doctor>(Doctor.class), id);
	}
	
}
