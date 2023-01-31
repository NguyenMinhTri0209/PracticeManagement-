package com.PracticeManagement.Manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PracticeManagement.Manage.model.Employee;
import com.PracticeManagement.Manage.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.getAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeId(@PathVariable String id) {
		return employeeService.getById(id);
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee) + " object is save.";
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmployees(@RequestBody Employee employee, @PathVariable String id) {
		return employeeService.update(employee, id) + " object is update.";
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable String id) {
		return employeeService.delete(id) + " object is delete.";
	}
}
