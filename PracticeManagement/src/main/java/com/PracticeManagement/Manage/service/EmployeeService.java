package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Employee;

/**
 *	Interface EmployeeService mô tả các phương thức là khuôn mẫu các hành động đối với đối tượng Employee
 *	@author Nguyễn Minh Trí
 *	@see Employee
 */

public interface EmployeeService {

	/**
	 * Đây là phương thức lưu một đối tượng employee vào database
	 * @param employee Đây là đối tượng employee cần lưu
	 * @return Lưu đối tượng employee vào database
	 */
	int save(Employee employee);
	
	/**
	 * Đây là phương thức cập nhật lại một đối tượng doctor trong database
	 * @param employee Đây là đối tượng doctor cần cập nhật
	 * @param id Đây là idemployee trong database
	 * @return Cập nhật đối tượng employee theo idemployee trong database
	 */
	int update(Employee employee, String id);
	
	/**
	 * Đây là phương thức xóa một đối tượng employee trong database
	 * @param id Đây là idemployee trong database
	 * @return Xóa đối tượng employee theo idemployee trong databases
	 */
	int delete(String id);
	
	/**
	 * Đây là phương thức lấy các đối tượng employee trong database
	 * @return Danh sách các đối tượng employee trong database
	 */
	List<Employee> getAll();
	
	/**
	 * Đây là phương thức lấy các đối tượng employee theo idemployee trong database
	 * @param id Đây là idemployee trong database
	 * @return Đối tượng employee theo idemployee trong database
	 */
	Employee getById(String id);
}
