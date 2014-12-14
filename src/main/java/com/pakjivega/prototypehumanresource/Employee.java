package com.pakjivega.prototypehumanresource;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private int id;
	private String name;
	private String agency;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public void save() {
		SessionFactory sessionFactory=HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(this);
		session.getTransaction().commit();
		
	}
	public static List<Employee> selectEmployees() {
		SessionFactory sessionFactory = HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Employee> listEmployees = session.createQuery( " from Employee employee").list();
		session.close();
		return listEmployees;
	}
}
