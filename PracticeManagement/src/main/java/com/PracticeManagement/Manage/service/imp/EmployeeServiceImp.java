package com.PracticeManagement.Manage.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.PracticeManagement.Manage.model.Employee;
import com.PracticeManagement.Manage.service.EmployeeService;

@Repository
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Employee employee) {
		return jdbcTemplate.update("insert into employee values(?,?,?,?,?,?,?)", new Object[] {employee.getIdemployee(), employee.getName(), employee.getBirthday(), employee.getAddress(), employee.isSex(), employee.getOffice(), employee.getPhone()});
	}

	@Override
	public int update(Employee employee, String id) {
		return jdbcTemplate.update("update employee set name=?, birthday=?, address=?, sex=?, office=?, phone=? where idemployee=?", new Object[] {employee.getName(), employee.getBirthday(), employee.getAddress(), employee.isSex(), employee.getOffice(), employee.getPhone(), id});
	}

	@Override
	public int delete(String id) {
		return jdbcTemplate.update("delete from employee where idemployee=?", id);
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employee = jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper<Employee>(Employee.class));
		return employee;
	}

	@Override
	public Employee getById(String id) {
		return jdbcTemplate.queryForObject("select * from employee where idemployee=?", new BeanPropertyRowMapper<Employee>(Employee.class), id);
	}
	
}
