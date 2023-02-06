package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Tofservice;

/**
 *	Interface TofserviceService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng tofservice
 *	@author Nguyễn Minh Trí
 *	@see Tofservice
 */

public interface TofserviceService {
	/**
	 * Đây là phương thức lưu một đối tượng tofservice vào database
	 * @param tofservice Đây là đối tượng tofservice cần lưu
	 * @return Lưu đối tượng tofservice vào database
	 */
	int save(Tofservice tofservice);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng tofservice trong database
	 * @param tofservice Đây là đối tượng tofservice cần cập nhật
	 * @param id Đây là idservice trong database
	 * @return Cập nhật đối tượng tofservice theo idservice trong database
	 */
	int update(Tofservice tofservice, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng tofservice trong database
	 * @param id Đây là idservice trong database
	 * @return Xóa đối tượng tofservice theo idservice trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng tofservice trong database
	 * @return Danh sách các đối tượng tofservice trong database
	 */
	List<Tofservice> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng tofservice theo idservice trong database
	 * @param id Đây là idservice trong database
	 * @return Đối tượng tofservice theo idservice trong database
	 */
	Tofservice getById(String id);
}
