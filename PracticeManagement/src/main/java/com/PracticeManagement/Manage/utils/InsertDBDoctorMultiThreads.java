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
	List<Doctor> doctorList1 = new ArrayList<>();
	List<Doctor> doctorList2 = new ArrayList<>();
	List<Doctor> doctorList3 = new ArrayList<>();
	
	//chia file thành 3 đoạn
	int lm1, lm2;
	
	String path = "C:\\Users\\Minht\\Downloads\\bs.csv";
	
	//get
	public List<Doctor> getDoctorList1() {
		return doctorList1;
	}
	public List<Doctor> getDoctorList2() {
		return doctorList2;
	}
	public List<Doctor> getDoctorList3() {
		return doctorList3;
	}
	
	//insert file darabase.csv vào csdl
	/**
	 * Đây là phương thức đọc thông tin bác sĩ từ file.csv, lưu chúng list và chia thành 3 list nhỏ.
	 * @throws Exception khi dữ liệu lưu không thành công
	 */
	public void readDoctorData() throws Exception {		
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
			throw new Exception("There are a few element is null in database or id doctor is exits. Check again id doctor or id faculty!");
		}
		
		// chia file ra làm 3
		lm1 = (int)(doctorList.size()/3);
		lm2 = (int)(doctorList.size()/3)*2;
		
		doctorList1 = doctorList.subList(0, lm1);
		doctorList2 = doctorList.subList(lm1+1, lm2);
		doctorList3 = doctorList.subList(lm2+1, doctorList.size());
	}
	
	/**
	 * Kiểm tra file.csv có phù hợp để insert vào database không
	 * @return boolean trả về true/false khi kiểm tra file.csv có phù hợp để lưu và database không
	 */
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
		
	/**
	 * Lập trình đa tiến trình không đồng bộ dùng lưu dữ liệu vào database
	 * @param doctorList danh sách các đối tượng doctor cần được lưu
	 * @return null
	 */
	@Async
	public CompletableFuture<String> saveDoctor(List<Doctor> doctorList){
		for(Doctor item:doctorList) {
			doctorService.save(item);
		}
		return null;
	}
}
