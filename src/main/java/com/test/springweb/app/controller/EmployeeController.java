package com.test.springweb.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springweb.app.model.Employee;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	
	@RequestMapping("/getEmployee")
	public Employee getEmployee(){
		Employee emp = new Employee();
		//emp.setId(id);
		emp.setName("Test");
		return emp;
		
	}

}
