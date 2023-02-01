package com.PracticeManagement.Manage.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.PracticeManagement.Manage.model.Doctor;
import com.PracticeManagement.Manage.service.DoctorService;

@Service
public class InsertDBDoctor {
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String line = "";
	
	//insert file darabase.csv vào csdl
	public void saveDoctorData() {
		int count = 0;
		if(checkBD() == true) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Minht\\Downloads\\bs.csv"));
				while((line = br.readLine())!= null) {
					if(count == 0) {
						count++;
						continue;
					}
					else {
						String [] data = line.split(",");
						Doctor d = new Doctor();
						d.setIddoctor(data[0].replaceAll("\"",""));
						d.setIdfaculty(data[1].replaceAll("\"",""));
						d.setName(data[2].replaceAll("\"",""));
						d.setAddress(data[3].replaceAll("\"",""));
						d.setPhone(data[4].replaceAll("\"",""));
						d.setSex(Boolean.parseBoolean(data[5].replaceAll("\"","")));
						d.setBirthday(new SimpleDateFormat("dd-MM-yyyy").parse(data[6].replaceAll("\"","")));
						doctorService.save(d);
					}
					count++;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("There are a few element is null in database or id doctor is exits. Check again id doctor or id faculty!");
		}
	}
	
	// kiểm tra database có phù hợp để insert vào database không
	boolean checkBD() {
		int count = 0;
		List<Doctor> doctors = jdbcTemplate.query("select iddoctor from doctor", new BeanPropertyRowMapper<Doctor>(Doctor.class));
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Minht\\Downloads\\bs.csv"));
			while((line = br.readLine())!= null) {
				//kiểm tra xem có đủ thuộc tính không
				if(count == 0) {
					String [] data = line.split(",");
					Doctor d = new Doctor();
					if(d.getClass().getDeclaredFields().length == data.length)
					{	
						count++;
						continue;
					}
					else
					{
						System.out.println("Number of fields not same!");
						break;
					}
				}
				else {
					String [] data = line.split(",");
					Doctor d = new Doctor();
					d.setIddoctor(data[0].replaceAll("\"",""));
					d.setIdfaculty(data[1].replaceAll("\"",""));
					//Kiểm tra xem iddoctor đã tồn tại hay chưa
					for(Doctor item:doctors) {
						if(item.getIddoctor().equals(d.getIddoctor()) == true)
							return false;
					}
					//Kiểm tra xem iddoctor và idfactory có null không
					if(d.getIddoctor().isEmpty() || d.getIdfaculty().isEmpty())
						return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
