package com.test.springweb.app.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.springweb.app.dao.EmployeeDao;
import com.test.springweb.app.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Employee getEmployee(Long id) {
		return getCurrentSession().find(Employee.class, id);
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		return (Employee) getCurrentSession().save(emp);
	}
	
	
	

	
	
	protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
