package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Healthcareservice;

/**
 *	Interface HealthcareserviceService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng Healthcareservice
 *	@author Nguyễn Minh Trí
 *	@see Healthcareservice
 */

public interface HealthcareserviceService {
	/**
	 * Đây là phương thức lưu một đối tượng healthcareservice vào database
	 * @param healthcareservice Đây là đối tượng healthcareservice cần lưu
	 * @return Lưu đối tượng healthcareservice vào database
	 */
	int save(Healthcareservice healthcareservice);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng healthcareservice trong database
	 * @param healthcareservice Đây là đối tượng healthcareservice cần cập nhật
	 * @param id Đây là idhealthcareservice trong database
	 * @return Cập nhật đối tượng healthcareservice theo idhealthcareservice trong database
	 */
	int update(Healthcareservice healthcareservice, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng healthcareservice trong database
	 * @param id Đây là idhealthcareservice trong database
	 * @return Xóa đối tượng healthcareservice theo idhealthcareservice trong databases
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng healthcareservice trong database
	 * @return Danh sách các đối tượng healthcareservice trong database
	 */
	List<Healthcareservice> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng healthcareservice theo idhealthcareservice trong database
	 * @param id Đây là idhealthcareservice trong database
	 * @return Đối tượng healthcareservice theo idhealthcareservice trong database
	 */
	Healthcareservice getById(String id);
}
