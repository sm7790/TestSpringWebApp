package com.test.springweb.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.springweb.app.model.Employee;
import com.test.springweb.app.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value ="/getEmployee/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") Long eId){
		Employee emp = new Employee();
		emp = empService.getEmployee(eId);
		return emp;
		
	}
	
	@RequestMapping(value ="/createEmployee", method = RequestMethod.POST)
	public Employee getEmployee(Employee emp){
		Employee e= new Employee();
		e = empService.createEmployee(emp);
		return e;
		
	}

}
