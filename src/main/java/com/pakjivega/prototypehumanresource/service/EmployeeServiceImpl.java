package com.pakjivega.prototypehumanresource.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;
import com.pakjivega.prototypehumanresource.bo.dao.EmployeeDao;
import com.pakjivega.prototypehumanresource.bo.dao.impl.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private BasicDao<Employee> employeeDao= null;
	public EmployeeServiceImpl() {
		ClassPathXmlApplicationContext factoria =
		new  ClassPathXmlApplicationContext("contextHumanResource.xml");		
		employeeDao = (BasicDao)factoria.getBean("employeeDAO");
	}
	
	@Override
	public Employee save(Employee employee) {
		return this.employeeDao.save(employee);
	}

	@Override
	public List<Employee> listEmployees() {
		List<Employee> employees = employeeDao.getAll(Employee.class);
		return employees;
	}
	
	@Override
	public void delete(int id) {
		employeeDao.delete(Employee.class, id);
	}

}
