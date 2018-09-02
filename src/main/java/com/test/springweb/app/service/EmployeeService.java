package com.test.springweb.app.service;

import com.test.springweb.app.model.Employee;

public interface EmployeeService {
	
	Employee getEmployee(Long id);
	
	Employee createEmployee(Employee emp);

}
