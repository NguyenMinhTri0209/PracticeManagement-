package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Doctor;

/**
 *	Interface DoctorService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng Doctor
 *	@author Nguyễn Minh Trí
 *	@see Doctor
 */

public interface DoctorService {
	
	/**
	 * Đây là phương thức lưu một đối tượng doctor vào database
	 * @param doctor Đây là đối tượng doctor cần lưu
	 * @return Lưu đối tượng doctor vào database
	 */
	Doctor save(Doctor doctor);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng doctor trong database
	 * @param doctor Đây là đối tượng doctor cần cập nhật
	 * @param id Đây là iddoctor trong database
	 * @return Cập nhật đối tượng doctor theo iddoctor trong database
	 */
	int update(Doctor doctor, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng doctor trong database
	 * @param id Đây là iddoctor trong database
	 * @return Xóa đối tượng doctor theo iddoctor trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng doctor trong database
	 * @return Danh sách các đối tượng doctor trong database
	 */
	List<Doctor> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng doctor theo iddoctor trong database
	 * @param id Đây là iddoctor trong database
	 * @return Đối tượng doctor theo iddoctor trong database
	 */
	Doctor getById(String id);
}

