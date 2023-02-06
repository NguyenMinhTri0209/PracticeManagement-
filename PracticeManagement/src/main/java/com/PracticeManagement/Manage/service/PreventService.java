package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Prevent;

/**
 *	Interface PreventService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng prevent
 *	@author Nguyễn Minh Trí
 *	@see Prevent
 */

public interface PreventService {
	/**
	 * Đây là phương thức lưu một đối tượng prevent vào database
	 * @param prevent Đây là đối tượng prevent cần lưu
	 * @return Lưu đối tượng prevent vào database
	 */
	int save(Prevent prevent);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng prevent trong database
	 * @param prevent Đây là đối tượng prevent cần cập nhật
	 * @param id Đây là idprevent trong database
	 * @return Cập nhật đối tượng prevent theo idprevent trong database
	 */
	int update(Prevent prevent, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng prevent trong database
	 * @param id Đây là idprevent trong database
	 * @return Xóa đối tượng prevent theo idprevent trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng prevent trong database
	 * @return Danh sách các đối tượng prevent trong database
	 */
	List<Prevent> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng prevent theo idprevent trong database
	 * @param id Đây là idprevent trong database
	 * @return Đối tượng prevent theo idprevent trong database
	 */
	Prevent getById(String id);
}
