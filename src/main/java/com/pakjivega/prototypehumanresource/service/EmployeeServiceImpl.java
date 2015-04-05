package com.pakjivega.prototypehumanresource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.BasicDao;

@Service
public class EmployeeServiceImpl extends BaseService implements EmployeeService {

	@Autowired
	private BasicDao<Employee> employeeDao;
	public EmployeeServiceImpl() {		
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
