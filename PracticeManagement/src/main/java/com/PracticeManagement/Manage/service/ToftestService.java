package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Toftest;

/**
 *	Interface ToftestService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng toftest
 *	@author Nguyễn Minh Trí
 *	@see Toftest
 */

public interface ToftestService {
	/**
	 * Đây là phương thức lưu một đối tượng toftest vào database
	 * @param toftest Đây là đối tượng toftest cần lưu
	 * @return Lưu đối tượng toftest vào database
	 */
	int save(Toftest toftest);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng toftest trong database
	 * @param toftest Đây là đối tượng toftest cần cập nhật
	 * @param id Đây là idtoftest trong database
	 * @return Cập nhật đối tượng toftest theo idtoftest trong database
	 */
	int update(Toftest toftest, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng toftest trong database
	 * @param id Đây là idtoftest trong database
	 * @return Xóa đối tượng toftest theo idtoftest trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng disease trong database
	 * @return Danh sách các đối tượng toftest trong database
	 */
	List<Toftest> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng toftest theo idtoftest trong database
	 * @param id Đây là idtoftest trong database
	 * @return Đối tượng toftest theo idtoftest trong database
	 */
	Toftest getById(String id);
}
