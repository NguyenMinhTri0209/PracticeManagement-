package com.PracticeManagement.Manage.service;

import java.util.List;

import com.PracticeManagement.Manage.model.Employee;

public interface EmployeeService {
	int save(Employee employee);
	
	int update(Employee employee, String id);
	
	int delete(String id);
	
	List<Employee> getAll();
	
	Employee getById(String id);
}
