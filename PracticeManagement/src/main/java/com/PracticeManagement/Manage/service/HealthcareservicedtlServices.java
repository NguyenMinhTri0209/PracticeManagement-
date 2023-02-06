package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Healthcareservicedtl;

/**
 *	Interface HealthcareservicedtlServices mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng Healthcareservicedtl
 *	@author Nguyễn Minh Trí
 *	@see Healthcareservicedtl
 */

public interface HealthcareservicedtlServices {
	/**
	 * Đây là phương thức lưu một đối tượng healthcareservicedtl vào database
	 * @param healthcareservicedtl Đây là đối tượng healthcareservicedtl cần lưu
	 * @return Lưu đối tượng healthcareservicedtl vào database
	 */
	int save(Healthcareservicedtl healthcareservicedtl);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng healthcareservicedtl trong database
	 * @param healthcareservicedtl Đây là đối tượng healthcareservicedtl cần cập nhật
	 * @param id Đây là idhealthcareservicedtl trong database
	 * @return Cập nhật đối tượng healthcareservicedtl theo idhealthcareservicedtl trong database
	 */
	int update(Healthcareservicedtl healthcareservicedtl, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng healthcareservicedtl trong database
	 * @param id Đây là idhealthcareservicedtl trong database
	 * @return Xóa đối tượng healthcareservicedtl theo idhealthcareservicedtl trong databases
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng healthcareservicedtl trong database
	 * @return Danh sách các đối tượng healthcareservicedtl trong database
	 */
	List<Healthcareservicedtl> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng faculty theo idfaculty trong database
	 * @param id Đây là idhealthcareservicedtl trong database
	 * @return Đối tượng healthcareservicedtl theo idhealthcareservicedtl trong database
	 */
	List<Healthcareservicedtl> getById(String id);
}
