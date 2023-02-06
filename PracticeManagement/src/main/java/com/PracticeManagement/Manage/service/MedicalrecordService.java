package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Medicalrecord;

/**
 *	Interface MedicalrecordService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng medicalrecord
 *	@author Nguyễn Minh Trí
 *	@see Medicalrecord
 */

public interface MedicalrecordService {
	/**
	 * Đây là phương thức lưu một đối tượng medicalrecord vào database
	 * @param medicalrecord Đây là đối tượng medicalrecord cần lưu
	 * @return Lưu đối tượng medicalrecord vào database
	 */
	int save(Medicalrecord medicalrecord);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng medicalrecord trong database
	 * @param medicalrecord Đây là đối tượng medicalrecord cần cập nhật
	 * @param id Đây là idmedicalrecord trong database
	 * @return Cập nhật đối tượng medicalrecord theo idmedicalrecord trong database
	 */
	int update(Medicalrecord medicalrecord, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng medicalrecord trong database
	 * @param id Đây là idmedicalrecord trong database
	 * @return Xóa đối tượng medicalrecord theo idmedicalrecord trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng medicalrecord trong database
	 * @return Danh sách các đối tượng medicalrecord trong database
	 */
	List<Medicalrecord> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng medicalrecord theo iddiasease trong database
	 * @param id Đây là idmedicalrecord trong database
	 * @return Đối tượng medicalrecord theo idmedicalrecord trong database
	 */
	Medicalrecord getById(String id);
}
