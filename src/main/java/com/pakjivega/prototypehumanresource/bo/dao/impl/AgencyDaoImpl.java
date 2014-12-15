package com.pakjivega.prototypehumanresource.bo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pakjivega.prototypehumanresource.HibernateDB;
import com.pakjivega.prototypehumanresource.bo.bean.Agency;
import com.pakjivega.prototypehumanresource.bo.bean.Employee;
import com.pakjivega.prototypehumanresource.bo.dao.AgencyDao;

public class AgencyDaoImpl implements AgencyDao {

	public List<Agency> getAllAgency() {
		SessionFactory sessionFactory = HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Agency> listAgency = session.createQuery( " from Agency agency").list();
		session.close();
		return listAgency;
	}

	public Agency getAgency(int id) {
		SessionFactory sessionFactory = HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		//TODO query by id
		List<Agency> listAgency = session.createQuery( " from Agency agency").list();
		session.close();
		return listAgency.get(0);
	}

	public void updateAgency(Agency agency) {
		SessionFactory sessionFactory=HibernateDB.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(agency);
		session.getTransaction().commit();
	}

	public void deleteAgency(Agency agency) {
		// TODO Auto-generated method stub

	}

}
