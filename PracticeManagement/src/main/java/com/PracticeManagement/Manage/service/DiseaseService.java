package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Disease;
import com.PracticeManagement.Manage.model.Doctor;

/**
 *	Interface DiseaseService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng disease
 *	@author Nguyễn Minh Trí
 *	@see Disease
 */

public interface DiseaseService {
	
	/**
	 * Đây là phương thức lưu một đối tượng disease vào database
	 * @param disease Đây là đối tượng disease cần lưu
	 * @return Lưu đối tượng diasease vào database
	 */
	int save(Disease disease);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng disease trong database
	 * @param disease Đây là đối tượng disease cần cập nhật
	 * @param id Đây là iddiasease trong database
	 * @return Cập nhật đối tượng diasease theo iddiasease trong database
	 */
	int update(Disease disease, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng disease trong database
	 * @param id Đây là iddiasease trong database
	 * @return Xóa đối tượng diasease theo iddiasease trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng disease trong database
	 * @return Danh sách các đối tượng diasease trong database
	 */
	List<Disease> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng disease theo iddiasease trong database
	 * @param id Đây là iddiasease trong database
	 * @return Đối tượng diasease theo iddisease trong database
	 */
	Disease getById(String id);
	
}
