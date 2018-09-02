package com.test.springweb.app.dao;

import com.test.springweb.app.model.Employee;

public interface EmployeeDao {
	
	Employee getEmployee(Long id);
	
	Employee saveEmployee(Employee emp);

	
}
