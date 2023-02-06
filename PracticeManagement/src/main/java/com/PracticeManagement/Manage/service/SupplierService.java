package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Supplier;

/**
 *	Interface SupplierService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng supplier
 *	@author Nguyễn Minh Trí
 *	@see Supplier
 */

public interface SupplierService {
	/**
	 * Đây là phương thức lưu một đối tượng supplier vào database
	 * @param supplier Đây là đối tượng supplier cần lưu
	 * @return  Lưu đối tượng supplier vào database
	 */
	int save(Supplier supplier);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng supplier trong database
	 * @param supplier supplier Đây là đối tượng supplier cần cập nhật.
	 * @param id Đây là idsuppliere trong database
	 * @return
	 */
	int update(Supplier supplier, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng supplier trong database
	 * @param id Đây là idsupplier trong database
	 * @return Xóa đối tượng supplier theo idsupplier trong database
	 */
	int delete(String id);
	
	
	/**
	 * Đây là phương thức lấy các đối tượng supplier trong database
	 * @return Danh sách các đối tượng supplier trong database
	 */
	List<Supplier> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng supplier theo idsupplier trong database
	 * @param id Đây là idsupplier trong database
	 * @return Đối tượng supplier theo idsupplier trong database
	 */
	Supplier getById(String id);
}
