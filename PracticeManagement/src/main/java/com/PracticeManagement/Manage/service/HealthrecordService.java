package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Healthrecord;

/**
 *	Interface HealthrecordService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng healthrecord
 *	@author Nguyễn Minh Trí
 *	@see Healthrecord
 */

public interface HealthrecordService {
	/**
	 * Đây là phương thức lưu một đối tượng healthrecord vào database
	 * @param healthrecord Đây là đối tượng healthrecord cần lưu
	 * @return Lưu đối tượng healthrecord vào database
	 */
	int save(Healthrecord healthrecord);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng healthrecord trong database
	 * @param healthrecord Đây là đối tượng healthrecord cần cập nhật
	 * @param id Đây là idhealthrecord trong database
	 * @return Cập nhật đối tượng healthrecord theo idhealthrecord trong database
	 */
	int update(Healthrecord healthrecord, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng healthrecord trong database
	 * @param id Đây là idhealthrecord trong database
	 * @return Xóa đối tượng healthrecord theo idhealthrecord trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng healthrecord trong database
	 * @return Danh sách các đối tượng healthrecord trong database
	 */ 
	List<Healthrecord> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng healthrecord theo idhealthrecord trong database
	 * @param id Đây là idhealthrecord trong database
	 * @return Đối tượng healthrecord theo idhealthrecord trong database
	 */
	Healthrecord getById(String id);
}
