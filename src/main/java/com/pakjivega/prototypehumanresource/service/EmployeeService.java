package com.pakjivega.prototypehumanresource.service;

import java.util.List;

import com.pakjivega.prototypehumanresource.bo.bean.Employee;

public interface EmployeeService {

	Employee save(Employee employee);
	List<Employee> listEmployees(); 
	void delete(int id);
}
