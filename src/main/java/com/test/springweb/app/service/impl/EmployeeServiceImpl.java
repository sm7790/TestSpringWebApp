package com.test.springweb.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springweb.app.dao.EmployeeDao;
import com.test.springweb.app.model.Employee;
import com.test.springweb.app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao empdao;
	
	@Override
	public Employee getEmployee(Long id) {

		return empdao.getEmployee(id);
		
	}

	@Override
	public Employee createEmployee(Employee emp) {
		return empdao.saveEmployee(emp);
		
	}

}
