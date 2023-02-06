package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Disease;
import com.PracticeManagement.Manage.model.Tofprevent;

/**
 *	Interface TofpreventService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng tofprevent
 *	@author Nguyễn Minh Trí
 *	@see Tofprevent
 */

public interface TofpreventService {
	
	/**
	 * Đây là phương thức lưu một đối tượng tofprevent vào database
	 * @param tofprevent Đây là đối tượng tofprevent cần lưu
	 * @return Lưu đối tượng tofprevent vào database
	 */
	int save(Tofprevent tofprevent);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng tofprevent trong database
	 * @param tofprevent Đây là đối tượng tofprevent cần cập nhật
	 * @param id Đây là idtofroom trong database
	 * @return Cập nhật đối tượng tofprevent theo idtofroom trong database
	 */
	int update(Tofprevent tofprevent, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng tofprevent trong database
	 * @param id Đây là idtofroom trong database
	 * @return Xóa đối tượng tofprevent theo idtofroom trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng tofprevent trong database
	 * @return Danh sách các đối tượng tofprevent trong database
	 */
	List<Tofprevent> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng tofprevent theo idtofroom trong database
	 * @param id Đây là idtofroom trong database
	 * @return Đối tượng tofprevent theo idtofroom trong database
	 */
	Tofprevent getById(String id);
	
	/**
	 * Đây là phương thức đổi tiền phòng theo idtofroom trong database
	 * @param tofprevent Đây là đối tượng chứa giá phòng cần cập nhật
	 * @param id Đây là idtofroom trong database
	 */
	void updateCostofRoom(Tofprevent tofprevent, String id);
}
