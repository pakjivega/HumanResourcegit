package com.pakjivega.prototypehumanresource.bo.dao;

import java.util.List;

import com.pakjivega.prototypehumanresource.bo.bean.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();

	public Employee getEmployee(int id);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Employee employee);
}
