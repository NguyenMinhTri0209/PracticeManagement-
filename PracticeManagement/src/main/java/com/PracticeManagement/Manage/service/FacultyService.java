package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Faculty;

/**
 *	Interface FacultyService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng Faculty
 *	@author Nguyễn Minh Trí
 *	@see Faculty
 */

public interface FacultyService {
	/**
	 * Đây là phương thức lưu một đối tượng faculty vào database
	 * @param faculty Đây là đối tượng faculty cần lưu
	 * @return Lưu đối tượng faculty vào database
	 */
	int save(Faculty faculty);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng faculty trong database
	 * @param faculty Đây là đối tượng faculty cần cập nhật
	 * @param id Đây là idfaculty trong database
	 * @return Cập nhật đối tượng faculty theo idfaculty trong database
	 */
	int update(Faculty faculty, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng faculty trong database
	 * @param id Đây là idfaculty trong database
	 * @return Xóa đối tượng faculty theo idfaculty trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng faculty trong database
	 * @return Danh sách các đối tượng faculty trong database
	 */
	List<Faculty> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng faculty theo idfaculty trong database
	 * @param id Đây là idfaculty trong database
	 * @return Đối tượng faculty theo idfaculty trong database
	 */
	Faculty getById(String id);
}
