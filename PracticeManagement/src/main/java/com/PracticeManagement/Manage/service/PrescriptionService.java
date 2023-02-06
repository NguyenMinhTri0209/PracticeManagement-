package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Prescription;

/**
 *	Interface PrescriptionService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng prescription
 *	@author Nguyễn Minh Trí
 *	@see Prescription
 */

public interface PrescriptionService {
	
	/**
	 * Đây là phương thức lưu một đối tượng prescription vào database
	 * @param prescription Đây là đối tượng prescription cần lưu
	 * @return Lưu đối tượng prescription vào database
	 */
	int save(Prescription prescription);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng prescription trong database
	 * @param prescription Đây là đối tượng prescription cần cập nhật
	 * @param id Đây là idprescription trong database
	 * @return Cập nhật đối tượng prescription theo idprescription trong database
	 */
	int update(Prescription prescription, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng prescription trong database
	 * @param id Đây là idprescription trong database
	 * @return Xóa đối tượng prescription theo idprescription trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng prescription trong database
	 * @return Danh sách các đối tượng prescription trong database
	 */
	List<Prescription> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng prescription theo idprescription trong database
	 * @param id Đây là idprescription trong database
	 * @return Đối tượng prescription theo idprescription trong database
	 */
	Prescription getById(String id);
}
