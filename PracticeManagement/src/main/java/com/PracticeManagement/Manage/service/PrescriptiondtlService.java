package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Prescriptiondtl;

/**
 *	Interface PrescriptiondtlService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng Prescriptiondtl
 *	@author Nguyễn Minh Trí
 *	@see Prescriptiondtl
 */

public interface PrescriptiondtlService {
	/**
	 * Đây là phương thức lưu một đối tượng prescriptiondtl vào database
	 * @param prescriptiondtl Đây là đối tượng prescriptiondtl cần lưu
	 * @return Lưu đối tượng prescriptiondtl vào database
	 */
	int save(Prescriptiondtl prescriptiondtl);
	
	/**
	 * Đây là phương thức cập nhật lại thuốc của đối tượng chi tiết hóa đơn (prescriptiondtl) trên hóa đơn thuốc trong database
	 * @param prescriptiondtl Đây là thông tin đối tượng disease cần cập nhật
	 * @param idprescription Đây là idprescription của hóa đơn thuốc muốn cập nhật
	 * @param idmedicine Đây là idmedicine của thuốc cần cập nhật
	 * @return Cập nhật đối tượng prescriptiondtl theo idprescription và idmedicine trong database
	 */
	int update(Prescriptiondtl prescriptiondtl, String idprescription, String idmedicine);
	
	/**
	 * Đây là phương thức xóa đối tượng thuốc (idmedicine) trong chi tiết đơn thuốc (prescriptiondtl) trong database
	 * @param idprescription Đây là idprescription có chi tiết đơn thuốc(prescription) cần xóa
	 * @param idmedicine Đây là idmedicine thuộc hóa đơn chi tiết thuốc muốn xóa
	 * @return
	 */
	int delete(String idprescription, String idmedicine);
	
	/**
	 * Đây là phương thức lấy các đối tượng prescriptiondtl trong database
	 * @return Danh sách các đối tượng prescriptiondtl trong database
	 */
	List<Prescriptiondtl> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng prescriptiondtl theo phiếu thuốc(idprescription) trong database
	 * @param idprescription Đây là idprescription phiếu thuốc cần tìm
	 * @return Danh sách các đối tượng prescriptiondtl theo idprescription trong database
	 */
	List<Prescriptiondtl> getById(String idprescription);
	
	/**
	 * Đây là phương thức lấy các đối tượng prescriptiondtl theo phiếu thuốc (idprescription) và mã thuốc (iddiasease) trong database
	 * @param idprescription Đây là idprescription phiếu thuốc cần tìm
	 * @param idmedicine Đây là idmedicine thuộc hóa đơn chi tiết thuốc cần tìm
	 * @return Danh sách các đối tượng prescriptiondtl theo idprescription và idmedicine trong database
	 */
	Prescriptiondtl getById(String idprescription, String idmedicine);
}
