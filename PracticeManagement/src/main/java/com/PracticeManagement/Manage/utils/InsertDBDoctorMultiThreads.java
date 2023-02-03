package com.PracticeManagement.Manage.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.PracticeManagement.Manage.controller.DoctorController;
import com.PracticeManagement.Manage.model.Doctor;
import com.PracticeManagement.Manage.service.DoctorService;

@Service
public class InsertDBDoctorMultiThreads {
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String line = "";
	List<Doctor> doctorList = new ArrayList<>();
	
	//chia file thành 3 đoạn
	int lm1, lm2, lm3;
	
	String path = "C:\\Users\\Minht\\Downloads\\bs.csv";
	
	//get
	public int getLm1() {
		return lm1;
	}
	public int getLm2() {
		return lm2;
	}
	public int getLm3() {
		return lm3;
	}
	
	//insert file darabase.csv vào csdl
	public void readDoctorData() {		
		int count = 0;
		if(checkBD(path) == true) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
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
						doctorList.add(d);
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
		
		// chia file ra làm 3
		lm1 = (int)(doctorList.size()/3);
		lm2 = (int)(doctorList.size()/3)*2;
		lm3 = doctorList.size(); // loi
		
	}
	
	// kiểm tra database có phù hợp để insert vào database không
	boolean checkBD(String path) {
		int count = 0;
		List<Doctor> doctors = jdbcTemplate.query("select iddoctor from doctor", new BeanPropertyRowMapper<Doctor>(Doctor.class));
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
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
		
	//Asynchronous
	@Async
	public CompletableFuture<String> saveDoctor(int lm1, int lm2){
		for(int i = lm1; i < lm2; i++) {
			doctorService.save(doctorList.get(i));
		}
		return null;
	}
}
