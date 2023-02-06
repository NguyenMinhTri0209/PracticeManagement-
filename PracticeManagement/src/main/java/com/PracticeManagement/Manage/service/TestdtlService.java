package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Testdtl;

/**
 *	Interface TestdtlService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng testdtl
 *	@author Nguyễn Minh Trí
 *	@see Testdtl
 */

public interface TestdtlService {
	/**
	 * Đây là phương thức lưu một đối tượng testdtl vào database
	 * @param testdtl Đây là đối tượng testdtl cần lưu
	 * @return testdtl diasease vào database
	 */
	int save(Testdtl testdtl);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng disease trong database
	 * @param testdtl Đây là đối tượng testdtl cần cập nhật
	 * @param id Đây là idtestdtl trong database
	 * @return Cập nhật đối tượng testdtl theo idtestdtl trong database
	 */
	int update(Testdtl testdtl, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng testdtl trong database
	 * @param id Đây là idtestdtl trong database
	 * @return Xóa đối tượng testdtl theo idtestdtl trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng testdtl trong database
	 * @return Danh sách các đối tượng testdtl trong database
	 */
	List<Testdtl> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng testdtl theo idtestdtl trong database
	 * @param id Đây là idtestdtl trong database
	 * @return Đối tượng testdtl theo idtestdtl trong database
	 */
	List<Testdtl> getById(String id);
}
