package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Medicine;

/**
 *	Interface MedicineService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng medicine
 *	@author Nguyễn Minh Trí
 *	@see Medicine
 */

public interface MedicineService {
	/**
	 * Đây là phương thức lưu một đối tượng medicine vào database
	 * @param medicine
	 * @return Lưu đối tượng medicine vào database
	 */
	int save(Medicine medicine);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng medicine trong database
	 * @param medicine Đây là đối tượng medicine cần cập nhật
	 * @param id Đây là idmedicine trong database
	 * @return Cập nhật đối tượng medicine theo idmedicine trong database
	 */
	int update(Medicine medicine, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng medicine trong database
	 * @param id Đây là idmedicine trong database
	 * @return Xóa đối tượng medicine theo idmedicine trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng medicine trong database
	 * @return Danh sách các đối tượng medicine trong database
	 */
	List<Medicine> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng medicine theo idmedicine trong database
	 * @param id Đây là idmedicine trong database
	 * @return  Đối tượng medicine theo idmedicine trong database
	 */
	Medicine getById(String id);
}
