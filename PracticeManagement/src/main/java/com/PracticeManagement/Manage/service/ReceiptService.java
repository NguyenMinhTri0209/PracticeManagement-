package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Receipt;

/**
 *	Interface ReceiptService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng receipt
 *	@author Nguyễn Minh Trí
 *	@see Receipt
 */


public interface ReceiptService {
	/**
	 * Đây là phương thức lưu một đối tượng receipt vào database
	 * @param receipt Đây là đối tượng receipt cần lưu
	 * @return Lưu đối tượng receipt vào database
	 */
	int save(Receipt receipt);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng receipt trong database
	 * @param receipt Đây là đối tượng receipt cần cập nhật
	 * @param id Đây là idreceipt trong database
	 * @return Cập nhật đối tượng receipt theo idreceipt trong database
	 */
	int update(Receipt receipt, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng receipt trong database
	 * @param id Đây là idreceipt trong database
	 * @return Xóa đối tượng receipt theo idreceipt trong database
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng receipt trong database
	 * @return Danh sách các đối tượng receipt trong database
	 */
	List<Receipt> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng receipt theo idreceipt trong database
	 * @param id Đây là receipt trong database
	 * @return Đối tượng receipt theo idreceipt trong database
	 */
	Receipt getById(String id);
	
	/**
	 * Đây là phương thức tính tiền hóa đơn theo idreceipt
	 * @param id Đây là receipt trong database
	 * @return Tiền hóa đơn của idreceipt
	 */
	long checkBill(String id);
}
