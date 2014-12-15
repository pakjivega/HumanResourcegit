package com.pakjivega.prototypehumanresource.bo.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pakjivega.prototypehumanresource.HibernateDB;

@Entity
@Table(name = "agency")
public class Agency   {
	@Id
	private int id;
	private String name;

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

//	public static List<Agency> selectAgencies() {
//		SessionFactory sessionFactory = HibernateDB.getSessionFactory();
//		Session session = sessionFactory.openSession();
//		List<Agency> listAgencies = session.createQuery(" from Agency agency")
//				.list();
//		session.close();
//		return listAgencies;
//	}
//	 public void save() {
//	 SessionFactory sessionFactory=HibernateDB.getSessionFactory();
//	 Session session = sessionFactory.openSession();
//	 session.beginTransaction();
//	 session.save(this);
//	 session.getTransaction().commit();
//	
//	 }
}
