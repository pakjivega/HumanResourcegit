package com.pakjivega.prototypehumanresource.bo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pakjivega.prototypehumanresource.HibernateDB;
import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getAllEmployee() {
		SessionFactory sessionFactory = HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Employee> listEmployees = session.createQuery( " from Employee employee").list();
		session.close();
		return listEmployees;
	}

	public Employee getEmployee(int id) {
		SessionFactory sessionFactory = HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		//TODO query by id using parameters
		List<Employee> listEmployees = session.createQuery( " from Employee employee").list();
		session.close();
		return listEmployees.get(0);
	}

	public void updateEmployee(Employee employee) {
		SessionFactory sessionFactory=HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}

	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	
}
