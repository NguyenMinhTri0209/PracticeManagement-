package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Patient;

/**
 *	Interface PatientService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng Patient
 *	@author Nguyễn Minh Trí
 *	@see Patient
 */

public interface PatientService {
	
	/**
	 * Đây là phương thức lưu một đối tượng patient vào database
	 * @param patient Đây là đối tượng patient cần lưu
	 * @return Lưu đối tượng patient vào database
	 */
	int save(Patient patient);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng patient trong database
	 * @param patient Đây là đối tượng patient cần cập nhật
	 * @param id Đây là idpatient trong database
	 * @return Cập nhật đối tượng patient theo idpatient trong database
	 */
	int update(Patient patient, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng patient trong database
	 * @param id Đây là idpatient trong database
	 * @return Xóa đối tượng patient theo idpatient trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng patient trong database
	 * @return Danh sách các đối tượng patient trong database
	 */
	List<Patient> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng patient theo idpatient trong database
	 * @param id Đây là idpatient trong database
	 * @return Đối tượng patient theo idpatient trong database
	 */
	Patient getById(String id);
	
}
