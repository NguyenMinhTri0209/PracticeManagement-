package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Receiptdtl;

/**
 *	Interface ReceiptdtlService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng receiptdtl
 *	@author Nguyễn Minh Trí
 *	@see Receiptdtl
 */


public interface ReceiptdtlService {
	/**
	 * Đây là phương thức lưu một đối tượng receiptdtl vào database
	 * @param receiptdtl Đây là đối tượng receiptdtl cần lưu
	 * @return Lưu đối tượng receiptdtl vào database
	 */
	int save(Receiptdtl receiptdtl);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng receiptdtl trong database
	 * @param receiptdtl Đây là đối tượng receiptdtl cần cập nhật
	 * @param id Đây là idreceiptdtl trong database
	 * @return Cập nhật đối tượng receiptdtl theo idreceiptdtl trong database
	 */
	int update(Receiptdtl receiptdtl, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng receiptdtl trong database
	 * @param id Đây là idreceiptdtl trong database
	 * @return Xóa đối tượng diasease theo iddiasease trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng receiptdtl trong database
	 * @return Danh sách các đối tượng receiptdtl trong database
	 */
	List<Receiptdtl> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng disease theo iddiasease trong database
	 * @param id Đây là idreceiptdtl trong database
	 * @return Đối tượng receiptdtl theo idreceiptdtl trong database
	 */
	Receiptdtl getById(String id);
}
